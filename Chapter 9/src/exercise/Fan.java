package exercise;

public class Fan {
	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	public String color;
	
	public Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		if(on == true){
			return "Fan [speed=" + speed + "radius=" + radius + ", color=" + color + "]";
		}
		else
			return "Fan [radius=" + radius + ", color=" + color + "]";
	}
	
	

}
