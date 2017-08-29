package listing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowLine extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new LinePane(), 200, 200);
		primaryStage.setTitle("ShowLine"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

}
