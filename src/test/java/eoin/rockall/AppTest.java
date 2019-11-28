package eoin.rockall;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AppTest 
{
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    //DateTime firstDay = new DateTime();

	CourseProgramme course1 = new CourseProgramme("BCT");//, firstDay, new DateTime());
	CourseProgramme course2 = new CourseProgramme("BIS");//, firstDay, new DateTime());
	CourseProgramme course3 = new CourseProgramme("BA");//, firstDay, new DateTime());

	Module module1 = new Module("Programming");
	Module module2 = new Module("Information Systems");
	Module module3 = new Module("Spanish");

	Student student1 = new Student("Eoin Rockall", 21, 16450856, "eoinrockall");
	Student student2 = new Student("John Brown", 24, 13109872, "jbeezy");
	Student student3 = new Student("Sam Darnold", 19, 19123048, "sammyghosts");
		
	// Student Getter Method Unit Tests
	
	@Test
	public void getNameTest() {
		
		assertEquals("Eoin Rockall", student1.getName());
	}
	
	@Test
	public void getUsernameTest() {
		
		assertEquals(24, student2.getAge());
	}
	
	@Test
	public void getId() {
		
		assertEquals(19123048, student3.getId());
	}
	
	@Test
	public void getUsername() {
		
		assertEquals("eoinrockall", student1.getUsername());	
	}
	
	@Test
	public void getCoursesTest() {
		
		student1.setCourses(course1.getCourseName());
		assertEquals(course1.getCourseName(), student1.getCourses());
	} 

	@Test
	public void getModuleTest() {
		List<Module> modules = new ArrayList<Module>();
		modules.add(module1);
		modules.add(module2);
		modules.add(module3);
		
		student1.setModules(modules);
		
		assertEquals(modules, student1.getModules());
	}
	
	// Module tests
	
	@Test
	public void getModuleNameTest() {
		assertEquals("Programming", module1.getModuleName());
	}
	
	@Test
	public void getStudentListTest() {
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student3);
		
		module1.setStudentList(students);
		assertEquals(students, module1.getStudentList());
	}
	
	@Test
	public void getCoursesTestForModule() {
		
		List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
		courses.add(course1);
		courses.add(course2);
		module1.setCourses(courses);
		
		assertEquals(courses, module1.getCourses());
	}
	
	// Course Tests
	
	@Test
	public void getCourseNameProgTest() {
		assertEquals("BCT", course1.getCourseName());
	}
	
//	@Test
//	public void getCourseStartDateTest() {
//		assertEquals(new DateTime(), course1.getStartDate());
//	}
//	
//	@Test
//	public void getCourseEndDateTest() {
//		assertEquals(new DateTime(), course1.getStartDate());
//	}
	
//	@Test
//	public void getCourseModuleListTest() {
//		
//	}
//	
//	@Test
//	public void getCourseStudentListTest() {
//		
//	}
}
