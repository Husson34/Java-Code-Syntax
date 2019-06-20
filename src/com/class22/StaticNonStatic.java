package com.class22;

public class StaticNonStatic {

	public String name="John";//instance variable
	public static String lastName="Snow";//static variable
	
	
	
	
	
	public static void main(String[] args) {
		
StaticNonStatic obj=new StaticNonStatic();
obj.getInfo();
getInfo1();//within same class call call it using method or variable name


	}

	public void getInfo() {
		System.out.println("my name is"+name+" and my last name is "+lastName);
	}
	
	public static void getInfo1() {
		//System.out.println("my name is"+name+" and my last name is "+lastName);
		//will get error. name is not static
		System.out.println("I am static");
	}
	
}
