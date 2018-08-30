package junit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintGradeTest {

	@Test
	public void test() {
		PrintGrade pg=new PrintGrade();
		String results;
		results=pg.print(95);
		assertEquals("You got an 	A",results);
	}

}
