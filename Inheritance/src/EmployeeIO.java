import comm.pojo.Employee;
public interface EmployeeIO {
	
	double PI = 3.14;
	public static final String name = "CITI";
	
	Employee readEmployee();
	abstract public void writeEmployee(Employee employee);

}
