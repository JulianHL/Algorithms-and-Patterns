package ArrayListProcess;
import java.io.*;
import java.util.*;


public class TestsFileArrayList2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		
		//we create an arrayList of objects of type Divide
		List<Divide> inFileArrayList = new ArrayList<>();
		
		
		
		while (inFile.hasNext()) {
			//we load the information from the file into the arrayList
			inFileArrayList.add(new Divide(inFile.nextDouble(), inFile.nextDouble()));
			
		}
		inFile.close();
		
		//we print the information in the arrayList using a for each loop
		inFileArrayList.forEach(element -> System.out.println("X = "+ element.getX() +" Y = "+ element.getY() +" Division is: "+ element.getX()/element.getY()));
		
		//we call the methods findX and findY
		Divide.findX(inFileArrayList);
		Divide.findY(inFileArrayList);
		
		
		
		
	}
}
