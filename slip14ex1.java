//: Write a program to accept a number from the user, if number is zero then throw user 
//defined exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).
package javaslips;
import java.util.*;
class Zerono extends Exception
{
	
}
class prime
{

	int count=0;
}
public class slip14ex1 {

	public static void main(String[] args)
	{
		int i,j,n;
		int count=0;
		Scanner shubham=new Scanner(System.in);
		try
		{
			System.out.println("Enter any number ");
			n=shubham.nextInt();
			if(n==0)
			{
				throw new Zerono();
			}
			if(n>0)
			{
				for(i=2;i<n/2;i++)
				{
					if(n%i==0)
					{
						count++;
					}
				}
			}
			if(count==0)
			{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is not prime ");
			}
		}
		catch(Zerono ob)
		{
			System.out.println("number cannot be zero");
		}
	}

}
