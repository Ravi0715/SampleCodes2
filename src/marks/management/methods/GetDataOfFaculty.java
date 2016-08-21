package marks.management.methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import practice.collectiontasks.Sample;
import practice.collectiontasks.Student;
import marks.management.pojos.Faculty;

public class GetDataOfFaculty {

	public static HashMap<String, List<Faculty>> getFacultyData() throws IOException
	{
		FileReader fr = new FileReader("D://notepad//facultydata.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		HashMap<String, List<Faculty>> hm = new HashMap<String, List<Faculty>>();
		while((line=br.readLine())!=null)
		{
			String arr[] = line.split(",");
			Faculty faculty = new Faculty();
			faculty.setFacultyName(arr[0]);
			faculty.setSubjectName(arr[1]);
			faculty.setFacultyDept(arr[2]);
			List<Faculty> lf = new ArrayList<Faculty>();
			if(hm.containsKey(arr[1]))
			{
				lf=hm.get(arr[1]);
				lf.add(faculty);
				hm.put(arr[1], lf);
			}
			else
			{
				lf.add(faculty);
				hm.put(arr[1],lf);
			}
		}
		return hm;
	}
	public static void main(String[] args) throws Exception {
		
		HashMap<String, List<Faculty>> hm=getFacultyData();
		//System.out.println(hm);
		String fileName="D://notepad//checkdata.txt";
		HashMap<String, HashMap<String, Student>> hm1 =Sample.getMap(fileName);
		System.out.println(hm1);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter dept:");
		String findDept=in.next();
		/*//int count=0;
		for(Map.Entry<String, HashMap<String, Student>> en:hm1.entrySet())
		{
			for(Map.Entry<String, List<Faculty>> en2:hm.entrySet())
			{
				String facultyName = null,facultyDept=null,subjectName=null;
				int failCount=0,passCount=0;
				HashMap<String, Student> hm2=en.getValue();
				for(Map.Entry<String, Student> en1:hm2.entrySet())
				{
					//String regNo=en1.getKey();
					Student st=en1.getValue();
		//			count++;
					List<String> subjectNameList=st.getSubjectNameList();
					List<Integer> creditsList=st.getCreditsList();
					List<Faculty> lf =en2.getValue();
					for(Faculty faculty:lf)
					{
						if(findDept.equalsIgnoreCase(en.getKey())&&findDept.equalsIgnoreCase(faculty.getFacultyDept()))
						{							
							String facultySubjectName=faculty.getSubjectName();
							for(int i=0;i<creditsList.size();i++)
							{
								if(subjectNameList.get(i).equalsIgnoreCase(facultySubjectName))
								{
									if(creditsList.get(i)==0||creditsList.get(i)==-1)
									{
										failCount++;
									}
									else
									{
										passCount++;
									}
									System.out.println(subjectNameList.get(i));
								}
								//System.out.println(failCount+" "+passCount);
							}
							
							facultyName=faculty.getFacultyName();
							facultyDept=faculty.getFacultyDept();
							subjectName=faculty.getSubjectName();
						//	System.out.println(facultyName+" "+facultyDept+" "+subjectName+" "+passCount+" "+failCount+" "+(passCount+failCount));
							//System.out.println(faculty.getFacultyName()+" "+faculty.getSubjectName()+" "+passCount+" "+failCount);
						}
					}
				}
				//System.out.println(facultyName+" "+facultyDept+" "+subjectName+" "+passCount+" "+failCount+" "+(passCount+failCount));
			}
		}
		*/

		for(Map.Entry<String, HashMap<String, Student>> en:hm1.entrySet())
		{
			String dept=en.getKey();
			HashMap<String,Student> hm2=en.getValue();
			for(Map.Entry<String, Student> en1:hm2.entrySet())
			{
				for(Map.Entry<String, List<Faculty>> en2:hm.entrySet())
				{
					List<Faculty> lf=en2.getValue();
					int passCount=0;
					int failCount=0;
					for(Faculty faculty:lf)
					{
						if(findDept.equalsIgnoreCase(dept)&&findDept.equalsIgnoreCase(faculty.getFacultyDept()))
						{
							//String regNo=en1.getKey();
							Student st=en1.getValue();
							//List<String> subjectCodeList=st.getSubjectCodeList();
							List<String> subjectNameList=st.getSubjectNameList();
							//List<Double> marksList=st.getMarksList();
							List<Integer> creditsList=st.getCreditsList();
							List<String> statusList = st.getStatusList();
							/*if(statusList.contains("fail"))
								System.out.println("Student Failed");
							else
								System.out.println("Student Passed");*/
							for(int i=0;i<subjectNameList.size();i++)
							{
								//System.out.println(dept+" "+" "+subjectNameList.get(i)+" "+" "+creditsList.get(i)+" "+statusList.get(i));
								if(subjectNameList.get(i).equalsIgnoreCase(en2.getKey()))
								{
									//if(statusList.get(i).equalsIgnoreCase("pass"))
									if(!(creditsList.get(i)==0||creditsList.get(i)==-1))
										passCount++;
									else
										failCount++;
								}
							}
							System.out.println(faculty.getFacultyName()+" "+faculty.getSubjectName()+" "+passCount+" "+failCount);
						}
					}
				}
			}
		}
	}

}
