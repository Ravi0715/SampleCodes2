package practice.ravi;

import java.util.ArrayList;
import java.util.Scanner;

public class FillTwoDArrayWithPrimes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows=in.nextInt();
		System.out.println("Enter the no. of cols:");
		int cols=in.nextInt();
		int a[][] = new int[rows][cols];
		int product=rows*cols;
		/*for(int i=0;i<rows;i++)
			product=product*cols;*/
		int q=product*5;
		int count=0;
		ArrayList<Integer> primeList= new ArrayList<Integer>();
		for(int i=2;i<q;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0){
					flag++;
					break;
				}
			}
			if(flag==0&&count<product){
				primeList.add(i);
				count++;
			}
		}
		//System.out.println(primeList);
		int k=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				a[i][j]=primeList.get(k++);
			}
		}
		System.out.println("In arr");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
