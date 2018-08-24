import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = new Student[2];
		int roll, total;
		String name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<2; i++) {
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
		
		try {
			FileOutputStream fo = new FileOutputStream("StudentFile2.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			for(int i=0; i<2; i++) {
				oo.writeObject(student[i]);
			}
			
			oo.close();
			fo.close();
			
			System.out.println("Operation completed");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
