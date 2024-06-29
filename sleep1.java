package javaslips;
import java.util.*;
public class sleep1

{
	public static void main(String[] args)
	{
		int i,n,temp=0;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter any number which you want");
		n=shubham.nextInt();
		for(i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}

}
