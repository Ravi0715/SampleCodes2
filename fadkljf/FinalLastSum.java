package pracitce.ravi;

import java.util.Scanner;

class FinalLastSum
{
	public static int foldValue(int temp)
	{
		int sum=0;
		if(temp<=9)
			return sum;
		else{
		while(temp!=0)
		{
			sum+=temp%10;
			temp/=10;
			
		}
		}
		if((int)Math.log10(sum)+1>1)
			return foldValue(sum);
		else
			return sum;
	}
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int temp=n;
		int sum=0;
		/*while(temp!=0)
		{
			sum+=temp%10;
			temp/=10;
			if(sum>9)
				sum=sum-9;
		}*/sum=foldValue(temp);
		System.out.println(sum);
	}
}