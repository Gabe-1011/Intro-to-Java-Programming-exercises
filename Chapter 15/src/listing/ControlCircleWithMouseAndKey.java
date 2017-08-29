package listing;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application {
		private CirclePane circlePane = new CirclePane();
		
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hbox.getChildren().addAll(btEnlarge, btShrink);
		
		// Create and register the handler
		btEnlarge.setOnAction(e -> circlePane.enlarge());
		btShrink.setOnAction(e -> circlePane.shrink());
		
		circlePane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				circlePane.enlarge();
			
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				circlePane.shrink();
			}
		});
		
		circlePane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.U) {
				circlePane.enlarge();
			}
			else if (e.getCode() == KeyCode.D) {
				circlePane.shrink();
			}
		});
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hbox);
		BorderPane.setAlignment(hbox, Pos.CENTER);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		circlePane.requestFocus(); // Request focus on circlePane
		
	}

}
