package listing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

	public static void main(String[] args){
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		
		// Place nodes in pane
		pane.setTop(new CustomPane("Top"));
		pane.setRight(new CustomPane("Right"));
		pane.setBottom(new CustomPane("Button"));
		pane.setLeft(new CustomPane("Left"));
		pane.setCenter(new CustomPane("Center"));
		
		// Create scene
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowBorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
