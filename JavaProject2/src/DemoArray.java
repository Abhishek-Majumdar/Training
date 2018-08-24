
public class DemoArray {
	
	public static void main(String []args)
	{
		int [] numbers;
		numbers = new int[3];
		numbers[0] = 5;
		numbers[1] = 15;
		numbers[2] = 25;
	//	numbers[3] = 1000;
		
		int [] sumArray;
		sumArray = new int[5];
		sumArray[0] = 5;
		sumArray[1] = 15;
		sumArray[2] = 25;
		sumArray[3] = 35;
		sumArray[4] = 45;
		
		int Sum = 0;
		Sum = add(sumArray);
		//System.out.println(Sum);
		for(int x: sumArray) {
			System.out.println(x);
		}
	}
		
	public static int add(int [] sumArray)
		{
			return (sumArray[0]+sumArray[1]+sumArray[2]+sumArray[3]+sumArray[4]);	
		}
		
	
		
	
}
