package com.gl.assignment.credentialservice;

import java.util.Random;

/*
 * CredentialService class will extend Employee to take the first name and last
 name value to generate email id, generate password and show credentials
 
 @param first      name of employee
 @param Last       name of employee
 @param Department of employee
 
 @return email id - firstNamelastName@departmentName.comapanyname.com
 @return password
 */

public class CredentialService {
	public String generateEmailAddress(String firstName, String lastName, String departmentName) {
		
		String email_address = firstName + lastName + "@" + departmentName + ".gl.com";
		return email_address;
	}

	public char[] generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}

	public void showCredentials(String firstName, String email_address, char[] password) {
		
		System.out.println("Dear " + firstName + " your generated credentials are as follow");

		System.out.println("Email -----> " + email_address);
		System.out.println("Password -----> " + new String(password));

	}

	@Override
	public String toString() {
		return "CredentialService [toString()=" + super.toString() + "]";
	}

}

