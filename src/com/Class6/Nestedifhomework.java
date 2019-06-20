package com.Class6;

import java.util.Scanner;

public class Nestedifhomework {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		
		double a;
		double b;
		double c;
		System.out.println("Please enter first number");
		a=myScan.nextDouble();
		System.out.println("Please print 2nd number");
		b=myScan.nextDouble();
		System.out.println("Please print 3rd number");
		c=myScan.nextDouble();
		
		if (a>b) {
			if (a>c) {
				System.out.println(a+"is the largest");
			}else {
				System.out.println(c+"is the largest");
			}
			}else{
				if (b>c) {
					System.out.println(b+"is the largest");
				}else {
					System.out.println(c+"is the largest");
			}
		}

	}

}
