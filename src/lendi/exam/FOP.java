package lendi.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FOP {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D://notepad//extracted.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count=1;
		while((line=br.readLine())!=null)
		{
			
			if(line.equalsIgnoreCase(""))
			{
				//System.out.println(line);
				continue;
			}
			else
			{
				System.out.println(line);
			}
			count++;
		}
		br.close();
		fr.close();

	}

}
