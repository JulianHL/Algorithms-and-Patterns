package collectioExamples;

import java.util.*;

public class TestTreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<String> mySet = new TreeSet<String>();
		
		mySet.add("Pear");
		mySet.add("Orange");
		mySet.add("Apple");
		mySet.add("Strawberry");
		mySet.add("Banana");
		
		System.out.println("Print mySet Elements in ascending order");
		for(String name : mySet) {
			System.out.println(name);
		}

	}

}
