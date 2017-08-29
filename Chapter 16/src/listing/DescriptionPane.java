package listing;


import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class DescriptionPane extends BorderPane {
	private Label lblImageTitle = new Label();
	
	private TextArea taDescription = new TextArea();
	
	public DescriptionPane(){
		lblImageTitle.setContentDisplay(ContentDisplay.TOP);
		lblImageTitle.setPrefSize(200, 100);
		
		// Set the font in the label and text field
		lblImageTitle.setFont(new Font("SansSerif", 16));
		taDescription.setFont(new Font("Serif", 14));
		
		taDescription.setWrapText(true);
		taDescription.setEditable(false);
		
		// Create scroll pane
		ScrollPane scrollPane = new ScrollPane(taDescription);
		
		// Place label and scroll pane in border pane
		setLeft(lblImageTitle);
		setCenter(scrollPane);
		setPadding(new Insets(5, 5, 5, 5));
	}
	
	public void setTitle(String title){
		lblImageTitle.setText(title);
	}
	
	public void setImageView(ImageView icon){
		lblImageTitle.setGraphic(icon);
	}
	
	public void setDescription(String text){
		taDescription.setText(text);
	}

}
