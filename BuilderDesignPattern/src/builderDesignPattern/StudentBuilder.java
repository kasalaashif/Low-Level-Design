package builderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

	public int rollNumber;
	public String name;
	public String department;
	public List<String> subjects;
	public String fatherName;
	public String motherName;

	public StudentBuilder setrollNumber(int rollNumber){
		this.rollNumber = rollNumber;
		return this;
	}
	
	public StudentBuilder setname(String name){
		this.name = name;
		return this;
	}
	
	public StudentBuilder setdepartment(String department){
		this.department = department;
		return this;
	}
	
	public abstract StudentBuilder setSubjects();
	
	public StudentBuilder setfatherName(String fatherName){
		this.fatherName = fatherName;
		return this;
	}
	
	public StudentBuilder setmotherName(String motherName){
		this.motherName = motherName;
		return this;
	}
	
	public Student build() {
		return new Student(this);
	}
}
