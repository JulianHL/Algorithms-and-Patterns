package bookArrayListCollection;

import java.io.*;
import java.util.*;

public class TestBookArrayListCollectionProject {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Book.in"));
		List <Book> bookList = new ArrayList<Book>();
		
		while(inFile.hasNextLine()) {
			
			String[] bookTempArray = inFile.nextLine().split("\t");
			Book book = new Book(Integer.parseInt(bookTempArray[0]), bookTempArray[1], bookTempArray[2], bookTempArray[3], bookTempArray[4], Double.parseDouble(bookTempArray[5]));
			bookList.add(book);
		}
		inFile.close();
		
		System.out.println("The books you entered are: "+bookList.size());
		
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println("\nBook"+(i+1)+": \n"+bookList.get(i));
		}
		
		
		String strElement;
		System.out.println("\n\nBOOKS LIST USING ITERATOR WITH METHOD NEXT(): ");
		ListIterator<Book> it = bookList.listIterator();
		while(it.hasNext()) {
			strElement = it.next().toString();
			System.out.println("\n"+strElement);
		}
		
		System.out.println("\n\nNow in reverse order. \nBOOKS LIST USING ITERATOR WITH METHOD PREVIOUS(): ");
		while(it.hasPrevious()) {
			strElement = it.previous().toString();
			System.out.println("\n"+strElement);
		}
		


		//adding new book
		bookList.add(2, new Book(13,"Joshawa Pierre","Python","1209845","BG",99.99));
		System.out.println("\n\nThe new added book is: \n\n"+bookList.get(2));
	}

}
