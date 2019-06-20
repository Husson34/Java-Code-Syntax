package com.class4;

import java.util.Scanner;

public class Loantask {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the loan amount?  ");
	int num1=input.nextInt();
		System.out.println(num1);
		if (num1<200000) {
			System.out.println("I will buy the house");
				
			}else {
				System.out.println("I will not buy the house");
		}
		
		

	}

}
