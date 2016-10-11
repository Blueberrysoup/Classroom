import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;


public class ClassroomTest {
	public static final Logger LOG = Logger.getLogger(Classroom.class.getName());
	ArrayList<Student> studList= new ArrayList<Student>();
	Classroom cr = new Classroom("", "", studList);
	Student stud1 = new Student("Nisse", "Svensson", 35, 'M');
	Student stud2 = new Student("Britta", "Persson", 32, 'F');
			
	@Test
	public void testClassroomName() {
		cr.setClassroomName("Test automation");
		LOG.info("Testing the method setClassroomName.");
		assertEquals("Test automation", cr.getClassroomName());
	}

	@Test
	public void testClassroomTerm() {
		cr.setClassroomTerm("Autumn 2016");
		LOG.info("Testing the method setClassroomTerm.");
		assertEquals("Autumn 2016", cr.getClassroomTerm());
	}

	@Test
	public void testAddANewStudent() {
		studList.clear();
		studList.add(stud1);
		cr.addANewStudent(stud1);
		LOG.info("Testing the method addANewStudent with: " + stud1);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testSetGetStudents() {
		studList.clear();
		studList.add(stud1);
		cr.setStudents(studList);
		LOG.info("Testing the method setGetStudents with: " + stud1);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testRemoveAStudent() {
		studList.clear();
		studList.add(stud1);
		studList.add(stud2);
		
		cr.setStudents(studList);
		
		LOG.info("Testing the method removeAStudent with name Carina");
		cr.removeAStudent("Carina");
		assertEquals(studList,cr.getStudents());
		
		LOG.info("Testing the method removeAStudent with name Britta");
		cr.removeAStudent("Britta");
		studList.remove(stud2);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testPrintFullRelatory() {
		studList.clear();
		studList.add(stud1);
		studList.add(stud2);
		cr.setClassroomName("Test automation");
		cr.setClassroomTerm("Autumn 2016");
		cr.setStudents(studList);
		LOG.info("Testing the method printFullRelatory.");
		cr.printFullRelatory();
	}

}
