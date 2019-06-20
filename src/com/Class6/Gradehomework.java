package com.Class6;

import java.util.Scanner;

public class Gradehomework {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade.");
		String grade; 
		String explanation;
		grade=scan.nextLine();
		
		switch (grade) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		default:
			explanation="not acceptable";
			
		}
		System.out.println(grade +" "+ explanation);	
		
		}
	}


