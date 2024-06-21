package hashSetDivideCollection;

import java.io.*;
import java.util.*;

public class TestHashSetDivideCollection {
	
	public static void main(String[] args) throws Exception{
		Scanner inFile = new Scanner(new FileReader("Divide.in"));
		
		Set<Divide> hashSetDivide = new HashSet<>();
		Set<Divide> linkedHashSetDivide = new LinkedHashSet<>();
		
		
		
		while(inFile.hasNext()) {
			double inputX = inFile.nextDouble();
			double inputY = inFile.nextDouble();
			
			hashSetDivide.add(new Divide(inputX, inputY));
			linkedHashSetDivide.add(new Divide(inputX, inputY));
		}
		inFile.close();
		
		System.out.println("Print HashSet Elements of HashSet: \n");
		for(Divide element : hashSetDivide) {
			System.out.println("x= "+element.getX()+", y= "+element.getY()+", Division= "+element.division());
		}
		
		System.out.println("\n\nPrint linkedHashSet Elements of LinkedHashSet: \n");
		for(Divide element : linkedHashSetDivide) {
			System.out.println("x= "+element.getX()+", y="+element.getY()+", Division= "+element.division());
		}
		
		Divide.findX(hashSetDivide);
		Divide.findY(hashSetDivide);
	
	}
}
