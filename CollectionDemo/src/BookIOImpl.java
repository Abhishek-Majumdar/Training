import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.interfaces.BookIO;

public class BookIOImpl implements BookIO {

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		Book bk = new Book();
//		int isbn;
//		String name, publication;
//		Double price;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ISBN number of book: ");
		bk.setIsbn(scan.nextInt()); scan.nextLine();
		System.out.println("Enter name of book: ");
		bk.setName(scan.nextLine());
		System.out.println("Enter book publisher : ");
		bk.setPublication(scan.nextLine());
		System.out.println("Enter book price :");
		bk.setPrice(scan.nextDouble());
    //	scan.nextLine();
	//	scan = null;
		return bk;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub
		for(Book bk : books) 
		{
			System.out.println(bk);
		}	
	}
	

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println(book);
	}

}
