package forloop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method 

Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the number:");
		
	int number =scanner.nextInt();
int i;
	for( i=1; i<=10; i++)
	{

System.out.println(number+"*"+i+"="+number*i);
	}

}
}
