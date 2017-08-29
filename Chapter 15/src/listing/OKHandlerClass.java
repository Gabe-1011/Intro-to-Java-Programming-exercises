package listing;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OKHandlerClass implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		System.out.println("OK button clicked");
		
	}

}
