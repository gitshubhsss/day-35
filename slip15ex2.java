//Write a program to define a class Account having members custname, accno. Define default 
 //and parameterized constructor. Create a subclass called SavingAccount with member savingbal, 
 //minbal. Create a derived class AccountDetail that extends the class SavingAccount with 
 //members, depositamt and withdrawalamt. Write a appropriate method to display customer 
 //details.
package javaslips;
import java.util.*;
class Account
{
	String cxname;
	int aconumber;
	Scanner shubham=new Scanner(System.in);
	Account(String cxname,int aconumber)
	{
		this.cxname=cxname;
		this.aconumber=aconumber;
	}
	
}
class SavingAccount extends Account
{
	double savebalance,minbalance;
	SavingAccount(String cxname,int aconumber,double savebalance,double minbalace)
	{
		super(cxname,aconumber);
		this.savebalance=savebalance;
		this.minbalance=minbalance;
	}
}
class AccountDetail extends SavingAccount
{
	double depositamt;
	double withdrawalamt;
	AccountDetail(String cxname,int aconumber,double savebalance,double minbalance,double depositamt,double withdrawalamt)
	{
		super(cxname,aconumber,savebalance,minbalance);
		this.depositamt=depositamt;
		this.withdrawalamt=withdrawalamt;
	}
	
	void display()
	{
		System.out.println("customer name : "+cxname);
		System.out.println("Account number : "+aconumber);
		System.out.println("Savebalance : "+savebalance);
		System.out.println("minbalance : "+minbalance);
		System.out.println("deposite amount :"+depositamt);
		System.out.println("withdrawal amount : "+withdrawalamt);
	}
}
public class slip15ex2 
{

	public static void main(String[] args)
	{
		String cxname;
		int aconumber;
		double savebalance;
		double minbalance;
		double depositamt;
		double withdrawalamt;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the custumer name ");
		cxname=shubham.next();
		System.out.println("Enter the acount number");
		aconumber=shubham.nextInt();
		System.out.println("Enter the saving balance");
		savebalance=shubham.nextDouble();
		System.out.println("Enter the minbalace ");
		minbalance=shubham.nextDouble();
		System.out.println("Enter the deposite amount ");
		depositamt=shubham.nextDouble();
		System.out.println("Enter the withdrawal amount ");
		withdrawalamt=shubham.nextDouble();
		AccountDetail a1=new AccountDetail(cxname,aconumber,savebalance,minbalance,depositamt,withdrawalamt);
		a1.display();
		
	}

}
