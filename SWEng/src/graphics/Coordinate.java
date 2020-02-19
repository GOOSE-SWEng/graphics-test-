package graphics;

public class Coordinate {
	private double x;
	private double y;
	private double z = 0;
	public void coordinate(double x, double y, double z) {
		setXYZ(x,y,z);
	}
	public void setXY(double xtemp, double ytemp) {
		setX(xtemp);
		setY(ytemp);
	}
	public void setXYZ(double xtemp, double ytemp, double ztemp) {
		setXY(xtemp,ytemp);
		setZ(ztemp);
	}
	public void setX(double xtemp) {
		this.x = xtemp;
	}
	public void setY(double ytemp) {
		this.y = ytemp;
	}
	public void setZ(double ztemp) {
		this.z = ztemp;
	}
	public double getX() {
		return(x);
	}
	public double getY() {
		return(y);
	}
	public double getZ() {
		return(z);
	}
	public void printXYZ() {
		System.out.println(x+ "		"+ y + "	" + z);	
	}
	
}
