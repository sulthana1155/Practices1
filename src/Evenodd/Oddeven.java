package Evenodd;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
	Scanner scanner =new Scanner(System.in);
			
	System.out.println("enter the no:");
	int no =scanner.nextInt();
	
if(no%2 == 0)
	{
		System.out.println("given no is even");
	}
	else
	{
		System.out.println("given no is odd");
	
	}
	scanner.close();
	

	}

}
