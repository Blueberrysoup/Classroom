import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student stud1 = new Student("Student", "A", 100, 'X');
	Student stud2 = new Student("Student", "B", 100, 'X', 0.0, 0.0, 0.0);

	@Test
	public void testFirstGrade() {
		stud1.setFirstGrade(5.0);
		assertEquals(5.0, stud1.getFirstGrade(), 0.0);
	}

	@Test
	public void testSecondGrade() {
		stud1.setSecondGrade(6.0);
		assertEquals(6.0, stud1.getSecondGrade(), 0.0);
	}

	@Test
	public void testThirdGrade() {
		stud1.setThirdGrade(7.0);
		assertEquals(7.0, stud1.getThirdGrade(), 0.0);
	}

	@Test
	public void testCalculateAverageGradeFirst() {
		stud1.setSecondGrade(6.0);
		stud1.setThirdGrade(7.0);
		assertEquals(6.0, stud1.calculateAverage(5.0), 0.0);
	}
	
	@Test
	public void testCalculateAverageGradeEmpty() {
		stud1.setFirstGrade(5.0);
		stud1.setSecondGrade(6.0);
		stud1.setThirdGrade(7.0);
		assertEquals(6.0, stud1.calculateAverage(), 0.0);
	}

	@Test
	public void testCalculateAverageGradeAll() {
		assertEquals(6.0, stud1.calculateAverage(5.0, 6.0, 7.0), 0.0);
	}
	
	@Test
	public void testToString() {
		stud1.setFirstGrade(7.0);
		stud1.setSecondGrade(8.0);
		stud1.setThirdGrade(9.0);
		
		String str1 = "Student: Student A\nGrades: 7.0 , 8.0 , 9.0\nFinalGrade: 8,0\nThe student has cleared the course\n-----------------------";
		String str2 = "Student: Student B\nGrades: 0.0 , 0.0 , 0.0\nFinalGrade: ,0\nThe student has not cleared the course\n-----------------------";
		assertEquals(str1, stud1.toString());
		assertEquals(str2, stud2.toString());	
	}
	
	

}
