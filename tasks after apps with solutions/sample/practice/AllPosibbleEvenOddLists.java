package sample.practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;



public class AllPosibbleEvenOddLists {
	static LinkedHashMap<String, ArrayList<Integer>> lhm = new LinkedHashMap<String, ArrayList<Integer>>();
	public static LinkedHashMap<String, ArrayList<Integer>> getCombinations(int[] a, int k) 
    {
    	
        if (k == a.length)
        {
        	ArrayList<Integer> li = new ArrayList<Integer>();
        	int num=0;
            for (int i=0; i<a.length; i++) 
            	num=num*10+a[i];
            if(num%2==0)
            {
            	if(lhm.containsKey("even"))
            	{
            		li=lhm.get("even");
            		li.add(num);
            		lhm.put("even", li);
            	}
            	else
            	{
            		li.add(num);
            		lhm.put("even", li);
            	}
            }
            else
            {
            	if(lhm.containsKey("odd"))
            	{
            		li=lhm.get("odd");
            		li.add(num);
            		lhm.put("odd", li);
            	}
            	else
            	{
            		li.add(num);
            		lhm.put("odd", li);
            	}
            }
        } 
        else 
        {
            for (int i=k;i<a.length;i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                AllPosibbleEvenOddLists.getCombinations(a, k + 1);
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
        return lhm;
    }
 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int[] a = new int[(int)Math.log10(number)+1];
        int p=0;
        int n=number;
        while(n!=0)
        {
        	a[p++]=n%10;
        	n/=10;
        }
        System.out.println("The possible combinations are: ");
        LinkedHashMap<String, ArrayList<Integer>> lhm=AllPosibbleEvenOddLists.getCombinations(a, 0);
        System.out.println(lhm);
    }
}
