import com.demo.MyInterface;

public class DemoInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface m = new MyInterface() {
			
			@Override
			public void showData() {
				// TODO Auto-generated method stub
				System.out.println("Displaying data from inner class");
			}
		};
		m.showData();
	}

}
