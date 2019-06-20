package com.class11;

public class Arraytaskcountry {

	public static void main(String[] args) {
		
		String [] country= {"USA","Canada","Russia","Mexico"};
		for (int i=0; i<country.length;i++) {
			if (country[i].equals("USA")){
					System.out.println("wahington DC");
		}else if (country[i].equals("Canada")) {
			System.out.println("Toronto");
		}else if (country[i].equals("Russia")) {
			System.out.println("Moscow");
		}else if (country[i].equals("Mexico")) {
			System.out.println("Mexico City");
		}
			
		}

	}

}
