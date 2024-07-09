package employeeData;

import java.io.*;
import java.util.*;

public class TestEmployeeProject1 {
	
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner inFile = new Scanner(new FileReader("Employee.in"));
		
		List <String[]> employeesList = new ArrayList<>();
		
		while(inFile.hasNextLine()) {
			
			String[] temp = inFile.nextLine().split("-999");
			String[] employee = temp[0].split("\\s+");
			employeesList.add(employee);
		}
		
		
		
		for(String[] element : employeesList) {
			
			for(String info : element) {
				System.out.print(info+"\t");
			}
			System.out.println(); 
		}
		
	}
			
}
