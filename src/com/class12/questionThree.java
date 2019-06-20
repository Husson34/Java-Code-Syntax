package com.class12;

public class questionThree {

	public static void main(String[] args) {
		 String str = "Find out how many alpha characters present in a string?";
		    int counter = 0;
		    for (int i = 0; i < str.length(); i++) {
		      if (Character.isLetter(str.charAt(i)))
		        counter++;
		    }
		    System.out.println(counter + " letters.");
		    
		  }
		

	}


