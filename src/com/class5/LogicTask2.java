package com.class5;

import java.util.Scanner;

public class LogicTask2 {

	public static void main(String[] args) {
		int quiz;
		int midterm;
		int finalScore;
		
		
		Scanner myScan=new Scanner(System.in);
		System.out.println("What was you score for Quiz?");

quiz=myScan.nextInt();
System.out.println("What is your score for Mid Term?");
midterm=myScan.nextInt();
System.out.println("What is your score for Final Score?");
finalScore=myScan.nextInt();
System.out.println();
double avgScore=(quiz+midterm+finalScore)/3;
if (avgScore>=90) {
	System.out.println(avgScore +" A");
	
}else if (avgScore>=70 && avgScore<90) {
	System.out.println(avgScore +" B");
}else if (avgScore>=50 && avgScore<70) {
	System.out.println(avgScore+ " C");
}else if (avgScore<50){
	System.out.println(avgScore +" F");
}
}

}
