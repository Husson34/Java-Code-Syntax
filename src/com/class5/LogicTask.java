package com.class5;

import java.util.Scanner;

public class LogicTask {

	public static void main(String[] args) {
		Scanner myScan=new Scanner  (System.in);
		System.out.println("Please enter your height");
int height;
height=myScan.nextInt()/12;
if (height>1 && height<5) {
	System.out.println("short");
}else if (height>=5 && height<6) {
	System.out.println("medium");
}else if (height>=6){
	System.out.println("tall");
}
	}

}
