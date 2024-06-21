package collectioExamples;

import java.util.*;

public class TestHashSetCollection {
	
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("Pear");
		mySet.add("Orange");
		mySet.add("Apple");
		mySet.add("Strawberry");
		mySet.add("Banana");
		
		System.out.println("Print mySet Elements of HashSet");
		for(String element : mySet) {
			System.out.println(element);
		}
		
		Set<String> mySet2 = new LinkedHashSet<String>();
		
		mySet2.add("Pear");
		mySet2.add("Orange");
		mySet2.add("Apple");
		mySet2.add("Strawberry");
		mySet2.add("Banana");
		
		System.out.println("\nPrint mySet Elements in ascending order of LinkedHashSet");
		for(String element : mySet2) {
			System.out.println(element);
		}
	}
	
}
