package pracitce.ravi;

import java.util.Scanner;

public class Conversions {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		int temp=n;
		StringBuffer sb = new StringBuffer();
		while(temp!=0)
		{
			//System.out.print(temp%2);
			sb.append(temp%2);
			temp/=2;
		}
		System.out.println(sb.reverse().toString());

	}

}
