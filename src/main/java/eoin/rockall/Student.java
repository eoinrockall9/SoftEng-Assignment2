package eoin.rockall;
import java.util.ArrayList;
import java.util.List;

public class Student {

	String name;
	int age;
	int id;
	String username;
	String course;
	List<Module> modules = new ArrayList<>();
	
	public Student(String name, int age, int id, String username)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.username = username;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getCourses() {
		return course;
	}

	public void setCourses(String course) {
		this.course = course;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
}