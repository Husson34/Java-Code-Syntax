package com.Class6;

public class Reviewmonth {

	public static void main(String[] args) {
		// write a program that use switch statement what will display the month that we are in
		
		int month=3;
		String output;
		
		switch (month) {
		case 1:
			output="Jan";
			break;
		case 2:
			output="Feb";
			break;
		case 3:
			output="Mar";
			break;
		case 4:
			output="Apr";
			break;
		case 5:
			output="May";
			break;
		case 6:
			output="June";
			break;
		case 7:
			output="July";
			break;
		case 8:
			output="Aug";
			break;
		case 9:
			output="Sep";
			break;
		case 10:
			output="Oct";
			break;
		case 11:
			output="Nov";
			break;
		case 12:
			output="Dec";
			break;
			default:
				output="invalid";
				
			
		
		
		}
		
		System.out.println(output);
		

	}

}
