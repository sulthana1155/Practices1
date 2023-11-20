package text3;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
			Scanner scanner =new Scanner(System.in);
					
			System.out.println("enter the year:");
			int year =scanner.nextInt();
			
			if (year%4==0)
			{
				System.out.println("The year is leap year");

			}
			else if(year%100==0)
			{
				System.out.println("The year is leap year");

			}
			else if(year%400==0)
			{
				System.out.println("The year is not a leap year");
			}
			else
			{ 				System.out.println("The year is not a leap year");
			
			}
	}
}
