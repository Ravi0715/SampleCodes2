package pracitce.ravi;

import java.util.ArrayList;
import java.util.Scanner;

class OddPrime
{
	public static int[] readArray()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		return a;
	}
	public static ArrayList<Integer> getOddPrime(int a[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				int count=OddPrime.isPrime(a[i]);
				if(count==0)
					al.add(a[i]);				
			}
		}
		return al;
	}
	/*public static int isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;					
		}
		return count;
	}*/
	public static int isPrime(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		int a[] =OddPrime.readArray();
		ArrayList<Integer> al=OddPrime.getOddPrime(a);
		System.out.println(al);
		
	}
}
