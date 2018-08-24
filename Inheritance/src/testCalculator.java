import comm.pojo.Calculator;

public class testCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator(10,20);
		System.out.println(obj.calculations(30));
		System.out.println(obj.calculations(30,5));
		
	}

}
