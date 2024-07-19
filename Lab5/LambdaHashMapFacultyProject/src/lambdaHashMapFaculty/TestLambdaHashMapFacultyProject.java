package lambdaHashMapFaculty;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class TestLambdaHashMapFacultyProject {

	public static void main(String[] args) throws FileNotFoundException {

	Scanner inFile = new Scanner(new FileReader("Faculty.in"));
	HashMap<Integer, Faculty> facultyMap = new HashMap<>();
	
	while(inFile.hasNext()) {
		
		Faculty faculty = new Faculty(inFile.nextInt(), inFile.next(), inFile.next(), inFile.nextDouble(), inFile.nextDouble());
		facultyMap.put(faculty.getF_id(), faculty);
	}
	inFile.close();

	System.out.println("The Faculty you entered in the Map are: " + facultyMap.size()+"\n");
	
	System.out.println("Print Faculty Keys collection using Lambda Expression: ");
	facultyMap.forEach((key, value) -> System.out.println(key));
	
	System.out.println("\nPrint Faculty info V collection using Lambda Expression: ");
	facultyMap.forEach((key, value) -> System.out.println(value));
	
	System.out.println("\n--- Sorted Faculty Map (Sorted by Key) ---");
	facultyMap.values().stream().sorted(Comparator.comparing(Faculty::getF_id)).forEach(System.out::println);
	
	System.out.println("\n--- Sorted faculty Map (Sorted by doCalc_Bonus) ---");
	facultyMap.values().stream().sorted(Comparator.comparing(Faculty::doCalc_Bonus)).forEach(System.out::println);
	
	System.out.println("\n--- Sorted faculty Map (Sorted by doBonus_tax) ---");
	facultyMap.values().stream().sorted(Comparator.comparing(Faculty::doBonus_tax)).forEach(System.out::println);
	
	System.out.println("\n--- Sorted faculty Map (Sorted by Value getF_Salary) ---");
	facultyMap.values().stream().sorted(Comparator.comparing(Faculty::getF_Salary)).forEach(System.out::println);
	
	System.out.println("\n--- Sorted faculty Map (Sorted by Value getF_Lname) ---");
	facultyMap.values().stream().sorted(Comparator.comparing(Faculty::getF_Lname)).forEach(System.out::println);
	
	System.out.println("\n--- Sorted faculty Map (Sorted by Value getF_Lname) reversed ---");
	facultyMap.values().stream().sorted(Comparator.comparing(Faculty::getF_Lname).reversed()).forEach(System.out::println);
	
	System.out.println("\nUsing Stream Processing max Method\nDisplay Max Faculty bonus in the HashMap: ");
	Faculty max = facultyMap.values().stream().max(Comparator.comparing(Faculty::doCalc_Bonus)).get();
	System.out.println(max);
	
	System.out.println("\n--- Creating new key list from Map collection (Sorted by Value doCalc_Bonus) ---");
	List<Integer> sortedKeyList = facultyMap.keySet().stream().sorted(Comparator.comparing(Key -> facultyMap.get(Key).doCalc_Bonus())).collect(Collectors.toList());
	sortedKeyList.forEach(System.out::println);
	
	System.out.println("\n--- Creating new values list from Map collection (Sorted by Value doCalc_Bonus) ---");
	List<Faculty> sortedValueList = facultyMap.values().stream().sorted(Comparator.comparing(Faculty::doCalc_Bonus)).collect(Collectors.toList());
	sortedValueList.forEach(System.out::println);
	
	System.out.println("\nUsing filter() to search for any matching of Faculty last name \"smith\" in HashMap");
	Faculty.optionalKey(facultyMap.keySet().stream().filter(key -> facultyMap.get(key).getF_Lname().equalsIgnoreCase("smith")).findAny());
	
	System.out.println("\nUsing filter() to search for an inexistent of faculty last name in HashMap");
	Faculty.optionalKey(facultyMap.keySet().stream().filter(key -> facultyMap.get(key).getF_Lname().equalsIgnoreCase("Maximo")).findAny());
	
	System.out.println("\nUsing filter() to search for any matching of Faculty bonus rate of \"1.5\" in HashMap");
	facultyMap.values().stream().filter(faculty -> faculty.getF_BonusRate() == 1.5).forEach(System.out::println);;
	
	
	}
}
