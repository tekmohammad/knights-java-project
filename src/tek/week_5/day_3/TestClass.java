package tek.week_5.day_3;

import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {		
		
		/*
		 * In the context of object-oriented programming, an object is an 
		 * instance (copy) of a class. When a class is defined, no memory 
		 * is allocated but when it is instantiated 
		 * (i.e., an object is created) memory is allocated.
		 */
		
		Employee employeeObj = new Employee();
		employeeObj.firstName = "Alex";
		employeeObj.lastName = "Curreto";
		employeeObj.printInfo();
		
		Employee secondEmployeeObj = new Employee();
		employeeObj.firstName = "Second Employee";
		employeeObj.lastName = "Second Employee last Name";
		employeeObj.printInfo();
	}
}
