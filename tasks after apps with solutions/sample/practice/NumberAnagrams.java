package sample.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberAnagrams {

	public static boolean isAnagram(int a,int b)
	{
		
		if((int)Math.log10(a)!=(int)Math.log10(b))
			return false;
		else
		{
			List<Integer> firstList=NumberAnagrams.getListOfNumber(a);
			List<Integer> secondList=NumberAnagrams.getListOfNumber(b);
			Collections.sort(firstList);
			Collections.sort(secondList);
			int num1=0,num2=0;
			for(int x:firstList)
				num1=num1*10+x;
			for(int x:secondList)
				num2=num2*10+x;
			if(num1==num2)
				return true;
			else
				return false;
		}
	}
	public static List<Integer> getListOfNumber(int a)
	{
		List<Integer> li = new ArrayList<Integer>();
		while(a!=0)
		{
			li.add(a%10);
			a/=10;
		}
		return li;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=in.nextInt();
		System.out.println("Enter array elements:");
		int a[] = new int[size];
		for(int i=0;i<size;i++)
			a[i]=in.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(NumberAnagrams.isAnagram(a[i], a[j]))
					System.out.println("["+a[i]+","+a[j]+"]");
			}
		}
	}
}
