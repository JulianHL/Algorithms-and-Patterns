package clientStack;

import java.io.*;
import java.util.*;

public class TestClientStack {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Client.in"));
		
		LinkedStack clientsStack = new LinkedStack();
		
		while(inFile.hasNext()) {
			Client client = new Client(inFile.nextInt(), inFile.next(), inFile.nextInt(), Double.parseDouble(inFile.next()));
			clientsStack.push(client);
		}
		
		clientsStack.print();
		
		inFile.close();
	}

}
