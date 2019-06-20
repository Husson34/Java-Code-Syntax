package com.class9;

public class Youtubepattern {

	public static void main(String[] args) {
		
		Youtubepattern demo= new Youtubepattern();
		demo.upsideDownPyramid();
		
		
		
		}
	
	void upsideDownPyramid () {
		int max=5;
		for (int i =1; i<=5; i++) {
			System.out.println();
			for(int j=1; j<=max;j++) {
				System.out.print("*");
			}
			max--;
		}
	}
	}

