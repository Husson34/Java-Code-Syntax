package com.Class6;

import java.util.Scanner;

public class ReplHomework {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
		  System.out.println("Do you need a loan?");
		  
		  boolean result;
		  int score=0;
		  String eligibility=null;
		  result=scan.nextBoolean();
		  
		 if (result) {
		   System.out.println("What is your credit score?");
		   
		   score=scan.nextInt();
		 
		  if (score<600) {
			  eligibility="Not eligible";
		 }else if (score>600 && score<=700) {
		   eligibility="Maybe eligible";
		 }else if (score>=701 && score<=800) {
		   eligibility="Eligible";
		 }else if (score>800) {
		   eligibility="Definitely eligible";
		 }else {
			 eligibility="UnKnown";
			 
		 }
			 
			 
		 
	}
		 System.out.println("The eligibility is "+eligibility);
	}

	}

	

