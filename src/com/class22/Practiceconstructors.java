package com.class22;


public class Practiceconstructors {
	
	int a,b;
	
	Practiceconstructors(int n1,int n2){
		System.out.println("I have 2 parameters");
		a=n1;
		b=n2;
		System.out.println("the value of a is "+a);
		System.out.println("The value of b is "+b);
		
	}
	
	
	public static void main(String[] args) {
		// Write a program that will have a constructor: one with parameters and second without any parameters.
		//Create a separate Test class where you will execute both of the constructors.
		
	Practiceconstructors obj=new Practiceconstructors(20,10);
	
		
		
			
		

	}

}
