package sample.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

import sample.pojos.Employee;
import sample.pojos.Salary;

public class JSONImpl {

	static FileReader fr;
	static BufferedReader br;
	public HashMap<String, Employee> getData()
	{
		HashMap<String, Employee> hm = new HashMap<String, Employee>();
		try
		{
			
			fr=new FileReader("D:\\aaa\\employee.txt");
			br= new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				String arr[] =line.split(",");
				Salary salary =Salary.class.newInstance();
				salary.setBasic(Double.parseDouble(arr[4]));
				salary.setDa(new Double(arr[5]));
				salary.setHra(Double.parseDouble(arr[6]));
				Class<Employee> c = Employee.class;
				Employee emp=c.newInstance();
				emp.seteId(arr[0]);
				emp.seteName(arr[1]);
				emp.setDesg(arr[2]);
				emp.setDept(arr[3]);
				emp.setSalary(salary);
				emp.setGpa(new Double(arr[7]));
				hm.put(emp.geteId(), emp);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try 
		{
			br.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fr.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		return hm;
	}
	public static void main(String[] args) {
		
		try
		{
			Class<JSONImpl> class1 = (Class<JSONImpl>) Class.forName("sample.practice.JSONImpl");
			JSONImpl jsonImpl=class1.newInstance();
			HashMap<String, Employee> hm=jsonImpl.getData();
			/*//System.out.println(hm);
			for(String key:hm.keySet())
			{
				Employee emp =hm.get(key);
				System.out.println(emp.geteId()+" "+emp.geteName()+" "+emp.getSalary().getBasic());
			}*/
			ObjectMapper objectMapper = new ObjectMapper();
			//objectMapper.writeValue(new FileOutputStream("D://sample.json"), hm);
			objectMapper.writeValue(new File("D://samp.json"), hm);
			
			System.out.println("Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
