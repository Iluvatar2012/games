package crawlerIluvatar2014;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;


class GameKeyListener implements KeyEventDispatcher {

	private boolean up, down, right, left;
	private boolean fup, fdown, fright, fleft;
	
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		
		// First we treat the case a key has been pressed
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			
			// iterate over all possible keys
			if 		(e.getKeyCode() == CoreOptions.MVUP)
				up 		= true;
			else if (e.getKeyCode() == CoreOptions.MVDOWN)
				down 	= true;
			else if (e.getKeyCode() == CoreOptions.MVRIGHT)
				right 	= true;
			else if (e.getKeyCode() == CoreOptions.MVLEFT)
				left 	= true;
			else if (e.getKeyCode() == CoreOptions.FUP)
				fup 	= true;
			else if (e.getKeyCode() == CoreOptions.FDOWN)
				fdown 	= true;
			else if (e.getKeyCode() == CoreOptions.FRIGHT)
				fright 	= true;
			else if (e.getKeyCode() == CoreOptions.FLEFT)
				fleft 	= true;
		}
		
		// Now all release events shall be treated
		else if (e.getID() == KeyEvent.KEY_RELEASED) {
			
			// iterate over all possible keys
			if 		(e.getKeyCode() == CoreOptions.MVUP)
				up 		= false;
			else if (e.getKeyCode() == CoreOptions.MVDOWN)
				down 	= false;
			else if (e.getKeyCode() == CoreOptions.MVRIGHT)
				right 	= false;
			else if (e.getKeyCode() == CoreOptions.MVLEFT)
				left 	= false;
			else if (e.getKeyCode() == CoreOptions.FUP)
				fup 	= false;
			else if (e.getKeyCode() == CoreOptions.FDOWN)
				fdown 	= false;
			else if (e.getKeyCode() == CoreOptions.FRIGHT)
				fright 	= false;
			else if (e.getKeyCode() == CoreOptions.FLEFT)
				fleft 	= false;
		}
		
		// iterate the resulting movement directions, first UP and DOWN movement
		if (up) {
			if (down) {
				GameLogicPlayer.setMVUD(GameLogicPlayer.MV_NONE);
			}
			else 
				GameLogicPlayer.setMVUD(GameLogicPlayer.MV_UP);
		}
		else if (down)
			GameLogicPlayer.setMVUD(GameLogicPlayer.MV_DOWN);
		
		// iterate LEFT and RIGHT movement
		if (right) {
			if (left) {
				GameLogicPlayer.setMVLR(GameLogicPlayer.MV_NONE);
			}
			else
				GameLogicPlayer.setMVLR(GameLogicPlayer.MV_RIGHT);
		}
		else if (left)
			GameLogicPlayer.setMVLR(GameLogicPlayer.MV_LEFT);
		
		// iterate firing directions, first UP and DOWN firing
		if (fup) {
			if (fdown) {
				GameLogicPlayer.setFUD(GameLogicPlayer.F_NONE);
			}
			else 
				GameLogicPlayer.setFUD(GameLogicPlayer.F_UP);
		}
		else if (fdown)
			GameLogicPlayer.setFUD(GameLogicPlayer.F_DOWN);
		
		// iterate LEFT and RIGHT firing
		if (fright) {
			if (fleft) {
				GameLogicPlayer.setFLR(GameLogicPlayer.F_NONE);
			}
			else
				GameLogicPlayer.setFLR(GameLogicPlayer.F_RIGHT);
		}
		else if (fleft)
			GameLogicPlayer.setFLR(GameLogicPlayer.F_LEFT);
		
		// return to caller
		return false;
	}


}
