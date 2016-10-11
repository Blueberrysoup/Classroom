import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;


public class ClassroomTest {
	ArrayList<Student> studList= new ArrayList<Student>();
	Classroom cr = new Classroom("", "", studList);
	Student stud1 = new Student("Nisse", "Svensson", 35, 'M');
	Student stud2 = new Student("Britta", "Persson", 32, 'F');
		
	@Test
	public void testClassroomName() {
		cr.setClassroomName("Test automation");
		assertEquals("Test automation", cr.getClassroomName());
	}

	@Test
	public void testClassroomTerm() {
		cr.setClassroomTerm("Autumn 2016");
		assertEquals("Autumn 2016", cr.getClassroomTerm());
	}

	@Test
	public void testAddANewStudent() {
		studList.clear();
		studList.add(stud1);
		cr.addANewStudent(stud1);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testSetGetStudents() {
		studList.clear();
		studList.add(stud1);
		cr.setStudents(studList);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testRemoveAStudent() {
		studList.clear();
		studList.add(stud1);
		studList.add(stud2);
		
		cr.setStudents(studList);
		
		cr.removeAStudent("Carina");
		assertEquals(studList,cr.getStudents());
		
		cr.removeAStudent("Britta");
		studList.remove(stud2);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testPrintFullRelatory() {
		studList.clear();
		studList.add(stud1);
		studList.add(stud2);		
		cr.setStudents(studList);
		cr.printFullRelatory();
	}

}
