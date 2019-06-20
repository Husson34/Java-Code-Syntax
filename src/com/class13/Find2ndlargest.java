package com.class13;

public class Find2ndlargest {

	public static void main(String[] args) {
		// find 2nd largest number in array
		
		int array []= {15,8,100,120,3,7,351};
		int max=0;
		int max2=0;
		
		max=array.length;
		for (int i=0;i<max; i++) {
		for (int j=i+1; j<max; j++) {
			if(array[i]>array[j]) {
				max2=array[i];
				array[i]=array[j];
				array[j]=max2;
				
			}
				
			}
		}
		
		System.out.println(array[max-2]);
	}


}