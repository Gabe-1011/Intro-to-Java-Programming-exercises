package exercise;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentValueCalculator extends Application {

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
		
		Label investmentAmount = new Label("Investment Amount:");
		Label numOfYears = new Label("Number of Years:");
		Label annualInterestRate = new Label("Annual Interest Rate:");
		Label futureValue = new Label("Future value:");
		
		TextField investmentText = new TextField();
		TextField numOfYearsText = new TextField();
		TextField interestRateText = new TextField();
		TextField futureValueText = new TextField();
		futureValueText.setEditable(false);
		
		pane.add(investmentAmount, 0, 0);
		pane.add(numOfYears, 0, 1);
		pane.add(annualInterestRate, 0, 2);
		pane.add(futureValue, 0, 3);
		pane.add(investmentText, 1, 0);
		pane.add(numOfYearsText, 1, 1);
		pane.add(interestRateText, 1, 2);
		pane.add(futureValueText, 1, 3);
		
		Button calculateBtn = new Button("Calculate");
		pane.add(calculateBtn, 1, 4);
		GridPane.setHalignment(calculateBtn, HPos.RIGHT);
		
		calculateBtn.setOnAction(e ->{
			double monthlyRate = Double.parseDouble(interestRateText.getText()) / 12;
			double answer = Double.parseDouble(investmentText.getText()) * 
					Math.pow((1 + monthlyRate), Double.parseDouble(numOfYearsText.getText()) * 12);
			futureValueText.setText(answer + "");
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("InvestmentCalculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
