
public class Employee {
	
	private int empID;
	private double salary;
	private String empName;
	private String companyName;
	
	public Employee()
	{
		empID = 10;
		empName = "John Doe";
		salary = 100000;
		companyName = "Citi LTD";	
	}
	
	public Employee(int empID, String empName, double salary)
	{
		this();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println(empName + "\t" + empID + "\t" + companyName);
	}
	
	public static void main(String []args)
	{
		Employee emp = new Employee(1200,"Edwin",150000);
		emp.display();
	}

}
