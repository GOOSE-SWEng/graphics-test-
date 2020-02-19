package graphics;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class CanvasTest {
	public SubScene test(int i) {
		Group root = new Group();
		GridPane gp = new GridPane();
		Canvas canvas = new Canvas(1280,684);
		GraphicsContext gc = canvas.getGraphicsContext2D();	
		drawShapes(gc,i);
		root.getChildren().add(canvas);
		gp.add(root,0,0);
		SubScene CWin = new SubScene(gp,1280,684);
		return (CWin);
	}
	private void drawShapes(GraphicsContext gc,int rot) {
		
		Cube cube = new Cube();
		cube.initialise();
		cube.xRotateCube(Math.PI/8);
		cube.yRotateCube((Math.PI/6)*rot);
		
		Facet facet0 = new Facet();
		Coordinate a = new Coordinate();
		Coordinate b = new Coordinate();
		Coordinate c = new Coordinate();
		
//		Line2 linea = new Line2();
//		Line2 lineb = new Line2();
//		Line2 linec = new Line2();
//		Line2 lined = new Line2();
//		Line2 linee = new Line2();
//		Line2 linef = new Line2();
//		Line2 lineg = new Line2();
//		Line2 lineh = new Line2();
//		Line2 linei = new Line2();
//		Line2 linej = new Line2();
//		Line2 linek = new Line2();
//		Line2 linel = new Line2();
//		
//		lineBetweenPoints(cube.getPoint(0),cube.getPoint(1),gc);
//		lineBetweenPoints(cube.getPoint(0),cube.getPoint(3),gc);
//		lineBetweenPoints(cube.getPoint(0),cube.getPoint(4),gc);
//
//		lineBetweenPoints(cube.getPoint(2),cube.getPoint(3),gc);
//		lineBetweenPoints(cube.getPoint(2),cube.getPoint(1),gc);
//		lineBetweenPoints(cube.getPoint(2),cube.getPoint(6),gc);
//		
//		lineBetweenPoints(cube.getPoint(5),cube.getPoint(4),gc);
//		lineBetweenPoints(cube.getPoint(5),cube.getPoint(6),gc);
//		lineBetweenPoints(cube.getPoint(5),cube.getPoint(1),gc);
//		
//		lineBetweenPoints(cube.getPoint(7),cube.getPoint(4),gc);
//		lineBetweenPoints(cube.getPoint(7),cube.getPoint(6),gc);
//		lineBetweenPoints(cube.getPoint(7),cube.getPoint(3),gc);
		
		
		
		
		
		
		a.setXY(0,0);
		b.setXY(300,300);
		c.setXY(0,300);
		facet0.setPoints(a,b,c);
		
		gc.setStroke(Color.MAGENTA);
		gc.setLineWidth(5);
		
		for (int i = 0; i<12; i++) {
			if (cube.getfacet(i).getNormal().getZ()>=0) {
				gc.setStroke(Color.MAGENTA);
				drawFacet(cube.getfacet(i),gc);
//				lineBetweenPoints(cube.getfacet(i).getPoint(1),cube.getfacet(i).getPoint(2),gc);
//				lineBetweenPoints(cube.getfacet(i).getPoint(2),cube.getfacet(i).getPoint(3),gc);
//				lineBetweenPoints(cube.getfacet(i).getPoint(3),cube.getfacet(i).getPoint(1),gc);
			}
//			else{
//				gc.setStroke(Color.BLUE);
//				drawFacet(cube.getfacet(i),gc);
//			}
		}
		//drawFacet(facet0,gc);
		
		
		
	}
	private void lineBetweenPoints(Coordinate a, Coordinate b, GraphicsContext gc) {
		gc.strokeLine(a.getX()+200,a.getY()+200,b.getX()+200,b.getY()+200);
	}
	private void drawFacet(Facet f, GraphicsContext gc) {
		lineBetweenPoints(f.getPoint(1),f.getPoint(2),gc);
		lineBetweenPoints(f.getPoint(2),f.getPoint(3),gc);
		lineBetweenPoints(f.getPoint(3),f.getPoint(1),gc);
	}
}
