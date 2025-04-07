package builderDesignPattern;

public class Main {

	public static void main(String[] args) {
		Director computerScienceDirector = new Director(new ComputerScienceStudentBuilder());
		Student computerScienceStudent = computerScienceDirector.createStudent();
		System.out.println(computerScienceStudent.toString());
		
		Director mechanicalScienceDirector = new Director(new MechanicalStudentBuilder());
		Student mechanicalStudent = mechanicalScienceDirector.createStudent();
		System.out.println(mechanicalStudent.toString());
	}
}
