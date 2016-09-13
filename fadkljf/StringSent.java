package pracitce.ravi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StringSent
{

	public static String readString()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.nextLine();
		return s;
	}
	public static ArrayList<String> getEvenLengthList(String s)
	{
		String arr[] = s.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i].length())%2==0)
				al.add(arr[i]);
		}
		return al;
	}
	public static ArrayList<String> getOddLengthList(String s)
	{
		String arr[] = s.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i].length())%2!=0)
				al.add(arr[i]);
		}
		return al;
	}
	public static void main(String args[])
	{
		String s=StringSent.readString();
		ArrayList<String> evenList=StringSent.getEvenLengthList(s);
		ArrayList<String> oddList=StringSent.getOddLengthList(s);
		System.out.println("Even:"+evenList);
		System.out.println("Odd:"+oddList);
		Collections.sort(evenList);
		Collections.sort(oddList);
		System.out.println("After Sorting:");
		System.out.println("Even:"+evenList);
		System.out.println("Odd:"+oddList);
	}
}