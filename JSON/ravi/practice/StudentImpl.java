package ravi.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentImpl {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException {
		
		/*ArrayList<Student> cse= new ArrayList<Student>();
		
		Student student = new Student();
		student.setsId("501");student.setsName("ravi");
		student.setDept("CSE");student.setAgg(73.56);
		Address address = new Address();
		address.setStreet("PSR");address.setCity("VZM");address.setPin("535002");
		student.setAddress(address);
		String phone[] ={"7032834863","08922-30411"};
		student.setPhone(phone);

		Student student1 = new Student();
		student1.setsId("502");student1.setsName("teja");
		student1.setDept("CSE");student1.setAgg(72.56);
		Address address1 = new Address();
		address1.setStreet("MSR");address1.setCity("VZM");address1.setPin("535002");
		student1.setAddress(address1);
		String phone1[] ={"7032834863","08922-30411"};
		student1.setPhone(phone1);
		
		cse.add(student);cse.add(student1);
		
		ArrayList<Student> ece= new ArrayList<Student>();
		
		Student student2 = new Student();
		student2.setsId("401");student2.setsName("harsha");
		student2.setDept("ECE");student2.setAgg(70.56);
		Address address2 = new Address();
		address2.setStreet("PSR");address2.setCity("VZM");address2.setPin("535002");
		student2.setAddress(address2);
		String phone2[] ={"7032834863","08922-30411"};
		student2.setPhone(phone2);

		Student student3 = new Student();
		student3.setsId("402");student3.setsName("tej");
		student3.setDept("ECE");student3.setAgg(72.56);
		Address address3 = new Address();
		address3.setStreet("MSR");address3.setCity("VZM");address3.setPin("535002");
		student3.setAddress(address3);
		String phone3[] ={"7032834863","08922-30411"};
		student3.setPhone(phone3);
		
		ece.add(student2);ece.add(student3);
		
		ArrayList<Student> eee= new ArrayList<Student>();
		
		Student student4 = new Student();
		student4.setsId("201");student4.setsName("praveen");
		student4.setDept("EEE");student4.setAgg(73.22);
		Address address4 = new Address();
		address4.setStreet("PSR");address4.setCity("VZM");address4.setPin("535002");
		student4.setAddress(address4);
		String phone4[] ={"7032834863","08922-30411"};
		student4.setPhone(phone4);

		Student student5 = new Student();
		student5.setsId("502");student5.setsName("teja");
		student5.setDept("CSE");student5.setAgg(72.56);
		Address address5 = new Address();
		address5.setStreet("MSR");address5.setCity("VZM");address5.setPin("535002");
		student5.setAddress(address5);
		String phone5[] ={"7032834863","08922-30411"};
		student5.setPhone(phone5);
		
		eee.add(student5);eee.add(student5);
		
		HashMap<String, ArrayList<Student>> map = new LinkedHashMap<String, ArrayList<Student>>();
		map.put("CSE", cse);
		map.put("ECE", ece);
		map.put("EEE", eee);*/
		Scanner in = new Scanner(System.in);
		HashMap<String, ArrayList<Student>> map = new LinkedHashMap<String, ArrayList<Student>>();
		int choice=0;
		do
		{
			System.out.println("Enter choice:\n1.Enter Details Of Student\n2.exit");
			choice=in.nextInt();
			System.out.print("Enter student name:");
			String sName=in.next();
			System.out.print("Enter student ID:");
			String sId=in.next();
			String dept = null;
			switch(sId.charAt(7))
			{
				case '2': dept="EEE";
						break;
				case '4': dept="ECE";
						break;
				case '3': dept="MECH";
						break;
				case '5': dept="CSE";
						break;
			}
			System.out.print("Enter Student agg:");
			double agg=in.nextDouble();
			String phone[]= new String[2];
			for(int i=0;i<2;i++)
			{
				if(i==0)
					System.out.print("Enter the mobile number:");
				else
					System.out.print("Enter the land line number:");
				phone[i]=in.next();
			}
			System.out.print("Enter Street Name:");
			String street=in.next();
			System.out.print("Enter City Name:");
			String city=in.next();
			System.out.print("Enter the pin code:");
			String pin=in.next();
			ArrayList<Student> al;
			
			if(map.containsKey(dept))
			{
				al=map.get(dept);
			}
			else
			{
				al=new ArrayList<Student>();
			}
			Address address= new Address();
			address.setStreet(street);address.setCity(city);address.setPin(pin);
			Student student = new Student();
			student.setsId(sId);
			student.setsName(sName);
			student.setAgg(agg);
			student.setPhone(phone);
			student.setAddress(address);
			student.setDept(dept);
			al.add(student);
			map.put(dept, al);
		}
		while(choice<2&&choice>0);
		//System.out.println(map);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new FileOutputStream("D://StdData.json"), map);
		System.out.println("Mapped and Stored...");

	}

}
