package FileProcess;

import java.io.*;
import java.util.*;


public class TestFileProcess1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		double x, y;
		
		while(inFile.hasNext()) {
			
			x = (inFile.nextDouble());
			y = (inFile.nextDouble());
			
			System.out.println("X = "+x+" Y = "+y+" Division is: "+ x/y);
			
		}
		inFile.close();
	}

}
