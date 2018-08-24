import java.util.Scanner;

import comm.pojo.Employee;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		String name;
		int empID, age; 
		double sal;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = scan.nextLine();
		System.out.println("Enter Age:");
		age = scan.nextInt();
		System.out.println("Enter EmpID:");
		empID = scan.nextInt();
		System.out.println("Enter Salary:");
		sal = scan.nextDouble();
		
		Employee e2 = new Employee(empID,sal,age,name);
		return e2;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee.display();

	}
	
	public static void main(String[] args) {
		EmployeeIOImpl e = new EmployeeIOImpl();
//		Employee e1 = new Employee();
//		e.readEmployee();
		e.writeEmployee(e.readEmployee());
		//e.writeEmployee();
	}

}
