package exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UseRadioButtons extends Application {
	Text text = new Text(50, 50, "Programming is fun");

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		
		// Text
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		paneForText.setStyle("-fx-border-color: black");
		text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 
				FontPosture.REGULAR, 18));
		
		// Buttons to move text 
		HBox paneForButtons = new HBox(10);
		paneForButtons.setAlignment(Pos.CENTER);
		Button left = new Button("<=");
		Button right = new Button("=>");
		paneForButtons.getChildren().addAll(left, right);
		left.setOnAction(e -> text.setX(text.getX() - 10));
		right.setOnAction(e -> text.setX(text.getX() + 10));
		
		
		// Radio Buttons to change color of text
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbBlack = new RadioButton("Black");
		RadioButton rbOrange = new RadioButton("Orange");
		RadioButton rbGreen = new RadioButton("Green");
		
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbBlack.setToggleGroup(group);
		rbOrange.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		
		// Handlers for changing color of text
		rbRed.setOnAction(e ->{
			if(rbRed.isSelected())
				text.setFill(Color.RED);
		});
		
		rbYellow.setOnAction(e ->{
			if(rbYellow.isSelected())
				text.setFill(Color.YELLOW);
		});
		
		rbBlack.setOnAction(e ->{
			if(rbBlack.isSelected())
				text.setFill(Color.BLACK);
		});
		
		rbGreen.setOnAction(e ->{
			if(rbGreen.isSelected())
				text.setFill(Color.GREEN);
		});
		
		rbOrange.setOnAction(e ->{
			if(rbOrange.isSelected())
				text.setFill(Color.ORANGE);
		});
		
		hbox.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
		
		// BorderPane
		BorderPane pane = new BorderPane();
		pane.setTop(hbox);
		pane.setCenter(paneForText);
		pane.setBottom(paneForButtons);
		
		// Set scene
		Scene scene = new Scene(pane);
		primaryStage.setTitle("UseRadioButtons");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
