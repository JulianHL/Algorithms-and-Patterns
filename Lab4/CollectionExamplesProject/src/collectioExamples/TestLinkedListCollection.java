package collectioExamples;

import java.util.*;

public class TestLinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = new LinkedList<>();
		
		String [] names = {"Ann", "Bob", "Carol"};
		
		for(int i = 0; i < names.length; i++) {
			nameList.add(names[i]);
		} 
		
		//print LinkedList
		System.out.println("Print LinkedList");
		for(String name : nameList) {
			System.out.println(name);
		}
		
		//print using iterator class
		
		String strElement;
		System.out.println("\nPrint LinkedList using iterator class forward");
		ListIterator<String> it = nameList.listIterator();
		while(it.hasNext()) {
			strElement = it.next();
			System.out.println(strElement);
			if(strElement.equals("Bob")) {
				it.set("Lee");
				}
			
		}
		
		System.out.println("\nPrint LinkedList using iterator class backward");
		while(it.hasPrevious()) {
			strElement = it.previous();
			System.out.println(strElement);
		}
		
		System.out.println("\nPrint LinkedList using iterator class fordward again");
		while(it.hasNext()) {
			strElement = it.next();
			System.out.println(strElement);
		}
		
	}

}
