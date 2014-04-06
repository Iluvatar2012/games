package crawlerIluvatar2014;

abstract class ObjMovable extends ObjGameObjects {
	// moveable objects have a speed
	protected double v_x, v_y;
	
	// getters for protected variables
	double getVX() {
		return v_x;
	}
	
	double getVY() {
		return v_y;
	}
	
	// setters for protected variables
	void setVX(double inVX) {
		v_x = inVX;
	}
	
	void setVY(double inVY) {
		v_y = inVY;
	}	
}
