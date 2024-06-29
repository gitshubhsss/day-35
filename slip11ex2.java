//Write a program to accept the username and password from user if username and password are
//not same then raise "Invalid Password" with appropriate msg.
package javaslips;
import java.util.*;
public class slip11ex2 {

	public static void main(String[] args)
	{
		String use;
		String pass;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the username and passward");
		String s1=shubham.nextLine();
		String s2=shubham.nextLine();
		if(s1.equals(s2)==true)
		{
			System.out.println("Enter the username");
			use=shubham.next();	
		}
		else if(s2.equals(s1)==true)
		{
			System.out.println("Enter the passward");
			pass=shubham.next();
		}
		else if(s1.equals("shubham")==true&& s2.equals("dhoni")==true)
		{
			System.out.println("login succesfully");
		}
		else
		{
			System.out.println("invalid passward");
		}

	}

}
