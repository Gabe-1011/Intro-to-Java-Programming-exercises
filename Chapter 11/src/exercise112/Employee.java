package exercise112;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate date;

	public Employee() {
		date = new MyDate();
	}

	public Employee(String name, String address, String phone, String email, String office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		date = new MyDate();
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/** Return date hired */
	public String getDate() {
		return date.getMonth() + "/" + date.getDay() + "/" + date.getYear();
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + getDate();
	}

}
