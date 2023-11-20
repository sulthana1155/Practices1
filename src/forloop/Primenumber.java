package forloop;
import java.util.Scanner;

public class Primenumber {
	

	public static void main(String[] args) {

Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the number:");
		int number =scanner.nextInt();
		
		
int i,count=0;	
	for( i=2; i<=number; i++)
	{
if(number%i==0)
{
	count++;
}
	}if(count==2) 
	{
System.out.println("not a prime no");	
}
else {
System.out.println(" prime no");
	}

	}
}

