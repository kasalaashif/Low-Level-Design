package proxyDesignPattern;

public class EmployeeConcrete implements EmployeeInterface{

	@Override
	public void createEmployee(String str) {
		System.out.println("createEmployee: " + str);
	}

	@Override
	public void updateEmployee(String str) {
		System.out.println("updateEmployee: " + str);
	}

	@Override
	public void deleteEmployee(String str) {
		System.out.println("deleteEmployee: " + str);
	}

	@Override
	public EmployeeInterface getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
