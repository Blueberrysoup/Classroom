import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student stud1 = new Student("", "", 100, 'X');
	Student stud2 = new Student("", "", 100, 'X', 0.0, 0.0, 0.0);

	@Test
	public void testFirstGrade1() {
		stud1.setFirstGrade(5.0);
		assertEquals(5.0, stud1.getFirstGrade(), 0.0);
	}

	@Test
	public void testSecondGrade1() {
		stud1.setSecondGrade(6.0);
		assertEquals(6.0, stud1.getSecondGrade(), 0.0);
	}

	@Test
	public void testThirdGrade1() {
		stud1.setThirdGrade(7.0);
		assertEquals(7.0, stud1.getThirdGrade(), 0.0);
	}
/*
	@Test
	public void testCalculateAverageGradeFirst1() {
		assertEquals(6.0, stud1.calculateAverage(5.0), 0.0);
	}
	
	@Test
	public void testCalculateAverageGradeEmpty1() {
		assertEquals(6.0, stud1.calculateAverage(), 0.0);
	}
*/	
	@Test
	public void testCalculateAverageGradeAll1() {
		assertEquals(6.0, stud1.calculateAverage(5.0, 6.0, 7.0), 0.0);
	}
	
	
	
	
	
	@Test
	public void testFirstGrade2() {
		stud2.setFirstGrade(5.0);
		assertEquals(5.0, stud2.getFirstGrade(), 0.0);
	}

	@Test
	public void testSecondGrade2() {
		stud2.setSecondGrade(6.0);
		assertEquals(6.0, stud2.getSecondGrade(), 0.0);
	}

	@Test
	public void testThirdGrade2() {
		stud2.setThirdGrade(7.0);
		assertEquals(7.0, stud2.getThirdGrade(), 0.0);
	}

}
