package OfficeDetails;
import java.util.*;
public class Office {
    public static void displayDetails(HashMap<Integer,Employee> employees) {
    	for(Employee employee:employees.values()) {
    		System.out.println(employee);
    	}
    }
	public static void main(String[]args) {
	  HashMap<Integer,Employee> employees = new HashMap<>();
	  employees.put(1,new Employee("AMLAN","CSE",20,25000));
	  employees.put(2,new Employee("AMLAN","CSE",20,30000));
	  employees.put(3,new Employee("AMLAN","CSE",18,30000));
	  employees.put(4,new Employee("BOB","CSE",25,30000));
	  System.out.println("Employees before sorting: ");
	  displayDetails(employees);
	  System.out.println("Employees after sorting: ");
	  Collections.sort(employees, new sortEmployees());
	  displayDetails(employees);
  }
}
