import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

import com.beans.Book;

public class DemoHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, List<Book>> books = new HashMap<>();
		
		List<Book> fiction = new ArrayList<Book>();
		fiction.add(new Book(300, "Chamber of Secrets", "Scholastic", 600));
		fiction.add(new Book(5500, "To Kill a Mockingbird", "Orchid", 750));
		fiction.add(new Book(2200, "The hound of Baskervilles", "JC Press", 350));
		books.put("Fiction", fiction);
		
		List<Book> programming = new ArrayList<Book>();
		programming.add(new Book(123, "Adv Java", "Oracle", 1234d));
		programming.add(new Book(300, "Angular", "Oracle", 2000d));
		programming.add(new Book(550, "Node JS", "Oracle", 1256d));
		books.put("Programming", programming);
		
		List<Book> mythology = new ArrayList<Book>();
		mythology.add(new Book(1240, "Ramayana", "National Press", 75));
		mythology.add(new Book(5500, "Mahabharata", "National Press", 250));
		mythology.add(new Book(1240, "The immortals of Meluha", "Scholastic", 210));
		books.put("Mythology", mythology);
		
		Set<Entry<String, List<Book>>> entries = books.entrySet();
		Iterator<Entry<String,List<Book>>> iterator = entries.iterator();
		
		System.out.println("Enter genre of books you're interested in :");
		Scanner scan = new Scanner(System.in );
		String genre = scan.nextLine();
		boolean flag = false; 
		while(iterator.hasNext())
		{
			Entry<String, List<Book>> entry = iterator.next();
			List<Book> book = entry.getValue();
			if(entry.getKey().equals(genre)) 
			{
				for(Book bk: book)
				{
					System.out.println(bk);
				}
				flag = true;
			}
		}
		
		if(flag == false)
			System.out.println("Genre not found.");
	}

}
