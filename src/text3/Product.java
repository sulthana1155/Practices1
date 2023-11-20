package text3;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);

		System.out.println("enter Quantity:");
		
		int Quantity =sc.nextInt();
	
		 
		if(Quantity>=10)
		{
		
		System.out.println("discount apply on 10%");
		}
		else 
		{
		System.out.println("no discount");
		}
}

}
