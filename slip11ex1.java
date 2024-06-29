//Define an interface “Operation” which has method volume( ).Define a constant PI having a value 
//3.142 Create a class cylinder which implements this interface (members – radius,height). Create 
//one object and calculate the volume.
package javaslips;
import java.util.*;
interface Operation
{
	double volume();
}
class Vol implements Operation
{
	int r,h;
	double volu;
	public double volume()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=shubham.nextInt();
		System.out.println("Enter the height");
		h=shubham.nextInt();
		volu=r*h;
		System.out.println("volume of cylinder :"+volu);
		return 0;
		
		
	}
}
public class slip11ex1 
{

	public static void main(String[] args)
	{
		Vol v1=new Vol();
		v1.volume();

	}

}
