package crawlerIluvatar2014;

abstract class ObjGameObjects extends ObjDrawable {
	// all game objects have a position and a dimension
	protected double x, y, width, heigth;
	
	// getters for protected variables
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return heigth;
	}
	
	// setters for protected variables
	void setX(double inX) {
		x = inX;
	}
	
	void setY(double inY) {
		y = inY;
	}
	
	void setWidth(double inWidth) {
		width = inWidth;
	}
	
	void setHeigth(double inHeigth) {
		heigth = inHeigth;
	}
}
