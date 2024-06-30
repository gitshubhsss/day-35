//Define a class patient (patient_name, patient_age, 
//patient_oxy_level,patient_HRCT_report). Create an object of patient. Handle 
//appropriate exception while patient oxygen level less than 95% and HRCT scan 
//report greater than 10, then throw user defined Exception “Patient is Covid 
//Positive(+) and Need to Hospitalized” otherwise display its information.

package javaslips;
import java.util.*;
class Patient
{
	String name;
	int age;
	double oxylevel;
	double HRCT;
	
	Patient(String name,int age,double oxylevel,double HRCT)
	{
		this.name=name;
		this.age=age;
		this.oxylevel=oxylevel;
		this.HRCT=HRCT;
	}
}
public class slip3ex2 extends Exception
{

	public static void main(String[] args)
	{
		String name;
		int age;
		double oxylevel;
		double HRCT;
		int i,n;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of patient");
		n=shubham.nextInt();
		System.out.println("Enter "+n+" patients detail");
		Patient p1[]=new Patient[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the name of the patient");
			name=shubham.next();
			System.out.println("Enter the age");
			age=shubham.nextInt();
			System.out.println("Enter the oxygen level");
			oxylevel=shubham.nextDouble();
			System.out.println("Enter the HRCT");
			HRCT=shubham.nextDouble();
			p1[i]=new Patient(name,age,oxylevel,HRCT);
		}
		for(i=0;i<n;i++)
		{
			if(p1[i].oxylevel>95&&p1[i].HRCT>10)
			{
				try
				{
					throw new NullPointerException("\n");
				}
				catch(Exception e)
				{
					System.out.println("patient needs to be hospitalized patient is covid positive");
				}
			}
			else
			{
				System.out.println("Name:"+p1[i].name);
				System.out.println("age :"+p1[i].age);
				System.out.println("oxylevel :"+p1[i].oxylevel);
				System.out.println("HRCT : "+p1[i].HRCT);
			}
		}

	}

}
