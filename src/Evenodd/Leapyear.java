package Evenodd;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
				
		System.out.println("enter the year:");
		int year =scanner.nextInt();
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println("The year is leap year");

		}
		else
		{
			System.out.println("The year is not a leap year");

		}
	}

}
