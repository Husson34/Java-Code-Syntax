package com.class4;

import java.util.Scanner;

public class ScanClass {

	public static void main(String[] args) {

		//take an input from user and print that number
		//int for numbers string for words
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		
		
		System.out.println("good morning "+name);
		
		
	}
}

