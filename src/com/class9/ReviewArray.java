package com.class9;

public class ReviewArray {

	public static void main(String[] args) {
		/*Write a program that prints the following pattern
        *
....1
...2
..3
.4
5*/
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=(5-i);y++) {
				System.out.print(".");
			}
				
				System.out.println(i);
		}

	}

}
