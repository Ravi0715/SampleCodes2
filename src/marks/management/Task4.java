package marks.management;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import practice.collectiontasks.Sample;
import practice.collectiontasks.Student;

public class Task4 {
	
	public static void main(String args[]) throws Exception
	{
		String fileName = "D://notepad//checkdata.txt";
		HashMap<String, HashMap<String, Student>> hm=Sample.getMap(fileName);
		for(Map.Entry<String, HashMap<String, Student>> en:hm.entrySet())
		{
			String dept=en.getKey();
			HashMap<String,Student> hm1=en.getValue();
			int passCount=0,failCount=0;
			for(Map.Entry<String, Student> en1:hm1.entrySet())
			{
				Student st=en1.getValue();
		
				List<String> statusList = st.getStatusList();
				if(statusList.contains("fail"))
					failCount++;
				else
					passCount++;
			
			}
			double totalCount=passCount+failCount;
			double passPer=(passCount/totalCount)*100;
			System.out.println("Department Name:"+dept+"\nTotal No. of Students:"+(passCount+failCount)+"\nNo. of Students Passed:"+passCount+"\nNo. of Students Failed:"+failCount+"\nPass Percentage:"+passPer+"\n");
		}
		
	}

}
