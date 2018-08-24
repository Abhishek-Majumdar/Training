package comm.pojo;

public class Calculator {
	
	private int param1;
	private int param2;
	
	
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		param1 = 5;
		param2 = 10;
	}

	public Calculator(int param1, int param2) {
		super();
		this.param1 = param1;
		this.param2 = param2;
	}

	public int calculations(int a, int b) {
		return (a+b);
	}
	
	public boolean calculations(int a) {
		if(a%2 == 0)
			return true;
		else
			return false;
	}
}
