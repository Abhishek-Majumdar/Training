
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Number of arguments: " + args.length);
//		System.out.println("argument: " + args[0]);
		
		int Sum =0;
		for(String n: args ) {
			Sum += Integer.parseInt(n);
		}
		
		//System.out.println(Sum);
		
		Integer obj = new Integer(12);
		int value1 = obj.intValue(); //auto-unboxing
		
		int value2 = obj;  //auto-boxing
		
		obj = 20;
		
		System.out.println(obj);
		System.out.println(value1);
		System.out.println(value2);
	}

}
