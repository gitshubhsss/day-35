//Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, 
//totatruns, bat_avg). Create an array of n player objects .Calculate the 
//batting average for each player using static method avg(). Define a static 
//sort method which sorts the array on the basis of average. Display the
//player details in sorted order.

package javaslips;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
 class CricketPlayer
{
	int temp;
	String name;
	int no_of_innings;
	int no_of_times_notout;
	int totalruns;
	double bat_avg;
	static int cnt=0;
	
	CricketPlayer(String name,int no_of_innings,int no_of_times_notout,int totalruns,double bat_avg)
	{
		this.name=name;
		this.no_of_innings=no_of_innings;
		this.no_of_times_notout=no_of_times_notout;
		this.totalruns=totalruns;
		this.bat_avg=bat_avg;
		cnt++;
	}
	void display()
	{
		System.out.println("name :"+name);
		System.out.println("nuber of inninngs :"+no_of_innings);
		System.out.println("no of times notout :"+no_of_times_notout);
		System.out.println("total runs : "+totalruns);
		System.out.println("batting avg : "+bat_avg);
	}
	void counter()
	{
		System.out.println(cnt+"object has been created");
	}
	float getBatAvg()
	{
		return bat_avg;
		
	}
	public static void SortStudent(CricketPlayer s[],int n)
	{
		int i,j;
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(s[j].getBatAvg()>s[j+1].getBatAvg())
				{
					CricketPlayer t=s[j];
					s[j]=s[j+1];
					s[j+1]=t;
				}
			}
		}
		System.out.println("List of the player as per batting order ___");
		for(i=0;i<n;i++)
		{
			s[i].display();
		}
		
		
	}
    


}
public class Slip2ex2 
{

	public static void main(String[] args)
	{
		String name;
		int no_of_innings;
		int no_of_times_notout;
		int totalruns;
		double bat_avg;
		int n,i;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of players");
		n=shubham.nextInt();
		CricketPlayer p[]=new CricketPlayer[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the player name ");
			name=shubham.next();
			System.out.println("Enter the number of innings");
			no_of_innings=shubham.nextInt();
			System.out.println("Enter the notout ennings");
			no_of_times_notout=shubham.nextInt();
			System.out.println("tolat runs");
			totalruns=shubham.nextInt();
			bat_avg=totalruns/no_of_times_notout;
	        p[i]=new CricketPlayer(name,no_of_innings,no_of_times_notout,totalruns,bat_avg);
	        p[i].counter();
	    }
		CricketPlayer.SortStudent(p,CricketPlayer.cnt);

	}

}

