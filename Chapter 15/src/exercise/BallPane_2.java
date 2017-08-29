package exercise;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallPane_2 extends Pane {
	public final double radius = 20;
	private double x = radius, y = radius;
	private Circle circle = new Circle(x, y, radius);

	public BallPane_2() {
		circle.setFill(Color.GREEN); // Set ball color
		getChildren().add(circle); // Place a ball into this pane

	}

	// Move ball left
	public void left() {
		circle.setCenterX(circle.getCenterX() > circle.getRadius() ? circle.getCenterX() - 20 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
	}

	// Move ball right
	public void right() {
		circle.setCenterX(
				circle.getCenterX() < getWidth() - circle.getRadius() ? circle.getCenterX() + 20 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
	}

	// Move ball up
	public void up() {
		circle.setCenterY(circle.getCenterY() > circle.getRadius() ? circle.getCenterY() - 20 : circle.getCenterY());
		circle.setCenterX(circle.getCenterX());
	}

	// Move ball down
	public void down() {
		circle.setCenterX(circle.getCenterX());
		circle.setCenterY(circle.getCenterY() < getHeight() - circle.getRadius() ? circle.getCenterY() + 20
				: circle.getCenterY());
	}

}
