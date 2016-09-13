package pracitce.ravi;

import java.util.Scanner;

public class Conversions {

	public static void toBinary(int n)
	{
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
	public static void toOctal(int n)
	{
		int temp=n;
		StringBuffer sb = new StringBuffer();
		while(temp!=0)
		{
			//System.out.print(temp%2);
			sb.append(temp%8);
			temp/=8;
		}
		System.out.println(sb.reverse().toString());
	}
	public static void toHex(int n)
	{
		int temp=n;
		StringBuffer sb = new StringBuffer();
		char arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'};
		while(temp!=0)
		{
			sb.append(arr[temp%16]);
			temp/=16;
		}
		System.out.println(sb.reverse().toString());
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		int temp=n;
		toBinary(n);
		toOctal(n);
		toHex(n);
	}

}
