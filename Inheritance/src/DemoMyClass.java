import comm.pojo.Employee;

public class DemoMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeIO empIO = new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				employee.display();
			}
			
			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				return new Employee();
			}
		};
		Employee emp = empIO.readEmployee();
		empIO.writeEmployee(emp);
			
	}
}


