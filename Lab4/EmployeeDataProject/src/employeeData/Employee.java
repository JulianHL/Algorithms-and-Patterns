package employeeData;

import java.util.Map;
import java.util.Scanner;

public class Employee {
private int e_id;
private String e_lname;
private String e_fname;
private int e_salary;
private int d_id;
private String e_position;
private int e_bonus;

public Employee(int e_id, String e_lname, String e_fname, int e_salary, int d_id, String e_position, int e_bonus) {
	this.e_id = e_id;
	this.e_lname = e_lname;
	this.e_fname = e_fname;
	this.e_salary = e_salary;
	this.d_id = d_id;
	this.e_position = e_position;
	this.e_bonus = e_bonus;
}
public int getE_Id() {
	return e_id;
}
public void setE_Id(int e_id) {
	this.e_id = e_id;
}
public String getE_lname() {
	return e_lname;
}
public void setE_lname(String e_lname) {
	this.e_lname = e_lname;
}
public String getE_fname() {
	return e_fname;
}
public void setE_fname(String e_fname) {
	this.e_fname = e_fname;
}
public int getE_salary() {
	return e_salary;
}
public void setE_salary(int e_salary) {
	this.e_salary = e_salary;
}
public int getD_id() {
	return d_id;
}
public void setD_id(int d_id) {
	this.d_id = d_id;
}
public String getE_position() {
	return e_position;
}
public void setE_position(String e_position) {
	this.e_position = e_position;
}
public int getE_bonus() {
	return e_bonus;
}
public void setE_bonus(int e_bonus) {
	this.e_bonus = e_bonus;
}

//toString
@Override
public String toString() {
	return "Employee N: " + e_id + ", Employee Name: " + e_lname + " " + e_fname + ", Employee Salary: " + e_salary;
}

public String toString2() {
	return "The Employee Information is :"+e_id+"//"+e_lname+"//"+e_fname+"//"+e_salary+"//"+e_position+"//"+e_bonus+"$";
}


//get bonuses

public static String getBonuses(Map<Integer, LinkedListClass> employeeHashMap, int e_id) {
	LinkedListNode currentNode = employeeHashMap.get(e_id).getFirstNode().getLink();
	String bonuses = "";
	for(int i = 1; currentNode != null; i++) {
		bonuses += ("Bonus " + i + ": " + currentNode.getInfo().getE_bonus()+"\n");
		
		currentNode = currentNode.getLink();
		}
	return bonuses;
}


//search by e_id
public static void searchEmployeeById(Map<Integer, LinkedListClass> employeeHashMap) {
	

	Scanner input = new Scanner(System.in);
	System.out.print("Please enter employee id for search: ");
	int e_id = input.nextInt();
	input.close();
	LinkedListNode currentNode = employeeHashMap.get(e_id).getFirstNode().getLink();
	if(currentNode == null) {
		System.out.println("Employee not found");
		return;
	}
	else {
		int sumE_bonuses = 0;
		String e_bonuses = "";
		System.out.println("Employee found "+currentNode.getInfo().toString2()+"\n");
		System.out.println("Displaying the components of the linked list for emp_id: "+e_id);
		while(currentNode != null) {
			String currentE_bonus_String = currentNode.getInfo().toString2()+"\n";
			int currentE_bonus = currentNode.getInfo().getE_bonus();
			sumE_bonuses += currentE_bonus;
			e_bonuses += currentE_bonus_String;
			currentNode = currentNode.getLink();
		}
		System.out.println(e_bonuses + "Total bonuses: for emp_id: "+e_id+" is "+sumE_bonuses+"$");
	}
}
}
