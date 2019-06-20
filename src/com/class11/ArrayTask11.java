package com.class11;

public class ArrayTask11 {

	public static void main(String[] args) {
		// create array of cars 6 elements using 2 different loops print all values of the arrray
		
		String [] cars= {"volvo","BMW","accord","Nissan","Jeep","Kia"};
		for (int i=0; i<6; i++) {
			System.out.println(cars[i]);
		}
		for (String birthday:cars) {
			System.out.print(birthday+" ");
	}
}
}
