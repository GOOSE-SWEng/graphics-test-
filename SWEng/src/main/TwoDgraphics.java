package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import graphics.Coordinate;
import graphics.Facet;
import graphics.Line2;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tools.*;

public class TwoDgraphics {
	
	public SubScene creategraphicsWindow(double x,double y) {
		Canvas canvas = new Canvas(1200,700);
		GridPane gp = new GridPane();
		Facet facet = new Facet();
		Line2 line0 = new Line2();
		Line2 line1 = new Line2();
		Line2 line2 = new Line2();
		Line2 line3 = new Line2();
		
		Coordinate a = new Coordinate();
		Coordinate b = new Coordinate();
		Coordinate c = new Coordinate();
		line0.setPosition(0f,0f,1200f,0f);
		line1.setPosition(1200f,0f,1200f,500f);
		line2.setPosition(1200f,500f,0f,500f);
		line3.setPosition(0f,500f,0f,0f);
		
		a.setXY(0,0);
		b.setXY(300,300);
		c.setXY(100,300);
		facet.setPoints(a,b,c);
		gp.add(canvas,0,0);
//		for(int i = 1; i<4;i++) {
//			gp.add(facet.getLine(i),0,0);
//		}
		gp.add(line0,0,0);
		gp.add(line1,0,0);
		gp.add(line2,0,0);
		gp.add(line3,0,0);
		
		SubScene GWin = new SubScene(gp,x,y);
		return(GWin);
	}
}




