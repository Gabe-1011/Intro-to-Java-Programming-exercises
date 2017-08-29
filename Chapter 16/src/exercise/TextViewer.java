package exercise;

import java.io.File;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextViewer extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Bottom of pane
		HBox paneForBottom = new HBox(10);
		paneForBottom.setAlignment(Pos.CENTER);
		Button view = new Button("View");
		TextField tf = new TextField();
		paneForBottom.getChildren().addAll(new Label("Filename"), tf, view);

		// Scroll bar and text area
		ScrollBar sbHorizontal = new ScrollBar();
		ScrollBar sbVertical = new ScrollBar();
		sbVertical.setOrientation(Orientation.VERTICAL);
		
		FlowPane paneForText = new FlowPane();
		view.setOnAction(e -> {
			File file = new File(tf.getText());
			if (!file.exists()) {
				System.out.println(file + " does not exist.");
			}
			
			Scanner input = null;
			try {
				input = new Scanner(file);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				while(input.hasNext()){
					String line = input.nextLine();
					paneForText.getChildren().add(new Text(line));
				}
		});
		
		BorderPane pane = new BorderPane();
		pane.setTop(paneForText);
		pane.setRight(sbVertical);
		pane.setCenter(sbHorizontal);
		pane.setBottom(paneForBottom);
		
		Scene scene = new Scene(pane, 570, 100);
		primaryStage.setTitle("TextViewer");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
