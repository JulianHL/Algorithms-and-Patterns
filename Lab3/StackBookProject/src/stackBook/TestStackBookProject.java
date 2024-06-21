package stackBook;

import java.io.*;
import java.util.*;

public class TestStackBookProject {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Book.in"));
		LinkedStack books = new LinkedStack();
		
		while(inFile.hasNext()) {
			String[] temp = inFile.nextLine().split("\t");
			Book book = new Book(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], Double.parseDouble(temp[5]));
			books.push(book);
		}
		
		
		books.print();
		
		System.out.println("\n\nThe size of the stack is: " + books.stackSize);
		System.out.println("\n\nThe stack top is:\n" + books.peek());
	}

}
