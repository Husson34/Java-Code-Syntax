package Practice;

import java.util.Scanner;

public class sumloop {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), provided by a 
		//user and then from that range prints the sum of the even and odd integers.

		int startnum=0;
		int endnum=0;
		int sumeven=0;
		int sumodd=0;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("enter start number");
		startnum=scan.nextInt();
		System.out.println("enter end number");
		endnum=scan.nextInt();
		
		for(int i=startnum;i<=endnum;i++) {
			if (i %2==0) {
				sumeven=sumeven+i;
			}else {
				sumodd=sumodd+i;
				
				
			}
		}
		System.out.println(sumeven);
		
		System.out.println(sumodd);
		
			}
		}
		
		
		
	


