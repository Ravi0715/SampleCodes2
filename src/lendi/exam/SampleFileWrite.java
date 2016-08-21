package lendi.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;



public class SampleFileWrite {
	
	/*String fileName;
	

	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}*/


	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("D://notepad//extracted.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count=1;
		//File file = new File("D://notepad//newex.txt");
		String fileName = "D://notepad//checkdata.txt";
		
		/*FileWriter fw = new FileWriter(fileName,true);
		BufferedWriter bw = new BufferedWriter(fw);
		while((line=br.readLine())!=null)
		{
			if(count>=36)
			{
				//if(!line.equalsIgnoreCase("")&&(!line.contains("Htno")&&(!line.startsWith(""))&&(!line.startsWith("C"))))
				if(line.startsWith("1")||line.startsWith("0"))
				{
					bw.write(line);
					bw.newLine();
				}
			}
			count++;
		}*/
		//File file = new File();
		HashMap<String, HashMap<String, practice.collectiontasks.Student>> hm=practice.collectiontasks.Sample.getMap(fileName);
		System.out.println(hm);
		//System.out.println("Stored..");
		/*bw.close();
		fw.close();
		*/
		/*FileReader fr1 = new FileReader(fileName);
		BufferedReader br1=  new BufferedReader(fr1);
		String row;
		int c=1;
		while((row=br1.readLine())!=null)
		{
			if(c==1)
			{
				//System.out.println(row);
				String arr[]=row.split(" ");
				StringBuffer sb = new StringBuffer();
				int j=0;
				for(int i=0;i<arr.length;i++)
					if(!(arr[i].contains("0")||arr[i].contains("1")||arr[i].contains("2")||arr[i].contains("3")||arr[i].contains("4")||arr[i].contains("5")||arr[i].contains("6")||arr[i].contains("7")||arr[i].contains("8")||arr[i].contains("9")))
					{	
						sb.append(arr[i]+" ");
						j=i;
					}
				String subjectName=sb.toString();
				System.out.println(subjectName+" "+Integer.parseInt(arr[j+3]));

			//	break;
			//}
			//c++;
		}*/
		br.close();
		fr.close();
		/*br1.close();
		fr1.close();
*/
	}

}
