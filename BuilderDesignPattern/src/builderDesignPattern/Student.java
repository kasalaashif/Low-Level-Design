package builderDesignPattern;

import java.util.List;

public class Student {
	
	public int rollNumber;
	public String name;
	public String department;
	public List<String> subjects;
	public String fatherName;
	public String motherName;
	
	public Student(StudentBuilder studentBuilder) {
		this.rollNumber = studentBuilder.rollNumber;
		this.name = studentBuilder.name;
		this.department = studentBuilder.department;
		this.subjects = studentBuilder.subjects;
		this.fatherName = studentBuilder.fatherName;
		this.motherName = studentBuilder.motherName;
	}
	
	public String toString() {
		return "RollNumber: " + this.rollNumber + " Name: " + this.name +
				" Department: " + this.department + " Subjects: " + this.subjects +
				" Father Name: " + this.fatherName + " Mother Name: " + this.motherName;
	}

}
