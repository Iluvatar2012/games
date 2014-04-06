package crawlerIluvatar2014;

import java.awt.Graphics2D;
import java.awt.Image;

abstract class ObjDrawable {
	// the image to be drawn by the specific object
	protected Image picture;
	
	// all drawables need to implement a draw() method
	abstract void draw(Graphics2D g2d);
}
