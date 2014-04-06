package crawlerIluvatar2014;

import java.util.ArrayList;

abstract class GameLogic implements Runnable {
	
	protected ArrayList<ObjDrawable> list;

	@Override
	abstract public void run();

}
