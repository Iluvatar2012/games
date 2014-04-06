package crawlerIluvatar2014;

import java.util.ArrayList;

class GameLogicEnemy extends GameLogic{
		
	// setter for the list of all game objects
	GameLogicEnemy (ArrayList<ObjDrawable> inList) {
		list = inList;
	}

	// Override run method from interface Runnable, enables threading 
	@Override
	public void run() {
		while (Game.running) {
			// TODO: do cool shit...
		}		
	}

}
