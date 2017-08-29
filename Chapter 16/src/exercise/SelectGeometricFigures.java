package exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SelectGeometricFigures extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox paneForButtons = new HBox(10);
		paneForButtons.setAlignment(Pos.CENTER);
		
		// Radio Buttons
		RadioButton rbCircle = new RadioButton("Circle");
		RadioButton rbRectangle = new RadioButton("Rectangle");
		RadioButton rbEllipse = new RadioButton("Ellipse");
		ToggleGroup group = new ToggleGroup();
		rbCircle.setToggleGroup(group);
		rbRectangle.setToggleGroup(group);
		rbEllipse.setToggleGroup(group);
		CheckBox cbFill = new CheckBox("Fill");
		
		paneForButtons.getChildren().addAll(rbCircle, rbRectangle,
				rbEllipse, cbFill);
		
		// Pane for shapes
		StackPane paneForShapes = new StackPane();
		paneForShapes.setStyle("-fx-border-color: black");
		Circle circle = new Circle(50);
		Rectangle rectangle = new Rectangle(70, 40);
		Ellipse ellipse = new Ellipse(50, 50, 50, 25);
		circle.setFill(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		ellipse.setFill(Color.WHITE);
		
		// Handlers
		rbCircle.setOnAction(e -> {
			if(rbCircle.isSelected()){
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(circle);
			}
		});
		
		rbRectangle.setOnAction(e -> {
			if(rbRectangle.isSelected()){
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(rectangle);
			}
		});
		
		rbEllipse.setOnAction(e -> {
			if(rbEllipse.isSelected()){
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(ellipse);
			}
		});
		
		cbFill.setOnAction(e -> {
			if (cbFill.isSelected()) {
				circle.setFill(Color.BLACK);
				rectangle.setFill(Color.BLACK);
				ellipse.setFill(Color.BLACK);
			} else {
				circle.setFill(Color.WHITE);
				rectangle.setFill(Color.WHITE);
				ellipse.setFill(Color.WHITE);			}
		});
		
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		pane.setCenter(paneForShapes);
		
		Scene scene = new Scene(pane, 500, 170);
		primaryStage.setTitle("SetGeometricShape");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
