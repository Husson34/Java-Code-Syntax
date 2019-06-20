package com.class12;

public class MaxValueinarray {

	public static void main(String[] args) {
		//find max value in array
		
		int [][] array= {
				{8,9,15,3},
				{100,200,3},
				{1,5,5,150}
		
		};
		int maxValue=0;
				for (int i=0; i<array.length; i++) {
					for (int j=0; j<array[i].length;j++) {
						if (array[i][j]>maxValue) {
							maxValue=array[i][j];
						}
					
						
					}
		
					
				}
				System.out.println(maxValue);
				
		}
				
	}

