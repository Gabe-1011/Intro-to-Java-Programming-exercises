package listing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button ("OK"));
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
