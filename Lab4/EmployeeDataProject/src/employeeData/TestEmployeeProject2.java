package employeeData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;

public class TestEmployeeProject2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner inFile = new Scanner(new FileReader("Employee.in"));
		
		Map<Integer,LinkedListClass> employeeHashMap = new LinkedHashMap<>();
		
		while(inFile.hasNextLine()) {
			String[] temp = inFile.nextLine().split("-999");
			String[] employeeArray = temp[0].split("\\s+");
			Employee employee = new Employee(Integer.parseInt(employeeArray[0]),employeeArray[1],employeeArray[2],Integer.parseInt(employeeArray[3]),Integer.parseInt(employeeArray[4]),employeeArray[5],0);
			LinkedListClass employeeBonusList = new LinkedListClass();
			employeeBonusList.add(employee);
			for(int i = 6; i < employeeArray.length; i++) {
				Employee employeeBonus = new Employee(Integer.parseInt(employeeArray[0]),employeeArray[1],employeeArray[2],Integer.parseInt(employeeArray[3]),Integer.parseInt(employeeArray[4]),employeeArray[5],Integer.parseInt(employeeArray[6]));
				
				employeeBonus.setE_bonus(Integer.parseInt(employeeArray[i]));
				employeeBonusList.add(employeeBonus);
				
				
				
			}
			
			employeeHashMap.put(Integer.parseInt(employeeArray[0]), employeeBonusList);
		}
		
		employeeHashMap.forEach((key, list) -> System.out.println(list.getFirstNode().getInfo()+"\n"+Employee.getBonuses(employeeHashMap, key)));
		
		Employee.searchEmployeeById(employeeHashMap);
	}

}


