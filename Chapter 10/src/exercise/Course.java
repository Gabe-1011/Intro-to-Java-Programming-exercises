package exercise;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		if(numberOfStudents >= students.length){
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	/** Remove a student from a course */
	public void dropStudent(String student) {
		int index = findStudent(student);
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}
	
	/** deletes a Student */
	private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numberOfStudents--;
	}
	
	public void clear(){
		for(int i = 0; i < students.length; i++){
			students[i] = null;
		}
	}
	
	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}

}
