import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookOperations;

public class BookOperationsImpl implements BookOperations {
	
	List<Book> books = new ArrayList<Book>();

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
//		BookIOImpl bIO = new BookIOImpl();
		BookFileIOImpl bfIO = new BookFileIOImpl();
		books.add(book);
		bfIO.writeDatatoFile(books);		
		return 1;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		BookFileIOImpl bfIO = new BookFileIOImpl();
		books = bfIO.readDataFromFile();
		boolean found = books.contains(book);
		if(found)
		{
			books.remove(book);
			bfIO.writeDatatoFile(books);
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		BookFileIOImpl bfIO = new BookFileIOImpl();
		books = bfIO.readDataFromFile();
		boolean found = books.contains(book);
//		BookIOImpl b = new BookIOImpl();
		Book bk1 = null;
		boolean flag = false;
		if(found)
		{
			for(Book bk: books) 
			{
				if(bk.getIsbn() == book.getIsbn())
					{
						bk1 = bk;
						flag = true;
						break;
					}
			}
		}
		if(flag)
			return bk1;
		else
			return null;
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
//		Book bk1 = new Book();
		BookFileIOImpl bfIO = new BookFileIOImpl();
		books = bfIO.readDataFromFile();
		List<Book> bkList = new ArrayList<>();
		boolean flag = false;
		for(Book bk: books) 
			{
				if(bk.getName().equals(book_name))
					{
						bkList.add(bk);
						flag = true;
						//break;
					}
			}
		
		if(flag)
			return bkList;
		else
			return null;
	}
	
	public void printAll() 
	{
		for(Book bk: books) {
			System.out.println(bk);
		}
	}
}


