package marks.management;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import marks.management.methods.GetDataOfTreeMap;

public class Task5 {
	
	public static void main(String args[]) throws Exception
	{
		String findDept[]={"cse","ece","eee","mech"};
		for(int i=0;i<findDept.length;i++)
		{
			TreeMap<Double, StringBuffer> tm=GetDataOfTreeMap.getData(findDept[i]);
			Set<Entry<Double, StringBuffer>> sr=tm.entrySet();
			List<Entry<Double, StringBuffer>> li = new ArrayList<Map.Entry<Double,StringBuffer>>();
			li.addAll(sr);
			ListIterator<Entry<Double, StringBuffer>> ie=li.listIterator(li.size());
			int count=0;
			while(ie.hasPrevious())
			{
				if(count<3)
				{
					Entry<Double, StringBuffer> en=ie.previous();
					StringBuffer sb=en.getValue();
					double findPer=en.getKey();
					String arr[]=sb.toString().split("&!");
					for(int j=0;j<arr.length;j++)
					{
						String ar[]=arr[j].split(" ");
						System.out.println(findDept[i]+" "+ar[0]+" "+findPer);
					}
					
				}
				else
				{
					break;
				}
				count++;
			}
			System.out.println();
		}
	}

}
