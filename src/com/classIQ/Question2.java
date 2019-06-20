package com.classIQ;

public class Question2 {

	public static void main(String[] args) {
		// swap 2 strings
		
		String x="Hello";
		String y="Welcome";
		
		x=x+y;
		y=x.substring(0,(x).length()-y.length());
		x=x.substring(y.length());
		System.out.println("x= "+x);
		System.out.println("y= "+y);

	}

}
