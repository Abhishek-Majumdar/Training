
public class ArrayLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] numbers = new int[5];
		 int i=0;
		 while(i < 5) {
			 numbers[i] = i+i*2;
			 i++;
		 }
		 i=0;

//		 while(i<5) {
//			 System.out.println(numbers[i]);
//			 i++;
//		 }
		 
		 i=0;
		 do {
			 System.out.println(numbers[i]);
			 i++;
		 } while (i<5);
	}
		
}
