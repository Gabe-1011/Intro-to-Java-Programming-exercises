package exercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StoreNumbersLinkedList extends Application {
	private Button sort = new Button("Sort");
	private Button shuffle = new Button("Shuffle");
	private Button reverse = new Button("Reverse");
	
	private TextField tfNum = new TextField();
	private LinkedList<Integer> list = new LinkedList<>();

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Designing the GUI

		// TextArea
		TextArea ta = new TextArea();
		ta.setEditable(false);
		
		// HBox for buttons
		HBox paneForButtons = new HBox(10);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(sort, shuffle, reverse);
		
		// HBox for top
		HBox topPane = new HBox(10);
		topPane.setAlignment(Pos.CENTER);
		topPane.getChildren().addAll(new Label("Enter a number: "),
				tfNum);
		
		// Handler for TextField
		tfNum.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.ENTER){
				ta.appendText(tfNum.getText() + " ");
				int newNumber = Integer.parseInt(tfNum.getText());
				list.add(newNumber);
				tfNum.clear();
			}
		});
		
		// Handler for buttons
		sort.setOnAction(e -> sortList(list, ta));
		shuffle.setOnAction(e -> shuffleList(list, ta));
		reverse.setOnAction(e -> reverseList(list, ta));
		

		// Create border pane
		BorderPane pane = new BorderPane();
		pane.setTop(topPane);
		pane.setCenter(ta);
		pane.setBottom(paneForButtons);
		
		Scene scene = new Scene(pane, 500, 170);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void sortList(LinkedList<Integer> list, TextArea ta){
		Collections.sort(list);
		
		ta.clear();
		ListIterator<Integer> listIterator = (ListIterator<Integer>) list.iterator();
		while(listIterator.hasNext()){
			ta.appendText(listIterator.next() + " ");
		}
	}
	
	public static void shuffleList(LinkedList<Integer> list, TextArea ta){
		Collections.shuffle(list);
		
		ta.clear();
		ListIterator<Integer> listIterator = (ListIterator<Integer>) list.iterator();
		while(listIterator.hasNext()){
			ta.appendText(listIterator.next() + " ");
		}
	}
	
	public static void reverseList(LinkedList<Integer> list, TextArea ta){
		Collections.sort(list, Collections.reverseOrder());
		
		ta.clear();
		ListIterator<Integer> listIterator = (ListIterator<Integer>) list.iterator();
		while(listIterator.hasNext()){
			ta.appendText(listIterator.next() + " ");
		}
	}

}
