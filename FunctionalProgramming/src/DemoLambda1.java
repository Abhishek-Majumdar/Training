import com.demo.MyInterface2;
import com.demo.Person;

public class DemoLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface2 m = (a,b)->{return a.getAge()==b.getAge();};
		System.out.println(m.add(new Person(), new Person()));
	}

}
