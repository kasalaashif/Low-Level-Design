package proxyDesignPattern;

public class Main {

	public static void main(String[] args) {
		EmployeeInterface emp = new EmployeeProxy(new EmployeeConcrete());
		emp.createEmployee("Ashif");
		emp.updateEmployee("Ashraf");
		emp.deleteEmployee("Ashraf");
		emp.getEmployee();
	}
}
