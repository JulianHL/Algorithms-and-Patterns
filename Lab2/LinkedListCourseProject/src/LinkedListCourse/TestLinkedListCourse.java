package LinkedListCourse;

import java.io.*;
import java.util.*;

public class TestLinkedListCourse {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner inFile = new Scanner(new FileReader("course.in"));
		
		//create a user-defined linked list
		LinkedListClass coursesList = new LinkedListClass();
		
		//add elements to linked list
		while(inFile.hasNext()) {
			
			coursesList.add(new Course(inFile.next(), inFile.next(), inFile.nextInt(), inFile.nextInt()));
		}
		inFile.close();
		
		//traverse linked list
		coursesList.print();
		
		//find course
		System.out.print("\nEnter The course you are looking for: ");
		
		Scanner input = new Scanner(System.in);
		
		String courseNo = input.next();
		System.out.println("\n\nThe course you are looking for is: ");
		Course.searchCourseByCourseNo(coursesList, courseNo);
		
	}

}
