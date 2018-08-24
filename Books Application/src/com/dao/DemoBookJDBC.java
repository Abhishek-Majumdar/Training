package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class DemoBookJDBC {
	
	public static Book getData()
	{		
		int no;
		String name,publication,author;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ISBN Number:");
		no=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Book name:");
		name=sc.nextLine();
//		sc.nextLine();
		System.out.print("Enter Publication:");
		publication=sc.nextLine();
//		sc.nextLine();
		System.out.print("Enter Author's name:");
		author=sc.nextLine();
//		sc.nextLine();
		Book bk=new Book(no,name,publication,author);
		return bk;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		BookDAO bDao = new BookDAOImpl();
		List<Book> books_loc = new ArrayList<>();
		Book book_loc = new Book();
		boolean flag = false;
		
		do {
			System.out.println(" ");
			System.out.println("-------OPERATIONS-------");
			System.out.println("1. Add Book");
			System.out.println("2. Update Book");
			System.out.println("3. Display all Books" );
			System.out.println("4. Find Books by Name");
			System.out.println("5. Find Books by Author name");
			System.out.println("6. Find Books by ISBN");
			System.out.println("7. Delete Book");
			
			
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1: System.out.println("You have chosen to Add Book data.");
						flag = bDao.addBook(getData());
						if(flag)
							System.out.println("Record added successfully.");
						else
							System.out.println("Operation failed.");
						break;
				case 2: System.out.println("You have chosen to update book data, please enter ISBN number: ");
						int ISBN = sc.nextInt();
						sc.nextLine();
						count = bDao.updateBook(getData(), ISBN);
						System.out.println(count + " records were updated.");
						break;
				case 3: System.out.println("You have chosen to view data of all books: ");
						books_loc = bDao.findAllBooks();
						for(Book book: books_loc) 
							System.out.println(book.toString());
						break;
				case 4: System.out.println("You have chosen to view book data, please enter book name: ");
						String BName = sc.nextLine();
						books_loc = bDao.findBooksByName(BName);
						for(Book book: books_loc) 
							System.out.println(book.toString());
						break;
				case 5: System.out.println("You have chosen to view book data, please enter author name: ");
						String AuthName = sc.nextLine();
						books_loc = bDao.findBooksByAuthor(AuthName);
						for(Book book: books_loc) 
							System.out.println(book.toString());
						break;
				case 6: System.out.println("You have chosen to view book data, please enter ISBN number: ");
						int ISBNno = sc.nextInt();
						sc.nextLine();
						book_loc = bDao.findBookByISBN(ISBNno);
						System.out.println(book_loc.toString());
						break;
				case 7: System.out.println("You have chosen to delete a record, please enter ISBN :");
						int ISBNno1 = sc.nextInt();
						sc.nextLine();
						count = bDao.deleteBook(ISBNno1);
						if(count == 0)
							System.out.println("Book not found.");
						else
							System.out.println(count + " rows were deleted.");
						break;
			}
		} while(choice>= 1 && choice<= 7);	
	}
}