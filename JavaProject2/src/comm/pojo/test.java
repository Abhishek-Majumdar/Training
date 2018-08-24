package comm.pojo;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int[] marks = new int[5];
		int roll_no;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name:");
		name = scan.nextLine();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter value for marks " + (i+1));
			marks[i] = scan.nextInt();
		}
		
		System.out.println("Enter roll number:");
		roll_no = scan.nextInt();
		
		student obj = new student(name, marks, roll_no);
		obj.display();
		
	}

}
