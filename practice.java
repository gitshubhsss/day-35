//Define an abstract class Staff with protected members id and name. Define 
//a parameterized constructor. Define one subclass OfficeStaff with member 
//department. Create n objects of OfficeStaff and display all details.
package javaslips;
import java.util.*;
abstract class Staff
{
	protected int memberid;
	protected String name;
	
}
class OfficeStaff extends Staff
{
	String memberdepartment;
	OfficeStaff(int memberid,String name,String memberdepartment)
	{
		this.memberid=memberid;
		this.name=name;
		this.memberdepartment=memberdepartment;
	}
	void display()
	{
		System.out.println("meber id : "+memberid);
		System.out.println("name : "+name);
		System.out.println("member department :"+memberdepartment);
	}
}
public class practice
{
	public static void main(String args[])
	{
		int n,i;
		int memberid;
		String name;
		String memberdepartment;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of records");
		n=shubham.nextInt();
		OfficeStaff o1[]=new OfficeStaff[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the member id");
			memberid=shubham.nextInt();
			System.out.println("Enter the name ");
			name=shubham.next();
			System.out.println("Enter the member department");
			memberdepartment=shubham.next();
			o1[i]=new OfficeStaff(memberid,name,memberdepartment);
			o1[i].display();
		}
	}
}
