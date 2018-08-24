import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookFileIO;
import com.interfaces.BookIO;

public class BookFileIOImpl implements BookFileIO {

	
	@Override
	public boolean writeDatatoFile(List<Book> books) {
		// TODO Auto-generated method stub
		FileOutputStream fo;
		boolean flag = false;
		try {
			BookIOImpl bookIO = new BookIOImpl();
			fo = new FileOutputStream("Book.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			List<Book> book = readDataFromFile();
			book.add(bookIO.getBook());
			oo.writeObject(book);
			oo.close();
			fo.close();
			flag = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public List<Book> readDataFromFile() {
		// TODO Auto-generated method stub
		FileInputStream fi;
		List<Book> book = new ArrayList<Book>();
		try {
			fi = new FileInputStream("Book.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			book = (List<Book>)oi.readObject();
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return book;
	}

}
