package practice.ravi;

import java.util.Scanner;

public class NumberCombinations
{
    public static void getCombinations(int[] a, int k,int dig) 
    {
    	StringBuffer sb = new StringBuffer();
        if (k == a.length)
        {
        	int num=0;
            for (int i=0; i<a.length; i++) 
            {
                //sb.append(a[i]);
            	num=num*10+a[i];
            }
            //if(sb.length()==a.length&&sb.toString().startsWith(new Integer(dig).toString()))
            int temp=num,check=0;
            while(temp!=0)
            {
            	check=temp%10;
            	temp/=10;
            }
            if((int)Math.log10(num)+1==a.length&&check==dig)
            {
            	System.out.println(num);
            }
        } 
        else 
        {
            for (int i=k;i<a.length;i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                NumberCombinations.getCombinations(a, k + 1,dig);
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter digit");
        int dig=sc.nextInt();
        int[] a = new int[(int)Math.log10(number)+1];
        int p=0;
        int n=number;
        while(n!=0)
        {
        	a[p++]=n%10;
        	n/=10;
        }
        System.out.println("The possible combinations are: ");
        NumberCombinations.getCombinations(a, 0,dig);
    }
}