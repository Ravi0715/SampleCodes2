package marks.management;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import practice.collectiontasks.Sample;
import practice.collectiontasks.Student;

public class Task6 {

	public static void main(String[] args) throws Exception {
		
		String fileName = "D://notepad//checkdata.txt";
		HashMap<String, HashMap<String, Student>> hm=Sample.getMap(fileName);
		System.out.println("Enter Dept:");
		Scanner in = new Scanner(System.in);
		//int n=in.nextInt();
		String findDept=in.next();
		for(Map.Entry<String, HashMap<String, Student>> en:hm.entrySet())
		{
			String dept=en.getKey();
			if(findDept.equalsIgnoreCase(dept))
			{
				int studentCount=0;
				HashMap<String,Student> hm1=en.getValue();
				for(Map.Entry<String, Student> en1:hm1.entrySet())
				{
					String regNo=en1.getKey();
					Student st=en1.getValue();
					List<String> subjectCodeList=st.getSubjectCodeList();
					List<String> subjectNameList=st.getSubjectNameList();
					List<Double> marksList=st.getMarksList();
					List<Integer> creditsList=st.getCreditsList();
					List<String> statusList = st.getStatusList();
					int failCount=0;
					/*if(statusList.contains("fail"))
						System.out.println("Student Failed");
					else
						System.out.println("Student Passed");*/
					for(int i=0;i<statusList.size();i++)
					{
						//System.out.println(dept+" "+regNo+" "+subjectCodeList.get(i)+" "+subjectNameList.get(i)+" "+marksList.get(i)+" "+creditsList.get(i)+" "+statusList.get(i));
					//	System.out.println(statusList.get(i));
						if(statusList.contains("fail"))
							failCount++;
					}
					for(int j=1;j<failCount;j++)
					if(failCount==j)
						System.out.println("No.Of student failed"+(studentCount++));
					//	studentCount++;
					
				}
				//System.out.println(studentCount+" ");
			}
		}

	}

}
