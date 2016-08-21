package practice.pojos;

import java.io.Serializable;
import java.util.ArrayList;

public class CollectionOfStudents implements Serializable{
	
	ArrayList<Student> li;

	public ArrayList<Student> getLi() {
		return li;
	}

	public void setLi(ArrayList<Student> li) {
		this.li = li;
	}
	
	

}
