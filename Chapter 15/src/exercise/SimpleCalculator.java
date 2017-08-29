package exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox1 = new HBox();
		hbox1.setSpacing(10);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2 = new HBox();
		hbox2.setSpacing(10);
		
		Label number1 = new Label("Number 1:");
		Label number2 = new Label("Number 2:");
		Label number3 = new Label("Answer: ");
		
		TextField tf1 = new TextField();
		tf1.setPrefColumnCount(3);
		TextField tf2 = new TextField();
		tf2.setPrefColumnCount(3);
		TextField tf3 = new TextField();
		tf3.setPrefColumnCount(3);
		tf3.setEditable(false);
		
		hbox1.getChildren().addAll(number1, tf1, number2,
				tf2, number3, tf3);
		
		Button add = new Button("Add");
		add.setOnAction(e -> {
			double answer = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
			tf3.setText(answer + "");
		});
		
		Button subtract = new Button("Subtract");
		subtract.setOnAction(e -> {
			double answer = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
			tf3.setText(answer + "");
		});
		
		Button multiply = new Button("Multiply");
		multiply.setOnAction(e -> {
			double answer = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
			tf3.setText(answer + "");
		});
		
		Button divide = new Button("Divide");
		divide.setOnAction(e -> {
			double answer = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
			tf3.setText(answer + "");
		});
		
		hbox2.getChildren().addAll(add, subtract, multiply, divide);
		hbox2.setAlignment(Pos.CENTER);
		
		BorderPane pane = new BorderPane();
		pane.setTop(hbox1);
		pane.setCenter(hbox2);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("SimpleCalculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
