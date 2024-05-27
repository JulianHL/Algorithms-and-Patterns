package FileProcess;

import java.io.*;
import java.util.*;

public class TestFileProcess3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		
		//we create an array of objects of type Divide
		Divide[] arrayInFile = new Divide[4];
		
		int index = 0;
		while (inFile.hasNext()) {
			//we load the information from the file into the array
			arrayInFile[index] = new Divide(inFile.nextDouble(), inFile.nextDouble());
			index++;
		}
		inFile.close();
		
		for(Divide element:arrayInFile) {
			//we print the information in the array
			System.out.println("X = "+ element.getX() +" Y = "+ element.getY() +" Division is: "+ element.getX()/element.getY());
		}
		
		//we call the methods findX and findY
		Divide.findX(arrayInFile);
		Divide.findY(arrayInFile);

	}

}
