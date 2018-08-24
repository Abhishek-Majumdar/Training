package comm.pojo;

public class Employee extends Person {
	private double empSalary;
	private int empId;
	
	public Employee() 
	{	
//		super();
		empId = 0;
		empSalary = 4000;
	}
	
	public Employee(int empId, double empSalary, int age, String name) 
	{
		super(age, name);
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void display() {
		super.display();
		System.out.println("EmpID: " + empId + "\t" + "Salary: " + empSalary);
//		System.out.println(getName());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + empSalary;
	}

}
