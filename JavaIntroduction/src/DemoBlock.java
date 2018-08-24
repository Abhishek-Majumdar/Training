
public class DemoBlock {
	
	public DemoBlock() {
		System.out.println("constructor invoked");
	}
	
	{
		System.out.println("Non-static block invoked");
	}
	
	{
		System.out.println("Non-static block 2 invoked");
	}
	
	static {
		System.out.println("Static block invoked");
	}
	
	public void Display() {
		System.out.println("Display invoked");
	}

	public static void show() {
		System.out.println("Static show function invoked");
	}
	
	public static void main(String []args) {
		
		DemoBlock  d = new DemoBlock();
		DemoBlock d1 = new DemoBlock();
		//d.Display();
		//DemoBlock.show();
	}
}
