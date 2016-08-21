package marks.management;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import marks.management.methods.GetDataOfTreeMap;


public class Task2 {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Dept:");
		String findDept = in.next();
		TreeMap<Double, StringBuffer> tm=GetDataOfTreeMap.getData(findDept);
		Set<Entry<Double, StringBuffer>> sr=tm.entrySet();
		List<Entry<Double, StringBuffer>> li = new ArrayList<Map.Entry<Double,StringBuffer>>();
		li.addAll(sr);
		ListIterator<Entry<Double, StringBuffer>> ie=li.listIterator(li.size());
		while(ie.hasPrevious())
		{
			Entry<Double, StringBuffer> en=ie.previous();
			StringBuffer sb=en.getValue();
			double findPer=en.getKey();
			String arr[]=sb.toString().split("&!");
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]+" "+findPer);
		}
	}

}
