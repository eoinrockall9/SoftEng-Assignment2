package eoin.rockall;

import java.util.*;
import org.joda.time.DateTime;

public class CourseProgramme {

	String courseName;
	List<Module> moduleList = new ArrayList<Module>();
	List<Student> studentList = new ArrayList<Student>();
	DateTime startDate = new DateTime();
	DateTime endDate = new DateTime();
	
	public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
		
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
}