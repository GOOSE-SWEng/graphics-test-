package graphics;

import java.util.ArrayList;

public class Cube {
	private ArrayList<Coordinate> points = new ArrayList<Coordinate>();
	ArrayList<Coordinate> Points = new ArrayList<Coordinate>();
	ArrayList<Coordinate> normals = new ArrayList<Coordinate>();
	ArrayList<Facet> facets = new ArrayList<Facet>();
	
	Coordinate pointa = new Coordinate();
	Coordinate pointb = new Coordinate();
	Coordinate pointc = new Coordinate();
	Coordinate pointd = new Coordinate();
	Coordinate pointe = new Coordinate();
	Coordinate pointf = new Coordinate();
	Coordinate pointg = new Coordinate();
	Coordinate pointh = new Coordinate();
	
	Coordinate normala = new Coordinate();
	Coordinate normalb = new Coordinate();
	Coordinate normalc = new Coordinate();
	Coordinate normald = new Coordinate();
	Coordinate normale = new Coordinate();
	Coordinate normalf = new Coordinate();
	
	
	
	
	
	public void initialise() {
		
		normals.add(normala);
		normals.add(normalb);
		normals.add(normalc);
		normals.add(normald);
		normals.add(normale);
		normals.add(normalf);
		
		for (int i = 0; i<8; i++) {
			Points.add(new Coordinate());
		}
		for (int l = 0; l<12; l++) {
			facets.add(new Facet());
		}
		
		Points.get(0).setXYZ(-100,-100,-100);
		Points.get(1).setXYZ(100,-100,-100);
		Points.get(2).setXYZ(100,100,-100);
		Points.get(3).setXYZ(-100,100,-100);
		Points.get(4).setXYZ(-100,-100,100);
		Points.get(5).setXYZ(100,-100,100);
		Points.get(6).setXYZ(100,100,100);
		Points.get(7).setXYZ(-100,100,100);
		
		normala.setXYZ(0,0,-1);
		normalb.setXYZ(1,0,0);
		normalc.setXYZ(0,0,1);
		normald.setXYZ(-1,0,0);
		normale.setXYZ(0,-1,0);
		normalf.setXYZ(0,1,0);
		
		Points.add(normala);
		Points.add(normalb);
		Points.add(normalc);
		Points.add(normald);
		Points.add(normale);
		Points.add(normalf);
		
		
		
		facets.get(0).setPoints(Points.get(0),Points.get(1),Points.get(3));
		facets.get(0).setNormal(normala);
		facets.get(1).setPoints(Points.get(2),Points.get(1),Points.get(3));
		facets.get(1).setNormal(normala);
		//normal = 0,-1,0
		facets.get(2).setPoints(Points.get(1),Points.get(2),Points.get(5));
		facets.get(2).setNormal(normalb);
		facets.get(3).setPoints(Points.get(2),Points.get(5),Points.get(6));
		facets.get(3).setNormal(normalb);
		//normal = 1,0,0
		facets.get(4).setPoints(Points.get(4),Points.get(5),Points.get(7));
		facets.get(4).setNormal(normalc);
		facets.get(5).setPoints(Points.get(7),Points.get(5),Points.get(6));
		facets.get(5).setNormal(normalc);
		//normal = 0,1,0
		facets.get(6).setPoints(Points.get(4),Points.get(0),Points.get(7));
		facets.get(6).setNormal(normald);
		facets.get(7).setPoints(Points.get(7),Points.get(3),Points.get(0));
		facets.get(7).setNormal(normald);
		//-1,0,0
		facets.get(8).setPoints(Points.get(5),Points.get(4),Points.get(1));
		facets.get(8).setNormal(normale);
		facets.get(9).setPoints(Points.get(4),Points.get(0),Points.get(1));
		facets.get(9).setNormal(normale);
		//0,0,-1
		facets.get(10).setPoints(Points.get(6),Points.get(2),Points.get(3));
		facets.get(10).setNormal(normalf);
		facets.get(11).setPoints(Points.get(6),Points.get(7),Points.get(3));
		facets.get(11).setNormal(normalf);
		//0,0,1
		
		pointa.setXYZ(-100,-100,-100);
		pointb.setXYZ(100,-100,-100);
		pointc.setXYZ(100,100,-100);
		pointd.setXYZ(-100,100,-100);
		pointe.setXYZ(-100,-100,100);
		pointf.setXYZ(100,-100,100);
		pointg.setXYZ(100,100,100);
		pointh.setXYZ(-100,100,100);
		
		
		
		
		points.add(pointa);
		points.add(pointb);
		points.add(pointc);
		points.add(pointd);
		points.add(pointe);
		points.add(pointf);
		points.add(pointg);
		points.add(pointh);
		
		for (int i = 0; i<8; i++) {
			points.get(i).printXYZ();
		}
		
	}
	
	public void zRotateFacet(double angle) {
		for (int i = 0; i<4; i++) {
			
		}
	}
	
	public void zRotateCube(double angle) {
		for (int i = 0; i<14;i++) {
			double x = Points.get(i).getX();
			double y = Points.get(i).getY();
			double z = Points.get(i).getZ();
			double x2 = (x*Math.cos(angle)-(y*Math.sin(angle)));
			double y2 = (x*Math.sin(angle)+(y*Math.cos(angle)));
			double z2 = z;
			Points.get(i).setXYZ(x2,y2,z2);
		}
		
		for (int i = 0; i<14; i++) {
			Points.get(i).printXYZ();
		}
	}
	public void xRotateCube(double angle) {
		for (int i = 0; i<14; i++) {
			double x = Points.get(i).getX();
			double y = Points.get(i).getY();
			double z = Points.get(i).getZ();
			double x2 = x;
			double y2 = (y*Math.cos(angle)-(z*Math.sin(angle)));
			double z2 = (y*Math.sin(angle)+(z*Math.cos(angle)));
			Points.get(i).setXYZ(x2,y2,z2);
		}
	}
	
	public void yRotateCube(double angle) {
		for (int i = 0; i<14; i++) {
			double x = Points.get(i).getX();
			double y = Points.get(i).getY();
			double z = Points.get(i).getZ();
			double x2 = (x*Math.cos(angle)+(z*Math.sin(angle)));
			double y2 = y;
			double z2 = (x*Math.sin(angle)-(z*Math.cos(angle)));
			Points.get(i).setXYZ(x2,y2,z2);
		}
//		facets.get(0).setNormal(normala);
//		facets.get(1).setNormal(normala);
//		facets.get(2).setNormal(normalb);
//		facets.get(3).setNormal(normalb);
//		facets.get(4).setNormal(normalc);
//		facets.get(5).setNormal(normalc);
//		facets.get(6).setNormal(normald);
//		facets.get(7).setNormal(normald);
//		facets.get(8).setNormal(normale);
//		facets.get(9).setNormal(normale);
//		facets.get(10).setNormal(normalf);
//		facets.get(11).setNormal(normalf);
//		
		for (int i = 0; i<14; i++) {
			Points.get(i).printXYZ();
		}
	}
	public Coordinate getPoint(int i) {
		Coordinate temp = new Coordinate();
		temp.setX(Points.get(i).getX());
		temp.setY(Points.get(i).getY());
		temp.setZ(Points.get(i).getZ());
		
		double tempX = temp.getX();
		double tempY = temp.getY();
		double tempz = temp.getZ();
		temp.setX(tempX);
		temp.setY(tempY);
		temp.printXYZ();
		return(temp);
	}
	public Facet getfacet(int i) {
		return(facets.get(i));
	}
	
}
