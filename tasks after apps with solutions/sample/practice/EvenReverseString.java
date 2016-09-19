package sample.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class EvenReverseString {

	public static List<StringBuffer> reversePosition(String words[])
	{
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		int i=1;
		for(String word:words)
		{
			if(i%2!=0){
				sb.append(word+" ");
				sb1.append(new StringBuffer(word).reverse().toString()+" ");
			}
			else{
				sb.append(new StringBuffer(word).reverse().toString()+" ");
				sb1.append(word+" ");
			}
			i++;
		}
		List<StringBuffer> li = new ArrayList<StringBuffer>();
		li.add(sb);li.add(sb1);
		return li;
	}
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String sentence=in.nextLine();
		String words[] =sentence.split(" ");
		List<StringBuffer> li= reversePosition(words);
		for(StringBuffer sb:li)
			System.out.println(sb);
	}

}
