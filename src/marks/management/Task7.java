package marks.management;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import practice.collectiontasks.Sample;
import practice.collectiontasks.Student;

public class Task7 {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the percentage:");
		double calPer=in.nextDouble();
		String fileName = "D://notepad//checkdata.txt";
		HashMap<String, HashMap<String, Student>> hm=Sample.getMap(fileName);
		int count=0;
		for(Map.Entry<String, HashMap<String, Student>> en:hm.entrySet())
		{
			String dept=en.getKey();
			
			HashMap<String,Student> hm1=en.getValue();
			for(Map.Entry<String, Student> en1:hm1.entrySet())
			{
				String regNo=en1.getKey();
				Student st=en1.getValue();
				List<String> subjectNameList=st.getSubjectNameList();
				List<Double> marksList=st.getMarksList();
				List<Integer> creditsList=st.getCreditsList();
				int theoryCount=0,labCount=0,seminarCount=0;
				double studentTotal=0.0;
				int creditsCount=0;
				for(int i=0;i<marksList.size();i++)
				{
					if(subjectNameList.get(i).contains("LAB"))
						labCount++;
					else if(subjectNameList.get(i).contains("SEMINAR"))
						seminarCount++;
					else
						theoryCount++;
					studentTotal+=marksList.get(i);
					creditsCount+=creditsList.get(i);
				}
				double totalMarks=(theoryCount*100)+(labCount*75)+(seminarCount*50);
				double findPer=(studentTotal/totalMarks)*100;
				if(Math.round(findPer)==(long)calPer)
				{
					System.out.println(regNo+" "+dept+" "+findPer+" "+creditsCount);
					count++;
				}
			}
			
		}
		if(count==0)
			System.out.println("No students at the percentage");

	}

}
