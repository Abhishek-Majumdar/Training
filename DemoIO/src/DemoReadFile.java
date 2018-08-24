import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader reader = new FileReader("file1.txt");
			byte value = 0;
			do {
				int data = reader.read();
				if((byte)data == -1)
					break;
				System.out.print((char)data);
				value = (byte)data;
			} while(value != -1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
