import com.demo.MyInterface;

public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface m = () -> {System.out.println("Welcome to Lambda");};
		m.showData();
	}

}
