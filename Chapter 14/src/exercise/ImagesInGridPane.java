package exercise;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImagesInGridPane extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(15, 15, 15, 15));
		pane.setHgap(5.0);
		pane.setVgap(5.0);
		
		// Images
		Image image1 = new Image("image/4.jpg");
		Image image2 = new Image("image/mynationalflag.jpg");
		Image image3 = new Image("image/grapes.gif");
		Image image4 = new Image("image/flag5.gif");
		
		pane.add(new ImageView(image1), 0, 0);
		pane.add(new ImageView(image2), 1, 0);
		pane.add(new ImageView(image3), 0, 1);
		pane.add(new ImageView(image4), 1, 1);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Images in Grid Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
