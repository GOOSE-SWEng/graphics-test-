package graphics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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

public class Line2 extends Line {
	public void setPosition(double x1,double y1,double x2,double y2) {
		setStartX(x1);
		setStartY(y1);
		setEndX(x2);
		setEndY(y2);
	}
	public void setPositionC(Coordinate a, Coordinate b) {
		setStartX(a.getX());
		setStartY(a.getY());
		setEndX(b.getX());
		setEndY(b.getY());
	}
	public void setPositionCAdd(Coordinate a, Coordinate b) {
		setStartX(a.getX()+200);
		setStartY(a.getY()+200);
		setEndX(b.getX()+200);
		setEndY(b.getY()+200);
	}
}
