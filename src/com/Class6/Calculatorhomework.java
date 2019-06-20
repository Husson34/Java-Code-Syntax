package com.Class6;

import java.util.Scanner;

public class Calculatorhomework {

	public static void main(String[] args) {
		//HomeWork: Using scanner class create
		//calculator. Allow user to enter 2 numbers and
		//operator(+,-,*,/). Based on operator provide the
		//result to user.
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		
		int  result;
		int a;
		int b;
	    char operator;
			
		a=scan.nextInt();
		System.out.println("Please enter math operator");
		operator=scan.next().charAt(0);
		System.out.println("Please enter second number");
		b=scan.nextInt();
		
		switch (operator) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
			default:
				result=0;
					
		}
		
		System.out.println("the result is "+result);
		
	}

}
