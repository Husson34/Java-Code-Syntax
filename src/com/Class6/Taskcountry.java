package com.Class6;

import java.util.Scanner;

public class Taskcountry {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String country;
		String favoriteFood;
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		case "USA":
			favoriteFood="Burger";
			break;
		case "Canada":
			favoriteFood="hotdog";
			break;
		case "Mexico":
			favoriteFood="taco";
			break;
		case "Russia":
			favoriteFood="fish";
			break;
		default:
			favoriteFood="Unknown";
		}
			System.out.println("your favorite is "+favoriteFood);
			
			
		}
		

	


	}


