package exercise;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorAndFont extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox pane = new HBox(15);
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setAlignment(Pos.CENTER);
		
		// Place nodes in pane
		Text text = new Text(50, 100, "JavaFX");
		text.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text.setRotate(90.0);
		text.setFill(Color.color(Math.random(), Math.random(),
				Math.random(), Math.random()));
		
		Text text2 = new Text(50, 100, "JavaFX");
		text2.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text2.setRotate(90.0);
		text2.setFill(Color.color(Math.random(), Math.random(),
				Math.random(), Math.random()));
		
		Text text3 = new Text(50, 100, "JavaFX");
		text3.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text3.setRotate(90.0);
		text3.setFill(Color.color(Math.random(), Math.random(),
				Math.random(), Math.random()));
		
		Text text4 = new Text(50, 100, "JavaFX");
		text4.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text4.setRotate(90.0);
		text4.setFill(Color.color(Math.random(), Math.random(),
				Math.random(), Math.random()));
		
		Text text5 = new Text(50, 100, "JavaFX");
		text5.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text5.setRotate(90.0);
		text5.setFill(Color.color(Math.random(), Math.random(),
				Math.random(), Math.random()));
		
		pane.getChildren().addAll(text, text2, text3, text4, text5);
		
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
