import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pojo.Student;

public class StudentFileIOImpl implements StudentFileIO {

	@Override
	public Student[] readStudents() {
		// TODO Auto-generated method stub
		FileInputStream fi;
		Student[] students = null;
		try {
			fi = new FileInputStream("StudentData.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
//			Object obj = oi.readObject();
		
			students = (Student[]) oi.readObject();	
		
			oi.close();
			fi.close();		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
		
	}

	@Override
	public int writeStudents(Student[] student) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo = new FileOutputStream("StudentData.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			for(int i=0; i<student.length; i++) {
				oo.writeObject(student[i]);
			}
			
			oo.close();
			fo.close();
			
//			System.out.println("Operation completed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 1;
	}
}

