package ArrayListProcess;
import java.io.*;
import java.util.*;


public class TestsFileArrayList2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		List<Divide> inFileArrayList = new ArrayList<>();
		
		
		
		while (inFile.hasNext()) {
			
			inFileArrayList.add(new Divide(inFile.nextDouble(), inFile.nextDouble()));
			
		}
		inFile.close();
		inFileArrayList.forEach(element -> System.out.println("X = "+ element.getX() +" Y = "+ element.getY() +" Division is: "+ element.getX()/element.getY()));
		
		Divide.findX(inFileArrayList);
		Divide.findY(inFileArrayList);
		
		
		
		
	}
}
