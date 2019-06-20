package com.Class6;

import java.util.Scanner;

public class Languagehomework {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the country you are from.");
		String country;
		String language;
		country=scan.nextLine();
		
		
		
		switch (country) {
		
		case "Russia":
			language="Russian";
			break;
		case "USA":
			language="English";
			break;
		case "China":
			language="chinese";
			break;
		case "Spain":
			language="Spanish";
			break;
		case "France":
			language="French";
			break;
		default:
			language="unknown";
			
			}
		System.out.println("The language you speak is "+language);
		
	}

}
