package ravi.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentReader {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
	    JsonFactory f = new JsonFactory();
	   // List<Student> lstUser = null;
	    HashMap<String, ArrayList<Student>> map = new LinkedHashMap<String, ArrayList<Student>>();
	    JsonParser jp = f.createJsonParser(new File("D:\\StdData.json"));
	    
	    TypeReference<HashMap<String, ArrayList<Student>>> tRef = new TypeReference<HashMap<String, ArrayList<Student>>>() {};
	    //TypeReference<List<Student>> tRef = new TypeReference<List<Student>>() {};
	   map = mapper.readValue(jp, tRef);
	   
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter the id:");
	   String id=in.next();
	  // System.out.println(map);
	   for(String key:map.keySet())
	   {
		   ArrayList<Student> al =map.get(key);
		   for(Student st:al)
		   {
			   if(id.equals(st.getsId()))
				   System.out.println(st.getsId()+" "+st.getDept()+" "+st.getsName()+" "+st.getAddress().getCity()+" "+st.getPhone()[1]);
			   
		   }
		   
	   }
	    /*Iterator<Student> std = lstUser.iterator();
	    while(std.hasNext()){
	    	Student s = std.next();
	    	System.out.println(s.getsId()+" "+s.getAddress().getStreet());
	    }*/
	}

	}


