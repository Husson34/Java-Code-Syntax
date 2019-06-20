package com.class12;

import java.util.Scanner;

public class Practicetask {

	public static void main(String[] args) {
		/*Accept username, password and confirm password and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message “Passwords do not match”.
Only after all requirements met → message “Your username and password has been created”*/
		
		Scanner scan=new Scanner (System.in);
		String userName,passWord,confirmPassword,message;
		System.out.println("Please enter your Username");
		userName=scan.nextLine();
		System.out.println("Please enter Password");
		passWord=scan.nextLine();
		System.out.println("Please confirm your password");
		confirmPassword=scan.nextLine();
		
		if (!(userName.isEmpty() && passWord.isEmpty())) {
			if(passWord.length() > 8) {
				if (!passWord.contains(userName)) {
					if (passWord.equals(confirmPassword)) {
						message="username and password have been created";
					}else {
						message="Passwords do not match";
					}
				}else{
					message="Password cannot contain username";
				}
			}else {
				message="Password is too short";
			
			}
		}else {
			message="username and password cannot be empty";
			
	}
		System.out.println(message);
}
	
}