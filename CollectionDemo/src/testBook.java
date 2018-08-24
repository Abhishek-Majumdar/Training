import java.util.Scanner;

import com.beans.Book;

public class testBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookIOImpl bookIO = new BookIOImpl();
		BookOperationsImpl bookOps = new BookOperationsImpl();
		
		bookOps.books.add(new Book());
		bookOps.books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		bookOps.books.add(new Book(300, "Adv Java", "Oracle", 2000d));
		
		
		int choice;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("-------OPERATIONS-------");
			
			System.out.println("1. Add book data");
			System.out.println("2. Update book data");
			System.out.println("3. Find book by ID");
			System.out.println("4. Find book by name");
			System.out.println("5. Display all data");
			
			System.out.println("Please choose an option:");
			
			choice = sc.nextInt(); 
//			sc.nextLine();
//			x = Integer.parseInt(choice);
			switch(choice)
			{
			case 1:
					int check = bookOps.addBook(bookIO.getBook());
					if(check == 1)
						System.out.println("Record added successfully");
						System.out.println();
					break;
			case 2:
					boolean flag;
					flag = bookOps.deleteBook(bookIO.getBook());
					if(flag)
						System.out.println("Record deleted");
					else
						System.out.println("Book not found");
					break;
					
			case 3:
					if(bookOps.findBookById(bookIO.getBook())==null)
						System.out.println("Book not found.");
					else
						bookIO.printBook(bookOps.findBookById(bookIO.getBook()));
					break;
			case 4:
					System.out.println("Enter Book name: ");
					Scanner scan = new Scanner(System.in);
					if(bookOps.findBooksByName(scan.nextLine())==null)
						System.out.println("Book not found");
					else
						bookIO.printBook(bookOps.findBooksByName(scan.nextLine())); 
//					scan.close();
//					scan = null;
					break;
			case 5:
					bookOps.printAll();
					break;
					
			default:
					System.out.println("No valid opeartion found. Please enter a valid choice.");
					break;
			}
			
//			System.out.println("Continue? (y/n)");
		
		} while(choice>0 &&  choice<6);
//		sc.close();
			
	}

}
