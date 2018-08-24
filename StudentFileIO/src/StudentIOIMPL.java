import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pojo.Student;

public class StudentIOIMPL implements StudentIO {

	@Override
	public Student[] readFromUser() {
		// TODO Auto-generated method stub
		int size = 5;
		Student[] student = new Student[size];
		int roll, total;
		String name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<student.length; i++) {
//			System.out.println("Enter RollNO " + (i+1));
			try {
				System.out.println("Enter RollNO " + (i+1));
				roll = Integer.parseInt(br.readLine());
				System.out.println("Enter Total Marks " + (i+1));
				total = Integer.parseInt(br.readLine());
				System.out.println("Enter Name " + (i+1));
				name = br.readLine();
				student[i] = new Student(roll, total, name);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return student;
	}

	@Override
	public void writeToUser(Student[] student) {
		// TODO Auto-generated method stub
		for(int i=0; i<student.length; i++) {
			System.out.println("Roll: " + student[i].getRollNO() + "\t" + "Total marks: " + student[i].getTotal() + "\t" + "Name: "
					+ student[i].getName());
		}
	}

}
