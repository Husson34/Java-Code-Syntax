package com.class9;

public class Reviewarray1 {

	public static void main(String[] args) {
		/*
	        * Write a program to produce the following pattern
	        *
	....1
	...2.
	..3..
	.4...
	5....

	        *
	        */
		 for(int i =1; i<=5; i++) {
	            for(int k = 1; k<=(5-i); k++) {
	                System.out.print(".");
	            }
	            
	            System.out.println(i);
	
	
			
		}
		
		
	

	}	

}
