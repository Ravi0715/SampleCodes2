package pracitce.ravi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CheckAnagram {

	/*public static int getAsciiCount(String s)
	{
		int n=0;
		for(int i=0;i<s.length();i++)
			n+=(int)s.charAt(i);
		return n;
	}*/
	public static String getAsciiCount(String s)
	{
		/*List<Character> li = new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
			li.add(s.charAt(i));
		Collections.sort(li);
		StringBuffer sb = new StringBuffer();
		for(char ch:li)
			sb.append(ch);*/
		char ch[]= s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	public static boolean isAnagram(String s1,String s2)
	{
		boolean b=false;
		String st=CheckAnagram.getAsciiCount(s1);
		String st2=CheckAnagram.getAsciiCount(s2);
		if(st.equals(st2))
		{
			b=true;
			return b;
		}
		return b;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String s=in.nextLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				boolean b=CheckAnagram.isAnagram(arr[i], arr[j]);
				if(b)
					System.out.println(arr[i]+" "+arr[j]);
			}
		}
		
	}

}
