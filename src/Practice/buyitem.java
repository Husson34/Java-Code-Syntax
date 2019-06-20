package Practice;

import java.util.Scanner;

public class buyitem {

	public static void main(String[] args) {
		// Ask user to enter the item they want to buy and  the price for the item. 
		//Then ask user to pay for it. Every time user enters money accumulate the amount
		//and tell user how much is left to pay off the amount.
		//Whenever user done with payments tell them "Thank you for shopping!"
		
		Scanner scan;
		String item;
		double price;
		double money;
		double total = 0;
		double needMore;
		scan = new Scanner(System.in);
		System.out.println("Please enter the item you want to purchase");
		item = scan.nextLine();
		System.out.println("Please enter the cost of the item");
		price = scan.nextDouble();
		do {
		System.out.println("Please pay for your item");
		money = scan.nextDouble();
		total = total + money;
		needMore=price-total;
		System.out.println("Please add more "+needMore);
		} while (total != price);
		System.out.println("Please enjoy your " + item);
		}
		

		
	}
