//Write a program to find the Square of given number using function interface. 
package javaslips;
import java.util.*;
interface Square
{
	int calculate(int x);
}
public class slip16ex1
{

	public static void main(String[] args)
	{
		int x;
		int sqr;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter any number ");
		x=shubham.nextInt();
		sqr=x*x;
		System.out.println("the square of a given number is "+sqr);

	}

}
