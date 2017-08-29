package exercise;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(15, 15, 15, 15));
		pane.setHgap(5.0);
		pane.setVgap(5.0);
		pane.setAlignment(Pos.CENTER);
		
		pane.add(new ImageView (getImage()), 0, 0);
		pane.add(new ImageView (getImage()), 1, 0);
		pane.add(new ImageView (getImage()), 2, 0);
		pane.add(new ImageView (getImage()), 0, 1);
		pane.add(new ImageView (getImage()), 1, 1);
		pane.add(new ImageView (getImage()), 2, 1);
		pane.add(new ImageView (getImage()), 0, 2);
		pane.add(new ImageView (getImage()), 1, 2);
		pane.add(new ImageView (getImage()), 2, 2);
		
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public Image getImage(){
		int randomNumber = (int)(Math.random() * 3);
		Image image = null;
		
		switch(randomNumber){
		case 1:	image = new Image("image/x.gif");
				break;
		case 2: image = new Image("image/o.gif");
				break;
		}
		
		return image;
	}

}
