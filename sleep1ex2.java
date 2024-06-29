package javaslips;
import java.util.*;
abstract class Staff
{
	protected int memberid;
	protected String name;
	
	Staff(int memberid,String name)
	{
		this.memberid=memberid;
		this.name=name;
	}
	
	
}
class OfficeStaff extends Staff
{
     String memberdepartment;
     OfficeStaff(int memberid,String name,String memberdepartment)
     {
    	super(memberid,name); 
    	this.memberdepartment=memberdepartment;
     }
     void display()
     {
    	 System.out.println("memberid= "+memberid);
    	 System.out.println("name = "+name);
    	 System.out.println("member department = "+memberdepartment);
     }
}
public class sleep1ex2
{

	public static void main(String[] args)
	{
		int memberid,n,i;
		String name,memberdepartment;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of records");
	    n=shubham.nextInt();
	    OfficeStaff s1[]=new OfficeStaff[n];
	    for(i=0;i<n;i++)
	    {
	    	System.out.println("Enter meber id :");
	    	memberid=shubham.nextInt();
	    	System.out.println("Enter the name :");
	    	name=shubham.next();
	    	System.out.println("Enter the member department :");
	    	memberdepartment=shubham.next();
	    	s1[i]=new OfficeStaff(memberid,name,memberdepartment);
	    	s1[i].display();
	    }

	}

}
