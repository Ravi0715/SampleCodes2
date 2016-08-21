package lendi.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	
	

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D://notepad//checkdata.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		HashMap<String,HashMap<String, Student>> hm = new HashMap<String, HashMap<String,Student>>();
		while((line=br.readLine())!=null)
		{
			String arr[] = line.split(" ");
			StringBuffer sb = new StringBuffer();
			int j=0;
			for(int i=0;i<arr.length;i++)
				if(!(arr[i].contains("0")||arr[i].contains("1")||arr[i].contains("2")||arr[i].contains("3")||arr[i].contains("4")||arr[i].contains("5")||arr[i].contains("6")||arr[i].contains("7")||arr[i].contains("8")||arr[i].contains("9")))
				{	
					sb.append(arr[i]+" ");
					j=i;
				}
			String subjectName=sb.toString();
			String dept=null;
			switch(arr[0].charAt(7))
			{
				case '2':
						dept="EEE";
						break;
				case '3':
						dept="MECH";
						break;
				case '4':
						dept="ECE";
						break;
				case '5':
						dept="CSE";
						break;
			}
			HashMap<String, Student> hm1 = new HashMap<String, Student>();
			Student st = new Student();
			List<String> subjectCodeList = new ArrayList<String>();
			List<String> subjectNameList = new ArrayList<String>();
			List<Double> marksList = new ArrayList<Double>();
			List<Integer> creditsList = new ArrayList<Integer>();
			if(hm.containsKey(dept))
			{
				hm1=hm.get(dept);
				if(hm1.containsKey(arr[0]))
				{
					st=hm1.get(arr[0]);
					subjectCodeList=st.getSubjectCodeList();
					subjectNameList=st.getSubjectNameList();
					marksList=st.getMarksList();
					creditsList=st.getCreditsList();
					subjectCodeList.add(arr[1]);
					subjectNameList.add(subjectName);
					double marks = Double.parseDouble(arr[j+1])+Double.parseDouble(arr[j+2]);
					marksList.add(marks);
					creditsList.add(Integer.parseInt(arr[j+3]));
					st.setSubjectCodeList(subjectCodeList);
					st.setSubjectNameList(subjectNameList);
					st.setMarksList(marksList);
					st.setCreditsList(creditsList);
					hm1.put(arr[0], st);
				}
				else
				{
					subjectCodeList.add(arr[1]);
					subjectNameList.add(subjectName);
					double marks = Double.parseDouble(arr[j+1])+Double.parseDouble(arr[j+2]);
					marksList.add(marks);
					creditsList.add(Integer.parseInt(arr[j+3]));
					st.setSubjectCodeList(subjectCodeList);
					st.setSubjectNameList(subjectNameList);
					st.setMarksList(marksList);
					st.setCreditsList(creditsList);
					hm1.put(arr[0], st);
				}
				hm.put(dept, hm1);
			}
			else
			{
				if(hm1.containsKey(arr[0]))
				{
					st=hm1.get(arr[0]);
					subjectCodeList=st.getSubjectCodeList();
					subjectNameList=st.getSubjectNameList();
					marksList=st.getMarksList();
					creditsList=st.getCreditsList();
					subjectCodeList.add(arr[1]);
					subjectNameList.add(subjectName);
					double marks = Double.parseDouble(arr[j+1])+Double.parseDouble(arr[j+2]);
					marksList.add(marks);
					creditsList.add(Integer.parseInt(arr[j+3]));
					st.setSubjectCodeList(subjectCodeList);
					st.setSubjectNameList(subjectNameList);
					st.setMarksList(marksList);
					st.setCreditsList(creditsList);
					hm1.put(arr[0], st);
				}
				else
				{
					subjectCodeList.add(arr[1]);
					subjectNameList.add(subjectName);
					double marks = Double.parseDouble(arr[j+1])+Double.parseDouble(arr[j+2]);
					marksList.add(marks);
					creditsList.add(Integer.parseInt(arr[j+3]));
					st.setSubjectCodeList(subjectCodeList);
					st.setSubjectNameList(subjectNameList);
					st.setMarksList(marksList);
					st.setCreditsList(creditsList);
					hm1.put(arr[0], st);
				}
				hm.put(dept, hm1);
			}
			
			
			//System.out.println(arr[0].charAt(7));
			
			
		}
		//System.out.println(hm);
		for(Map.Entry<String, HashMap<String, Student>> en:hm.entrySet())
		{
			String dept=en.getKey();
			HashMap<String,Student> hm1=en.getValue();
			for(Map.Entry<String, Student> en1:hm1.entrySet())
			{
				String regNo=en1.getKey();
				Student st=en1.getValue();
				List<String> subjectCodeList=st.getSubjectCodeList();
				List<String> subjectNameList=st.getSubjectNameList();
				List<Double> marksList=st.getMarksList();
				List<Integer> creditsList=st.getCreditsList();
				for(int i=0;i<subjectCodeList.size();i++)
				{
					System.out.println(dept+" "+regNo+" "+subjectCodeList.get(i)+" "+subjectNameList.get(i)+" "+marksList.get(i)+" "+creditsList.get(i));
				}
			}
		}
		br.close();
		fr.close();
	}

}
