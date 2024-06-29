//Current date is : 31/08/2021
//Current date is : 08-31-2021
//Current date is : Tuesday August 31 2021
//Current date and time is : Fri August 31 15:25:59 IST 2021
//Current date and time is : 31/08/21 15:25:59 PM +0530


package javaslips;
import java.text.SimpleDateFormat;
import java.util.Date;
public class forpractice
{

	public static void main(String[] args)
	{
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		String pat1=sdf1.format(date);
		System.out.println("current date is :"+pat1);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("mm/dd/yyyy");
		String pat2=sdf2.format(date);
		System.out.println("current date is : "+pat2);

		SimpleDateFormat sdf3=new SimpleDateFormat("EEEEE MMMMM dd yyyy");
		String pat3=sdf3.format(date);
		System.out.println("current date is :"+pat3);

		SimpleDateFormat sdf4=new SimpleDateFormat("EEEEE MMMMM dd HH:mm:ss e");
		String pat4=sdf4.format(date);
		System.out.println("current date is :"+pat4);

		SimpleDateFormat sdf5=new SimpleDateFormat("dd/MM/yy HH:mm:ss a +0530");
		String pat5=sdf5.format(date);
		System.out.println("current date is:"+pat5);

	}

}
