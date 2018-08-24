import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter number 1: ");
			String num1 = br.readLine();
			System.out.println("Enter number 2: ");
			String num2 = br.readLine();
			if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
				System.out.println(num1 + " is greater.");
			}
			if(Integer.parseInt(num1) < Integer.parseInt(num2)) {
				System.out.println(num2 + " is greater.");
			}
			else {
				System.out.println("Numbers are equal.");
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
