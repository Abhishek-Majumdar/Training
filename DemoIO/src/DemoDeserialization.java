import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi;
		try {
			fi = new FileInputStream("StudentFile2.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj = oi.readObject();
 
			
			
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
		
	}

}
