package com.class16;

public class Phone {
	/*Create a Class “Phone”. Create 3 Objects of it: iPhone, Android,
	 *  Nokia with specific  attributes and behaviours.
	 */
	
	boolean screen;
	int touchPad;
	boolean  camera;
	
	public static void main(String[] args) {
Phone iPhone=new Phone();
iPhone.screen=true;
iPhone.touchPad=1;
iPhone.camera=true;
iPhone.watchMovies();
iPhone.text();
iPhone.takepicture();

Phone Android=new Phone();
Android.screen=true;
Android.touchPad=1;
Android.camera=true;
Android.takepicture();
Android.text();
Android.watchMovies();
	}
void takepicture() {
	System.out.println("can take pictures with phone");
}
void text() {
	System.out.println("can text with phone");
}
void watchMovies() {
	System.out.println("can watch movies on phone");
}
}
