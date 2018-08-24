package com.interfaces;

import java.util.List;

import com.beans.Book;

public interface BookFileIO {
	
	public boolean writeDatatoFile(List<Book> books); 
	public List<Book> readDataFromFile();

}
