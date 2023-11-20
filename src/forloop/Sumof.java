package forloop;

import java.util.Scanner;

public class Sumof {

	public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the starting number:");
		int startingnumber =scanner.nextInt();
		
		System.out.println("enter the ending number:");
		int endingnumber =scanner.nextInt();
		int sum=0;
		int number;
		for(number=startingnumber; number<=endingnumber; number++)
		{
		if(number%2==0)
		sum =sum+number;
	}
	
	System.out.println("sum is:" +sum);
	scanner.close();
		}
		
	}


