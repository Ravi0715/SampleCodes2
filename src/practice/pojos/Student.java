package practice.pojos;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

	
	String sId,sName,sDept;
	
	ArrayList<Marks> listMarks;
	
	public ArrayList<Marks> getListMarks() {
		return listMarks;
	}
	
	public void setListMarks(ArrayList<Marks> listMarks) {
		this.listMarks = listMarks;
	}
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsDept() {
		return sDept;
	}
	public void setsDept(String sDept) {
		this.sDept = sDept;
	}
	
	
	
}
