package com.class4;

import java.util.Scanner;

public class DriversLicense {

	public static void main(String[] args) {
		
		Scanner dmv=new Scanner(System.in);
		System.out.println("How old are you?");
		int num1=dmv.nextInt();
		
		if (num1>18) {
			System.out.println("You can get a drivers license");
		}else if (num1<18) {
			System.out.println("You can get a drivers permit");
		}else {
			
		}

	}

}
