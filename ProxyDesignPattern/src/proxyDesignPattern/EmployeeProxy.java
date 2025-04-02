package proxyDesignPattern;

public class EmployeeProxy implements EmployeeInterface{
	
	EmployeeConcrete emp;
	public EmployeeProxy(EmployeeConcrete emp) {
		this.emp = emp;
	}

	@Override
	public void createEmployee(String str) {
		emp.createEmployee(str);	
	}

	@Override
	public void updateEmployee(String str) {
		emp.updateEmployee(str);
	}

	@Override
	public void deleteEmployee(String str) {
		emp.deleteEmployee(str);
	}

	@Override
	public EmployeeInterface getEmployee() {
		return emp.getEmployee();
	}
}
