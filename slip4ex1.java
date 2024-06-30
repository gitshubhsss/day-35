//Write a program to print an array after changing the rows and columns of a 
//given two-dimensional array.
package javaslips;
import java.util.*;
public class slip4ex1 {

	public static void main(String[] args)
	{
		int i,j,m,n;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		m=shubham.nextInt();
		n=shubham.nextInt();
		System.out.println("Enter "+m*n+" rows and coluns");
		int a[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=shubham.nextInt();//array accept;
			}
		}
		System.out.println("\nMatrix A");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("\t"+a[i][j]);//array display
			}
			System.out.println(" ");
		}
		System.out.println("transpose of the matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("\t"+a[j][i]);//here we have did the transpose
			}
			System.out.println("");
		}
	}

}
