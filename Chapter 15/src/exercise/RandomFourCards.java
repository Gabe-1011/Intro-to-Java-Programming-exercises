package exercise;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RandomFourCards extends Application {
	private ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setPadding(new Insets(10, 12, 13, 11));
		hbox.setAlignment(Pos.CENTER);

		fillList();
		
		generateFourCards(hbox);

		Button refresh = new Button("Refresh");
		refresh.setOnAction(e -> {
			hbox.getChildren().clear();
			fillList();
			generateFourCards(hbox);
		});
		
		refresh.setAlignment(Pos.BOTTOM_RIGHT);
		BorderPane pane = new BorderPane();
		pane.setTop(hbox);
		pane.setCenter(refresh);
		
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("GenerateFourCards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void fillList() {
		for (int i = 0; i < 52; i++) {
			list.add(i + 1);
		}

		shuffleList(list);
	}

	public void shuffleList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int currentIndex = list.indexOf(list.get(i));
			int newIndex = (int) (Math.random() * 52);
			list.add(newIndex, list.get(currentIndex));
			list.remove(list.get(currentIndex));
		}
	}

	public void generateFourCards(HBox hbox) {
		for (int i = 0; i < 4; i++) {
			int currentIndex = list.get(i);
			hbox.getChildren().add(new ImageView("image/card/" + currentIndex + ".png"));
		}
	}

}
