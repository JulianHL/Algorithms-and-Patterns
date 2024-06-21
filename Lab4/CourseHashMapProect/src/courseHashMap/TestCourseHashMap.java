package courseHashMap;

import java.io.*;
import java.util.*;

public class TestCourseHashMap {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Course.in"));
		
		Map<String, Course> coursesHashMap = new HashMap<>();
		
		while(inFile.hasNext()) {
			Course course = new Course(inFile.next(),inFile.next(),inFile.nextInt(),inFile.nextInt());
			coursesHashMap.put(course.getCourse_no(), course);
		}
		
		Course.searchCourseByCourseNo(coursesHashMap);
		Course.printKeys(coursesHashMap);
		Course.printValues(coursesHashMap);
	}

}
