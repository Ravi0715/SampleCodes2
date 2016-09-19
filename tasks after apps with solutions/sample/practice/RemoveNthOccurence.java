package practice.ravi;

import java.util.Scanner;

public class RemoveNthOccurence {

	public static void main(String[] args) {
		
		System.out.println("Enter string");
		Scanner in = new Scanner(System.in);
		String s=in.next();
		System.out.println("Enter position:");
		int pos=in.nextInt();
		System.out.println("Enter character:");
		char ch =in.next().charAt(0);
		StringBuffer sb = new StringBuffer();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				if(count!=pos-1)
					sb.append(s.charAt(i));
				count++;
			}
			else
			{
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
