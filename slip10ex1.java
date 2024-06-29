//Write a program to find the cube of given number using functional interface.
package javaslips;
import java.util.*;
interface Cube
{
	 float cube();
}
class Ans implements Cube
{
	public float cube()

{
		int x;
		double Cuboff;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter any number");
		x=shubham.nextInt();
		Cuboff=(x*x*x);
		System.out.println("Cube of the entered number is "+Cuboff);
		return 0;
}
}
public class slip10ex1 
{
	public static void main(String[] args) 
	{
		Ans a1=new Ans();
		a1.cube();
	}

}
