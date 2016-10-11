import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Person;

public class PersonTest {
	public static final Logger LOG = Logger.getLogger(Classroom.class.getName());
	Person pers = new Person("", "", 100, 'X');
			
	@Test
	public void testAge() {
		pers.setAge(20);
		LOG.info("Testing the methods setAge and getAge.");
		assertEquals(20, pers.getAge());
	}

	@Test
	public void testFirstName() {
		pers.setFirstName("Kerstin");
		LOG.info("Testing the methods setFirstName and getFirstName.");
		assertEquals("Kerstin", pers.getFirstName());
	}

	@Test
	public void testLastName() {
		pers.setLastName("Persson");
		LOG.info("Testing the methods setLastName and getLastName.");
		assertEquals("Persson", pers.getLastName());
	}
	
	@Test
	public void testGender() {
		pers.setGender('F');
		LOG.info("Testing the methods setGender and getGender.");
		assertEquals('F', pers.getGender());
	}
}
