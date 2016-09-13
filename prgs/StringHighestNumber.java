package practice.sampleprograms;

import java.util.Scanner;
import java.util.TreeSet;

public class StringHighestNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = in.nextLine();
		String arr[] =s.split(" ");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			//StringBuffer sb = new StringBuffer();
			for(int j=0;j<arr[i].length();j++)
			{
				if(Character.isDigit(arr[i].charAt(j)))
				{
					sb.append(arr[i].charAt(j));
				}
				else
				{
					if(sb.length()>0)
					{
						ts.add(new Integer(sb.toString()));
						sb=new StringBuffer();
					}
				}
			}
		}
		System.out.println(ts.last());
	}

}
