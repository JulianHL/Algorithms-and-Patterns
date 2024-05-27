package FileProcess;

import java.io.*;
import java.util.*;

public class TestFileProcess2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		double [] x,y;
		
		//we create 2 parallel arrays of type double
		y=new double[4];
		x= new double[4];
		
		for(int i = 0; i < x.length; i++){
			
			//we fill the arrays
			x[i] = inFile.nextDouble();
			y[i] = inFile.nextDouble();
			
			//we print the content of the arrays
			System.out.println("X = "+x[i]+" Y = "+y[i]+" Division is: "+ x[i]/y[i]);
	
		}
		inFile.close();
		

	}

}
