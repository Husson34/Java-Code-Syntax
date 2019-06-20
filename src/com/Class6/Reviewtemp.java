package com.Class6;

public class Reviewtemp {

	public static void main(String[] args) {
		// Write a program to find out what to do for the following temperatures
        // Temperatures is greater than 100 print out Stay inside it's too hot
        // temperatures is greater than 50 and less than 99 print out Wear winter clothes
        // temperatures is greater than 30 and less than 49 print out Wear winter clothes
        // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
        // lastly if the temperature  is lower than that print out Call for help it's too cold outside
		// if else if
		int temp= 40;
		String output;
		
		if (temp >+100) {
			output="Stay inside it is too hot";
		}else if (temp>=50 && temp<=99) {
			output="wear summer clothes";
		}else if (temp>30 && temp<49) {
			output="wear winter clothes";
		}else if (temp>10 && temp<29) {
			output="Stay inside its too cold";
		}else {
			output="call for help its too could outside";
			
				
			}
			System.out.println(output);
		}
		
		
	}


