
public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {5, 8, 53, 32, 46, 79};
		boolean found = false;
		int value = 8;
		
		for(int num: numbers) 
		{
			if (num == value) 
			{
				found = true;
		//		System.out.println("Loop exited");
				break;
			}
		}
		
		if(found) 
		{
			System.out.println("Value found");
		}
		else 
		{
			 System.out.println("Value not found");
		}
	}
}
