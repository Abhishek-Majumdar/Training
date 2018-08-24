import java.util.ArrayList;

public class demoArrayList {
	
	int age = 18;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demoArrayList obj = new demoArrayList();
		ArrayList list = new ArrayList();
		list.add(22);
		list.add(10);
		list.add(16);
		list.add(34);
		list.add("ABCD");
		list.add(obj);
		//list.add(2, 2000);
		//list.remove(new Integer(16));
		System.out.println(list);
		
	}

}
