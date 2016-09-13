package pracitce.ravi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EvenOddLists {

	public  static int[] readArray()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		return a;
	}
	public ArrayList<Integer> getEvenNumbersList(int a[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				al.add(a[i]);
		}
		return al;
	}
	public static ArrayList<Integer> getOddNumbersList(int a[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				al.add(a[i]);
		}
		return al;
	}
	public static void printList(ArrayList<Integer> evenList,ArrayList<Integer> oddList)
	{
		System.out.println("Even List:"+evenList);
		System.out.println("Odd List:"+oddList);
		
	}
	public static void main(String[] args) {
		EvenOddLists eol = new EvenOddLists();
		int a[] =EvenOddLists.readArray();
		ArrayList<Integer> evenList =eol.getEvenNumbersList(a);
		ArrayList<Integer> oddList=EvenOddLists.getOddNumbersList(a);
		EvenOddLists.printList(evenList, oddList);
		int c=0,p=0,p1=0;
		/*for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				System.out.print(evenList.get(p++)+" ");
			else
				System.out.print(oddList.get(p1++)+" ");
		}*/
		System.out.println("After sorted lists:");
		Collections.sort(evenList);
		Collections.sort(oddList);
		ArrayList<Integer> combinedList = new ArrayList<Integer>();
		combinedList.addAll(evenList);
		combinedList.addAll(oddList);
		System.out.println(combinedList);
	}

}
