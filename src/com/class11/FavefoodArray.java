package com.class11;

public class FavefoodArray {

	public static void main(String[] args) {
		//retrieve all values
//      int rows=num.length;
//      System.out.println(rows);
//      
//      int cols=num[2].length;
//      System.out.println(cols);
//create an array of cars- american, german cars, korean cars, italian cars then retrieve all values.
// then create array of countries, north america, south america, europe, asian, african then print all values.
		
String [][] country= {
		{"Canada","Mexico","united States"},
		{"Columbia","Brazil","Peru","Chile"},
		{"Turkey","England","Scotland","Ireland"},
		{"China","Korea","Vietnam"}};

for (int r=0; r<country.length; r++) {
	
	for (int c=0; c<country[r].length; c++) {
		System.out.println(country[r][c]+" ");
		
	}
	System.out.println();
}

	}
	

}
