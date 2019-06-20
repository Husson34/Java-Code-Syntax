package Practice;

import java.util.Scanner;

public class Buyitem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payment;
		double paymore=0;
		double total=0;
		double price;
		String item;
		Scanner scan=new Scanner (System.in);
		
		
			System.out.println("What would you like to buy?");
			item=scan.nextLine();
			System.out.println("what is the price of the item?");
			price=scan.nextDouble();
			
		do {
			System.out.println("please pay for your item");
			payment=scan.nextDouble();
			total=total+payment;
		
			paymore=price-total;
			System.out.println("please paymore"+paymore);
			
		}while (total !=price);
		
		System.out.println("Please enjoy your"+item);
		
		

	}

}
