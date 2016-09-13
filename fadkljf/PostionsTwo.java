package pracitce.ravi;

import java.util.Scanner;
import java.util.TreeMap;

public class PostionsTwo {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		System.out.println("Enter character:");
		char ch =in.next().charAt(0);
		String arr[] = s.split(" ");
		TreeMap<Integer, StringBuffer> tm = new TreeMap<Integer, StringBuffer>();
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[i].length();j++)
			{
				if(ch==arr[i].charAt(j))
				{
					StringBuffer sb = new StringBuffer();
					if(tm.containsKey((j+1)))
					{
						sb=tm.get((j+1));
						sb.append(arr[i]+",");
						tm.put((j+1),sb);
					}
					else
					{
						sb.append(arr[i]+",");
						tm.put((j+1), sb);
					}
				}
			}
		}
		//System.out.println(tm);
		System.out.println(tm.get(tm.lastKey()));
	}

}
