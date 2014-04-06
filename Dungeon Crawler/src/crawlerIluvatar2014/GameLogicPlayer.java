package crawlerIluvatar2014;

import java.awt.KeyboardFocusManager;
import java.util.ArrayList;

class GameLogicPlayer extends GameLogic {
	
	// final variables for identifying movement and firing directions
	static final int MV_NONE 	= 0;
	static final int MV_UP		= 1;
	static final int MV_DOWN	= -1;
	static final int MV_RIGHT	= 1;
	static final int MV_LEFT	= -1;
	
	static final int F_NONE 	= 0;
	static final int F_UP		= 1;
	static final int F_DOWN		= -1;
	static final int F_RIGHT	= 1;
	static final int F_LEFT		= -1;
	
	// private variables determining movement and firing direction
	private static int moveUD	= MV_NONE;
	private static int moveLR	= MV_NONE;
	
	private static int fireUD	= F_NONE;
	private static int fireLR	= F_NONE;
	
	//-------------------------------------------------------------------------------------------------
	// methods for setting private movement variables
	static void setMVUD (int in) {
		moveUD = in;
	}
	
	static void setMVLR (int in) {
		moveLR = in;
	}
	
	// methods for setting private firing direction
	static void setFUD (int in) {
		fireUD = in;
	}
	
	static void setFLR (int in) {
		fireLR = in;
	}
	
	//-------------------------------------------------------------------------------------------------
	private GameKeyListener listener;
	
	GameLogicPlayer (ArrayList<ObjDrawable> initList, GameKeyListener initListener) {
		list 		= initList;
		listener 	= initListener;
	}

	//-------------------------------------------------------------------------------------------------
	
	// Override run method from interface Runnable, enables threading 
	@Override
	public void run() {
		
		while (Game.running) {
			// TODO: do cool shit...
		}
		
		// kill the key listener used for the game
		KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(listener);
	}
}
