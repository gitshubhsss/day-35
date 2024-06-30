//) Write a program to accept ‘n’ name of cities from the user and sort them in ascending 
 //order
package javaslips;
import java.util.*;
import java.lang.*;
public class slip3ex1 {

	public static void main(String[] args) 
	{
		int i,j,n;
		String temp;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of cities");
		n=shubham.nextInt();
		System.out.println("Enter "+n+" cities");
		String s1[]=new String[n];
		for(i=0;i<n;i++)
		{
			s1[i]=shubham.next();//accept
		}
		System.out.println("unsorted array");
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+s1[i]);//display
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		System.out.println("\n Sorted cities");
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+s1[i]);//display
		}
	}

}
