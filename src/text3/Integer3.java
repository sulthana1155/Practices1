package text3;

import java.util.Scanner;

public class Integer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter number");
		int number =scanner.nextInt();
		
		if(number > 0)
		{
			System.out.println("integer is positive");
		}
		else if(number < 0)
		{
			System.out.println("integer is negative");
		}
		else if(number == 0)
		{
			System.out.println("integer is 0 ");
		}
			
scanner.close();
		}


	



	}


