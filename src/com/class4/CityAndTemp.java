package com.class4;

import java.util.Scanner;

public class CityAndTemp {

	public static void main(String[] args) {
		/*
		 * Ask user to enter city and temp in fahrenheit
		 * Your program should say"the temp in the city is "
		 * your program should convert f to c
		 */
String cityName;
int temp;

Scanner myScanner=new Scanner(System.in);
System.out.println("Please enter your city");

cityName=myScanner.nextLine();
System.out.println("Please enter the Temperature in Fahrenheit");
temp=myScanner.nextInt();
int convertTemp=(temp-32)*5/9;
System.out.println("the temp in the city "+cityName+ " is "+convertTemp);


	}

}
