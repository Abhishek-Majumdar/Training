import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.beans.Book;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Book> books = new HashSet<>();
		books.add(new Book());
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Adv Java", "Oracle", 2000d));
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		
		System.out.println("Size of set: " + books.size());
		
		Iterator<Book> it = books.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
