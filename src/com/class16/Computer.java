package com.class16;

public class Computer {

	boolean mouse;
	boolean keyboard;
	int screen;
	int ram;
	String os;
	String brand;
	
	public static void main(String[] args) {
		// ClassName variableName=new ClassName();
				//1 object
Computer comp1=new Computer();
comp1.mouse=true;
comp1.keyboard=true;
comp1.screen=2;
comp1.ram=6;
comp1.os="windows";
comp1.brand="HP";
comp1.watchmovie();
comp1.doJavaCoding();
Computer comp2=new Computer();
comp2.mouse=false;
comp2.keyboard=false;
comp2.screen=4;
comp2.ram=8;
comp2.os="Mac OS";
comp2.brand="apple";
comp2.watchmovie();
comp2.doJavaCoding();

	}
void watchmovie() {
	System.out.println("can watch movie on computer "+brand);
	
}
void doJavaCoding() {
System.out.println("can do coding on computer "+brand);	
}
void playMusic() {
	System.out.println("can play music on computer "+brand);
}
}
