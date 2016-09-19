package practice.ravi;

import java.util.Scanner;

public class ContainsDigit {

	public static void containsDigit(int a[],int digit)
	{
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int count=0;
			while(temp!=0)
			{
				if(temp%10==digit)
					count++;
				temp/=10;
			}
			if(count>0)
				System.out.print(a[i]+",");
		}
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=in.nextInt();
		System.out.println("Enter the array:");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("Enter the digit to check:");
		int digit=in.nextInt();
		containsDigit(a,digit);
	}
	
}
