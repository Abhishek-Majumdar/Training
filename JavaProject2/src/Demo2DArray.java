
public class Demo2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[][] numbers;
		int[][] numbers = new int[3][];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = new int[3];
		}
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				numbers[i][j] = i+j;
			}
		}
			
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(numbers[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		for(int[] arr : numbers) {
			for (int x : arr) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		
	}

}
