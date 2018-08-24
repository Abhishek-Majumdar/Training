import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList();
		l.add("ABC");
		l.add("XYZ");
		l.add("76554");
		l.add("CITI");
		l.add("ABC");
		l.add(0, "NEW DATA");
//		l.add(new Double(123.56));
//		l.add(new File("data.txt"));
		
		
		System.out.println(l);
		int size = l.size();
		System.out.println("Size = " + size);
//		boolean found = (l.contains("AC"));
		
//		System.out.println(l.get(2));
//		l.remove(0);
//		boolean removed =l.remove("XYZ");
//		System.out.println(l);
	
		Iterator<String> it = l.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		
	}
}
	
