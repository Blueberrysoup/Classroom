import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;


public class ClassroomTest {
	ArrayList<Student> studList= new ArrayList<Student>();
	Classroom cr = new Classroom("", "", studList);
	
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

}
