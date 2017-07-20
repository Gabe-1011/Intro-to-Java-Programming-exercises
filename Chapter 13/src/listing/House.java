package listing;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {
	private int id;
	private double area;
	private Date whenBuilt;
	
	public House(int id, double area){
		this.id = id;
		this.area = area;
		whenBuilt = new Date();
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public Date getWhenBuilt() {
		return whenBuilt;
	}



	public void setWhenBuilt(Date whenBuilt) {
		this.whenBuilt = whenBuilt;
	}
	
	// Shallow copy - Only reference is copied
//	@Override
//	public Object clone() throws CloneNotSupportedException{
//		return super.clone();
//	}
	
	// Deep copy
	@Override
	public Object clone() throws CloneNotSupportedException{
		// Perform shallow copy
		House houseClone = (House)super.clone();
		// Deep copy on whenBuilt
		houseClone.whenBuilt = (Date)(whenBuilt.clone());
		return houseClone;
		
	}



	@Override
	public int compareTo(House o) {
		// TODO Auto-generated method stub
		if(area > o.area)
			return 1;
		else if(area < o.area)
			return -1;
		else
			return 0;
	}
	
	

}
