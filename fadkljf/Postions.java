package pracitce.ravi;

import java.util.ArrayList;
import java.util.Scanner;

public class Postions {

	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		System.out.println("Enter character:");
		char ch =in.next().charAt(0);
		System.out.println("Positions in sentence:");
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
				System.out.print((i+1)+",");
		}
		String arr[] = s.split(" ");
		
		System.out.println("\nPositions in words:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+":");
			ArrayList<Integer> li = new ArrayList<Integer>();
			
			for(int j=0;j<arr[i].length();j++)
			{
				if(ch==arr[i].charAt(j))
					li.add(j+1);
			}
			if(li.isEmpty())
				System.out.print(0);
			else
				System.out.print(li);
			System.out.println();
		}

	}

}
