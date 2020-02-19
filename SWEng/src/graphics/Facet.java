package graphics;

import java.util.ArrayList;

public class Facet {
	private Coordinate a = new Coordinate();
	private Coordinate b = new Coordinate();
	private Coordinate c = new Coordinate();
	private Coordinate normal = new Coordinate();
	
	ArrayList<Coordinate> points = new ArrayList<Coordinate>();
	
	private Line2 linea = new Line2();
	private Line2 lineb = new Line2();
	private Line2 linec = new Line2();
	
	
	
	
	public void setPoint(Coordinate point, int p) {
		linea.setPositionC(a,b);
		if (p ==1) {
			a = point;
		}
		else if (p ==2) {
			b = point;
		}
		else if (p == 3) {
			c = point;
		}
		else {}
	}
	public void setPoints(Coordinate a, Coordinate b, Coordinate c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public Coordinate getPoint(int p) {
		if (p==1) {
			return(a);
		}
		else if(p==2) {
			return(b);
		}
		else if(p==3) {
			return(c);
		}
		else {
			return(null);
		}
	}
	public Line2 getLine(int k) {
		if (k == 1) {
			linea.setPositionC(a,b);
			return(linea);
		}
		else if (k ==2) {
			lineb.setPositionC(b,c);
			return(lineb);
		}
		else if (k ==3) {
			linec.setPositionC(c,a);
			return(linec);
		}
		else{
			return(null);
		}
	}
	public Coordinate getNormal() {
		return(normal);
	}
	public void setNormal(Coordinate norm) {
		this.normal = norm;
	}
		
}
