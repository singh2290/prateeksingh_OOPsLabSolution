package com.gl.assignment.employee;


/**
 *  Employee class  will take only FirstName and LastName and return it using getter method.
 *   
 *
 */

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
