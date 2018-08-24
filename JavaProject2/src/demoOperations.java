import java.util.Arrays;

public class demoOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {12, 18, 34, 16, 27, 91, 88, 106, -54};
		//Arrays.fill(numbers, 4, 6, 9);
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, -54));
		
		
		for(int n:numbers) {
			System.out.print(n + " ");
		}
		
//		for(int n:copyOfNumbers) {
//			System.out.print(n + " ");
//		}

	}

}
