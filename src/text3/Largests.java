package text3;

import java.util.Scanner;

public class Largests {

	public static void main(String[] args) {
		
	
	 Scanner sc =new Scanner(System.in);

		System.out.println("enter 3 integers:");
		 int a =sc.nextInt();
		 int b =sc.nextInt();
		 int c =sc.nextInt();
		if(a>b && a>c)
		{

		System.out.println("a is largest no:");
		}
		else if(b>a && b>c)
		{
		System.out.println("b is lagest no");
		}
		else if(c>a && c>b)
		{
		System.out.println("c is lagest no");
		}
		else
		{
			System.out.println("invalid");
		}
		sc.close();



		}
		}




	


