package com.class5;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Find the largest of 3 numbers the user inputs using if else
		 */
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
		
		if (a>b && a>c) {
			System.out.println(a+" is the larger number");
		}else if (b>a && b>c) {
				System.out.println(b+" is the larger number");
			}else if (c>a && c>b){
				System.out.println(c+" is the larger number");
				

				
			}
		}
	}


