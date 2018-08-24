
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book());
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Adv Java", "Oracle", 2000d));
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		
		System.out.println("Number of books: " + books.size() );
		for(Book bk:books) {
			System.out.println(bk);
		}
		
		Book book_to_search = new Book(300, "Adv Java", "Oracle", 2000d);
		
		boolean removed = books.remove(book_to_search);
		System.out.println("Removed: " + removed);

//		boolean found = books.contains(book_to_search);
//		if(found)
//			System.out.println("Book found");
//		else
//			System.out.println("Not found");
//		
	}

}
