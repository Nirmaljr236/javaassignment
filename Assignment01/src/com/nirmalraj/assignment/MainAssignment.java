package com.nirmalraj.assignment;
import com.nirmalraj.assignment.employees.Manager;
import com.nirmalraj.assignment.employees.Developer;
import com.nirmalraj.assignment.utilities.EmployeeUtilities;


public class MainAssignment {
	public static void main(String[] args) {
		 Manager manager = new Manager("Raj", 10, 700000, "Digital Marketing");
		 Developer developer = new Developer("jaya", 11, 650000, "Java");
		 EmployeeUtilities.printEmployeeDetails(manager);
		 EmployeeUtilities.printEmployeeDetails(developer);
		 }



}
