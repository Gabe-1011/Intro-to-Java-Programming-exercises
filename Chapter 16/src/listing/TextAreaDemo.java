package listing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		DescriptionPane descriptionPane = new DescriptionPane();
		
		// Set title, text, and image in the description pane
		descriptionPane.setTitle("Canada");
		String description = "The Canadian national flag ...";
		descriptionPane.setImageView(new ImageView("image/ca.gif"));
		descriptionPane.setDescription(description);
		
		Scene scene = new Scene(descriptionPane, 450, 200);
		primaryStage.setTitle("TextAreaDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
