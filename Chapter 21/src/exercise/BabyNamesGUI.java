package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BabyNamesGUI extends Application {
	final int BOYS_NAMES = 1;
	final int GIRLS_NAMES = 3;

	// UI controls
	private Label year = new Label("Select a year:");
	private Label gender = new Label("Boy or girl?");
	private Label lName = new Label("Enter a name:");
	private TextField tfName = new TextField();
	private Button btnRanking = new Button("Find Ranking");
	private ComboBox<String> cbYear = new ComboBox<>();
	private ComboBox<String> cbGender = new ComboBox<>();
	private Label lblResults = new Label("");

	// Array storing values for cbYear
	String[] years = new String[10];

	// Array for male and female
	Map[] male = getNames(BOYS_NAMES);
	Map[] female = getNames(GIRLS_NAMES);

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Populate years array
		for (int i = 0; i < years.length; i++)
			if ((i + 1) < 10)
				years[i] = "200" + (i + 1);
			else
				years[i] = "20" + (i + 1);

		// Add years to cbYear
		ObservableList<String> yearItems = FXCollections.observableArrayList(years);
		cbYear.getItems().addAll(yearItems);

		// Add genders to cbGender
		cbGender.getItems().add("Male");
		cbGender.getItems().add("Female");

		btnRanking.setOnAction(e -> displayRank());

		// GridPane for center of border
		GridPane centerPane = new GridPane();
		centerPane.setHgap(10);
		centerPane.setVgap(10);
		centerPane.setAlignment(Pos.CENTER);

		centerPane.add(year, 0, 0);
		centerPane.add(gender, 0, 1);
		centerPane.add(lName, 0, 2);
		centerPane.add(cbYear, 1, 0);
		centerPane.add(cbGender, 1, 1);
		centerPane.add(tfName, 1, 2);
		centerPane.add(btnRanking, 1, 3);

		// BorderPane
		BorderPane pane = new BorderPane();
		pane.setCenter(centerPane);
		pane.setBottom(lblResults);
		pane.setAlignment(lblResults, Pos.CENTER);

		Scene scene = new Scene(pane, 500, 170);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/** Displays the ranking for the name of the selected year and gender */
	private void displayRank() {
		lblResults.setText(getGender() + " name " + tfName.getText() + " is ranked #" + getRank() + " in year "
				+ cbYear.getValue());
	}

	/* Returns selected gender of boy or girl */
	private String getGender() {
		return cbGender.getValue().equals("Male") ? "Boy" : "Girl";
	}

	/** Returns the ranking for the name of the selected year and gender */
	private String getRank() {
		int year = Integer.parseInt(cbYear.getValue()) - 2001;

		if (cbGender.getValue().equals("Male")) {
			return male[year].get(tfName.getText()) + "";
		} else
			return female[year].get(tfName.getText()) + "";
	}

	/**
	 * Returns an array of Maps storing ranks to names of a specified gender
	 */
	private Map[] getNames(int gender) {
		Map[] array = new Map[10];

		for (int year = 2001, i = 0; year <= 2010 && i < 10; year++, i++) {
			Map<String, String> map = new HashMap<>();
			// Read data from url
			try {
				java.net.URL url = new java.net.URL(
						"http://www.cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt");

				// Create input file from url
				Scanner input = new Scanner(url.openStream());
				while (input.hasNext()) {
					ArrayList<String> list = new ArrayList<>();
					for (int w = 0; w < 5; w++) {
						list.add(w, input.next());
					}
					map.put(list.get(gender), list.get(0));
				}
			} catch (java.net.MalformedURLException ex) {
				System.out.println("Invalid URL");
			} catch (java.io.IOException ex) {
				System.out.println("I/0 Errors: no such file");
			}
			array[i] = map;
		}

		return array;

	}
}
