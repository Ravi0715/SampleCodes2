package pracitce.ravi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class StringValueMax {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter String:");
		String s=in.nextLine();

		ArrayList al = new ArrayList(); //k78io
		StringBuffer sb = new StringBuffer();
		int i=0;
		while(s.length()>i)
		{
			if(s.length()-1==i)
				break;
			
			while(i<s.length() && i>=0 && Character.isDigit(s.charAt(i))){
				
				sb.append(s.charAt(i));
				i++;
			}
			
			
			if(sb.length()>0){
				al.add(new Integer(sb.toString()));
			}
			
			i++;
			sb= new StringBuffer();
		}
		
			Collections.sort(al);
			System.out.println(al.get(al.size()-1));
		
	}

}
