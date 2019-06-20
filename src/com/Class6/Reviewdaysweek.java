package com.Class6;

public class Reviewdaysweek {

	public static void main(String[] args) {
		// write a program that will use a switch statement to display what day of the week
		
		int week=3;
		String output;
		
		switch (week) {
		case 1:
			output="Monday";
			break;
		case 2:
			output="tuesday";
			break;
		case 3:
			output="wednesday";
			break;
		case 4:
			output="thursday";
			break;
		case 5:
			output="friday";
			break;
			default:
				output="invalid";
				
			
		}
				System.out.println(output);

	}

}
