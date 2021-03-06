package listing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipse extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		for(int i = 0; i < 16; i++){
			Ellipse e1 = new Ellipse(150, 100, 100, 50);
			e1.setStroke(Color.color(Math.random(), Math.random(),
					Math.random()));
			e1.setFill(Color.WHITE);
			e1.setRotate(i * 180 / 16);
			pane.getChildren().add(e1);
		}
		
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setTitle("ShowEllipse"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

}
