package courseArrayListCollection;

import java.io.*;
import java.util.*;

public class TestCourseArrayListCollection {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner (new FileReader("Course.in"));
		
		ArrayList<Course> courseArrayList = new ArrayList<>();
		
		
		
		while(inFile.hasNext()) {
			Course courseObject = new Course(inFile.next(), inFile.next(), inFile.nextInt(), inFile.nextInt());
			courseArrayList.add(courseObject);
		}
		
		inFile.close();
		
		System.out.println("Print CourseArrayList Elements using get method: \n");
		for(Course element: courseArrayList) {
			System.out.println("Course Code:" + element.getCourse_no() + ", Course Name: \n" + element.getCourse_name() + "Credits: " + Course.credits + ", Max Enrolled: " + element.getMax_enrl()+"\n");
		}
		
		System.out.println("\n\nPrint CourseArrayList Elements in forward direction using ListIterator: \n");
		ListIterator<Course> it = courseArrayList.listIterator();
		while(it.hasNext()) {
			Course element = it.next();
			System.out.println(element);
		}
		
		System.out.println("\n\nPrint CourseArrayList Elements in reverse direction using ListIterator: \n");
		while(it.hasPrevious()) {
			Course element = it.previous();
			System.out.println(element);
		}
		
		System.out.print("\nEnter The course you are looking for: ");
		
		Scanner input = new Scanner(System.in);
		
		String courseNo = input.next();
		System.out.println("\n\nThe course you are looking for is: ");
		Course.searchCourseByCourseNo(courseArrayList, courseNo);
	}
}
