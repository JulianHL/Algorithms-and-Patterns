package employeeTree;

public class Employee {
private int emp_id;
private String emp_name;
private double emp_salary;

//constructor
public Employee(int emp_id, String emp_name, double emp_salary) {
this.emp_id = emp_id;
this.emp_name = emp_name;
this.emp_salary = emp_salary;
}

//getters and setters
public int getEmp_id() {
return emp_id;
}
public String getEmp_name() {
return emp_name;
}
public double getEmp_salary() {
return emp_salary;
}

public void setEmp_id(int emp_id) {
this.emp_id = emp_id;
}
public void setEmp_name(String emp_name) {
this.emp_name = emp_name;
}
public void setEmp_salary(double emp_salary) {
this.emp_salary = emp_salary;
}

//toString
@Override
public String toString() {
return "Employee Id: " + emp_id + "\tEmployee Name: " + emp_name + "\tEmployee Salary: " + emp_salary;
}

}
