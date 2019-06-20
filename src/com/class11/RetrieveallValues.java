package com.class11;

public class RetrieveallValues {

	public static void main(String[] args) {
		//create an array of cars- american, german cars, korean cars, italian cars then retrieve all values.
String [][] cars= {
		{"Ford","Dodge","Jeep","Chrysler"},
		{"BMW","Mercedes"},
		{"Kia","Hyundai","Honda","Isuzu"},
		{"Fiat","Mazeradi","Ferrari"}};
for (int i=0; i<cars.length;i++) {
	for (int j=0; j<cars[i].length;j++) {
		System.out.println(cars[i][j]);
		
	}
	System.out.println();
}
	}

}
