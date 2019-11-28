package eoin.rockall;

import java.util.ArrayList;
import java.util.List;

public class Module {
	
	String moduleName;
	List<Student> studentList = new ArrayList<Student>();
	List<CourseProgramme> courses = new ArrayList<>();
	
	
	public Module(String moduleName)
	{
		this.moduleName = moduleName;
	}


	public String getModuleName() {
		return moduleName;
	}


	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}


	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}


	public List<CourseProgramme> getCourses() {
		return courses;
	}


	public void setCourses(List<CourseProgramme> courses) {
		this.courses = courses;
	}
	
	
}