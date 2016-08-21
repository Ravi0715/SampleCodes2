package marks.management.methods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import marks.management.comparators.HighToLowComparator;
import practice.collectiontasks.Sample;
import practice.collectiontasks.Student;

public class GetDataOfTreeMap {

	public static TreeMap<Double, StringBuffer> getData(String findDept) throws Exception
	{
		String fileName = "D://notepad//checkdata.txt";
		HashMap<String, HashMap<String, Student>> hm=Sample.getMap(fileName);
		
		
		TreeMap<Double,StringBuffer> tm = new TreeMap<Double, StringBuffer>();
		for(Map.Entry<String, HashMap<String, Student>> en:hm.entrySet())
		{
			String dept=en.getKey();
			HashMap<String,Student> hm1=en.getValue();
			if(findDept.equalsIgnoreCase(dept))
			{
				
				for(Map.Entry<String, Student> en1:hm1.entrySet())
				{
					StringBuffer sb = new StringBuffer();
					String regNo=en1.getKey();
					Student st=en1.getValue();
					List<String> subjectNameList=st.getSubjectNameList();
					List<Double> marksList=st.getMarksList();
					int theoryCount=0,labCount=0,seminarCount=0;
					double studentTotal=0.0;
					for(int i=0;i<marksList.size();i++)
					{
						if(subjectNameList.get(i).contains("LAB"))
							labCount++;
						else if(subjectNameList.get(i).contains("SEMINAR"))
							seminarCount++;
						else
							theoryCount++;
						studentTotal+=marksList.get(i);
					}
					double totalMarks=(theoryCount*100)+(labCount*75)+(seminarCount*50);
					double findPer=(studentTotal/totalMarks)*100;
					if(tm.containsKey(findPer))
					{
						sb=tm.get(findPer);
						sb.append(regNo+" "+subjectNameList+"&!");
						tm.put(findPer, sb);
					}
					else
					{
						sb.append(regNo+" "+subjectNameList+"&!");
						tm.put(findPer, sb);
					}
				}
			}
		}
		return tm;
	}
}
