package builderDesignPattern;

public class Director {
	
	StudentBuilder studentBuilder;
	
	public Director(StudentBuilder studentBuilder) {
		this.studentBuilder = studentBuilder;
	}
	
	public Student createStudent() {
		if(studentBuilder instanceof ComputerScienceStudentBuilder)
			return ComputerScienceStudent();
		else if(studentBuilder instanceof MechanicalStudentBuilder)
			return MechanicalStudent();
		return null;
	}

	private Student ComputerScienceStudent() {
		return studentBuilder.setrollNumber(1).setname("Ashif").setdepartment("Computer Science").setfatherName("Chand Basha").setmotherName("Ammaji").setSubjects().build();
	}

	private Student MechanicalStudent() {
		return studentBuilder.setrollNumber(1).setname("Jeevan").setdepartment("Mechanical Engineering").setfatherName("Jeevan's Dad").setmotherName("Jeevan's Mom").setSubjects().build();
	}

}
