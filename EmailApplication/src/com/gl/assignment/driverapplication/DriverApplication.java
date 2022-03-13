package com.gl.assignment.driverapplication;
import com.gl.assignment.credentialservice.CredentialService;
import com.gl.assignment.employee.Employee;
import java.util.Scanner;

/*
 * Driver Application Class
 * @author :- Prateek Singh
 * @description :- Assignment1 Java OOPS Concept
 * 
 * @param - choice between 0 to 4 
 * @return -  return the generated email and password and display it to user
 */

public class DriverApplication {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		do {

			System.out.println(" Please Select the Department from the following ");
			System.out.println("         1. Technical     ");
			System.out.println("         2. Admin     ");
			System.out.println("         3. Human Resource     ");
			System.out.println("         4. Legal    ");
			System.out.println("        Press 0 to exit. ");
			// Scanner method to take input choice from user
			
			choice = scanner.nextInt();
			retrieveDept(choice,scanner);

		} while (choice != 0);

	scanner.close();

	}

	/**
	 * 
	 * @param departmentName
	 * @param firstName      --> user input
	 * @param lastName       --> user input
	 * 
	 *                       retrieve Dept method, which will retrieve the
	 *                       department name based on the selection of department(admin ,hr ,legal,technical)
	 *       
	 *                       firstName and lastName will be supplied to class
	 *                       CredentialService to generate password and
	 *                       email_address
	 * 
	 */
	public static void retrieveDept(int choice,Scanner scanner) {
		
		if (choice != 0) {
			
			System.out.println("enter First Name ");
			String firstName = scanner.next();
			System.out.println("enter Last Name ");
			String lastName = scanner.next();
			Employee emp = new Employee(firstName, lastName);
			CredentialService cred = new CredentialService();
			
			// data member
		    String departmentName="";
			String email_address;
			char[] password;

			switch (choice) {

			case 1:
				
				departmentName = "tech";
				
				break;
				
			case 2:
				
				departmentName = "admin";
				
				break;
				
			case 3:
				
				departmentName = "hr";
				
				break;
				
			case 4:
				
				departmentName = "legal";
				
				
			
				
				break;
				
			default:
				
				System.out.println(" Invalid Selection!!! Please select between 0-4 ");

			}
			
			email_address = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), departmentName);
			password = cred.generatePassword(8);
			cred.showCredentials(emp.getFirstName(), email_address, password);
			
			System.out.println("  ");
			
		}
	}

}
