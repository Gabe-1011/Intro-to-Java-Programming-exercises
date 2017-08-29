package exercise;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrafficLight extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		Rectangle rectangle = new Rectangle(30, 120);
		rectangle.setFill(Color.WHITE);
		Circle redCircle = new Circle(15);
		Circle yellowCircle = new Circle(15);
		Circle greenCircle = new Circle(15);
		redCircle.setFill(Color.WHITE);
		yellowCircle.setFill(Color.WHITE);
		greenCircle.setFill(Color.WHITE);
		redCircle.setStroke(Color.BLACK);
		yellowCircle.setStroke(Color.BLACK);
		greenCircle.setStroke(Color.BLACK);
		
		vbox.getChildren().addAll(redCircle, yellowCircle, greenCircle);
		pane.getChildren().addAll(rectangle, vbox);
		
		// Radio Buttons
		HBox paneForButtons = new HBox(10);
		paneForButtons.setAlignment(Pos.CENTER);
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbGreen = new RadioButton("Green");
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		
		rbRed.setOnAction(e -> {
			if(rbRed.isSelected()){
				yellowCircle.setFill(Color.WHITE);
				greenCircle.setFill(Color.WHITE);
				redCircle.setFill(Color.RED);
			}
		});
		
		rbGreen.setOnAction(e -> {
			if(rbGreen.isSelected()){
				yellowCircle.setFill(Color.WHITE);
				greenCircle.setFill(Color.GREEN);
				redCircle.setFill(Color.WHITE);
			}
		});
		
		rbYellow.setOnAction(e -> {
			if(rbYellow.isSelected()){
				yellowCircle.setFill(Color.YELLOW);
				greenCircle.setFill(Color.WHITE);
				redCircle.setFill(Color.WHITE);
			}
		});
		
		paneForButtons.getChildren().addAll(rbRed, rbYellow, rbGreen);
		
		// BorderPane
		BorderPane mainPane = new BorderPane();
		mainPane.setCenter(pane);
		mainPane.setBottom(paneForButtons);
		
		Scene scene = new Scene(mainPane, 500, 170);
		primaryStage.setTitle("TrafficLight");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
