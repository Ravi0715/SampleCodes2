package marks.management;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import marks.management.methods.GetDataOfTreeMap;


public class Task1 {

	public static void main(String[] args) throws Exception {
		

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Dept:");
		String findDept = in.next();
		TreeMap<Double, StringBuffer> tm=GetDataOfTreeMap.getData(findDept);
		for(Map.Entry<Double, StringBuffer> en:tm.entrySet())
		{
			double findPer=en.getKey();
			StringBuffer sb=en.getValue();
			String arr[] =sb.toString().split("&!");
			for(String data:arr)
				System.out.println(data+" "+findPer);
		}
		
	}

}
