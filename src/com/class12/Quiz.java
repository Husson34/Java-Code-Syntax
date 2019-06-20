package com.class12;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following requirements:

		Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		Password should be minimum 8 characters, if less → message=”Password is too short”.
		Password cannot contain username if so, → message=”Password cannot contain username”.
		Password should match confirmed password, if not  → message=“Passwords do not match”.
		Only after all requirements met → message “Your username and password has been created”


		 */
String username,password,confirmpassword, message;
Scanner scan=new Scanner (System.in);

System.out.println("Please Enter your Username.");
username=scan.nextLine();

System.out.println("Please enter Password.");
password=scan.nextLine();

System.out.println("Please Confirm your password.");
confirmpassword=scan.nextLine();

if (!(username.isEmpty() && password.isEmpty()) ){
	if (password.length()> 8) {
		if (!password.contains(username)) {
			if (password.equals(confirmpassword)){
				message="Your Username and Password have been created";
				
			}else {
				message="Passwords do not match";
			}
		}else {
			message="password can not contain username";
		}
	
	}else {
		message="password is too short";
	}
}else {
	message="Username and Password cannot be empty";
	
}
System.out.print(message);
		
	}
	
	
}
		
	


