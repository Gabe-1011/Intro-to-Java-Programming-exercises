package exercise;

import java.util.ArrayList;

public class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// left as an exercise
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {

			}
		}
		numberOfStudents--;
	}

	@Override /**
				 * Override the proceted clone method defined in the Object
				 * class, and strengthen its accessibility
				 */
	public Course clone() throws CloneNotSupportedException {
		// Perform a shallow copy
		Course courseClone = (Course) super.clone();
		// Deep copy on students
		courseClone.students = students.clone();
		return courseClone;
	}

}
