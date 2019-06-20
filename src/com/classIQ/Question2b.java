package com.classIQ;

import java.util.Arrays;

public class Question2b {

	public static void main(String[] args) {
		// second largest number in array
		
		int[] numArray= {12,150,261,5,9};
		
		Arrays.sort(numArray);
		System.out.println(numArray[numArray.length-2]);

	}

}
