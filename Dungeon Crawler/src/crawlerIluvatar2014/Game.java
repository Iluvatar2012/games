package crawlerIluvatar2014;

import java.awt.KeyboardFocusManager;
import java.util.ArrayList;

class Game {
	
	// Identifiers for different playable characters
	static final int AIKO 		= 1;
	static final int BENE 		= 2;
	static final int LUKAS 		= 3;
	static final int SEBASTIAN 	= 4;
	static final int AEFFCHEN 	= 5;
	
	static int character;
	
	static boolean running;
	
	//-------------------------------------------------------------------------------------------------
	
	GameLogicPlayer playerLogic;
	GameLogicEnemy 	enemyLogic;
	GameKeyListener listener;
	GameDrawer		drawer;
	
	// Initiates a new single player game
	static void initNewSingleGame() {
		// build a new ArrayList containing all relevant objects of the game
		ArrayList<ObjDrawable> list = new ArrayList<ObjDrawable>();
		
		// TODO: add the first room of the current level and the figure to the AL
		// TODO: give the figure to the player logic
		
		// build new logic, listener and graphics objects, give the ArrayList in the constructor
		GameKeyListener listener	= new GameKeyListener();
		GameLogicPlayer playerLogic = new GameLogicPlayer(list, listener);
		GameLogicEnemy 	enemyLogic 	= new GameLogicEnemy(list);
		GameDrawer		drawer		= new GameDrawer(list);
		
		// set the currently used key listener
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(listener);
		
		// set running variable to true for all threads to continue execution
		running = true;
		
		// build new Threads and start the game
		new Thread(playerLogic).start();
		new Thread(enemyLogic).start();
		new Thread(drawer).start();
	}
}
