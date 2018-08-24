
public class demoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("Citi 1");
		StringBuilder builder2 = new StringBuilder("Citi 1");
//		System.out.println("Initial value: " + builder);
//		builder.append(", EON");
//		System.out.println("New Value: " + builder);
		
		if(builder==(builder2)) {
			System.out.println("T");
		}
		else
		{
			System.out.println("F");
		}
	}

}
