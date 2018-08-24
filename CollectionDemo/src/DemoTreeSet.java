import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;
import com.compare.MyComparator;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book> books = new TreeSet<>(new MyComparator());
		
		books.add(new Book());
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Java 8", "Oracle", 2000d));
		books.add(new Book(17, "Spring 5", "Oracle", 567d));
		
		System.out.println("Size of set: " + books.size());
		for(Book bk: books) {
			System.out.println(bk);
		}
		
	}

}
