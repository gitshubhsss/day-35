//Write a program to read the First Name and Last Name of a person, his weight and height using 
 //command line arguments. Calculate the BMI Index which is defined as the individual's body mass 
 //divided by the square of their height.
 //(Hint : BMI = Wts. In kgs / (ht)2

package javaslips;
import java.util.*;
public class sleep2ex1 {

	public static void main(String[] args)
	{
		String firstname,lastname;
		double weight,height,BMI;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter fist name");
		firstname=shubham.next();
		System.out.println("Enter last name");
		lastname=shubham.next();
		System.out.println("Enter weight in kg");
		weight=shubham.nextDouble();
		System.out.println("Enter the height ");
		height=shubham.nextDouble();
		BMI=weight/height*height;
		System.out.println("BMI = "+BMI);
		System.out.println("first name :"+firstname);
		System.out.println("last name :"+lastname);
		System.out.println("weight : "+weight);
		System.out.println("height :"+height);
		System.out.println("BMI :"+BMI);

	}

}
