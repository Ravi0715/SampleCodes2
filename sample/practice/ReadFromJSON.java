package sample.practice;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectReader;

import sample.pojos.Employee;

public class ReadFromJSON {

	public static void main(String[] args) {
		
		JSONParser jsonParser = new JSONParser();
		try
		{
			/*JSONObject jsonObject=(JSONObject) jsonParser.parse(new FileReader("D:\\sample.json"));
			Employee emp=(Employee) jsonObject.get("e102");
			System.out.println(emp.geteId()+" "+emp.geteName()+" "+emp.getSalary().getBasic());*/
			ObjectReader objectReader = ObjectReader.class.newInstance();
			Object o=objectReader.readValue(new File("D:\\sample.json"));
			HashMap<String, Employee> hm=(HashMap<String, Employee>) o;
			for(String key:hm.keySet())
			{
				Employee emp =hm.get(key);
				System.out.println(emp.geteId()+" "+emp.geteName()+" "+emp.getSalary().getBasic());
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
