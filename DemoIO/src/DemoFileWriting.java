import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fwrtr = new FileWriter("file1.txt",true);
			fwrtr.write("Pune, India");
			System.out.println("File created and data inserted.");
			fwrtr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
