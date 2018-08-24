import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.Book;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books = new ArrayList();
		books.add(new Book());
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Adv Java", "Oracle", 2000d));
		
//		System.out.println(books);
		
		books.forEach(System.out::println);
		
		System.out.println("testing");
		books.stream().filter(data->{ return data.getName().equals("Adv Java");}).collect(Collectors.toList()).
															forEach(System.out::println);
	}
}
