package lendi.exam;

import java.util.List;

public class Student {

	//String subjectCode,subjectName;
	List<String> subjectCodeList;
	List<String> subjectNameList;
	List<Double> marksList;
	List<Integer> creditsList;
	public List<String> getSubjectCodeList() {
		return subjectCodeList;
	}
	public void setSubjectCodeList(List<String> subjectCodeList) {
		this.subjectCodeList = subjectCodeList;
	}
	public List<String> getSubjectNameList() {
		return subjectNameList;
	}
	public void setSubjectNameList(List<String> subjectNameList) {
		this.subjectNameList = subjectNameList;
	}
	public List<Double> getMarksList() {
		return marksList;
	}
	public void setMarksList(List<Double> marksList) {
		this.marksList = marksList;
	}
	public List<Integer> getCreditsList() {
		return creditsList;
	}
	public void setCreditsList(List<Integer> creditsList) {
		this.creditsList = creditsList;
	}
	
	

}
