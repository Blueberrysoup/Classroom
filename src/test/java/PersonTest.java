import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person pers = new Person("", "", 100, 'X');
			
	@Test
	public void testAge() {
		pers.setAge(20);
		assertEquals(20, pers.getAge());
	}

	@Test
	public void testFirstName() {
		pers.setFirstName("Kerstin");
		assertEquals("Kerstin", pers.getFirstName());
	}

	@Test
	public void testLastName() {
		pers.setLastName("Persson");
		assertEquals("Persson", pers.getLastName());
	}
	
	@Test
	public void testGender() {
		pers.setGender('F');
		assertEquals('F', pers.getGender());
	}
}
