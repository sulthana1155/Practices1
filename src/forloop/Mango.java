package forloop;

import java.util.Scanner;

public class Mango {

	public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the number:");
		int number =scanner.nextInt();
	
       for(int i=1;i<=50;i++)
		{
			
			if(i%3==0 && i%5==0)
			{
				System.out.println("orangemango");
			}
				else if(i%3==0)
				{
					System.out.println("orange");
				}
				else if(i%5==0) 
				{
					System.out.println("mango");

				}
	
		}
		
		}
}
