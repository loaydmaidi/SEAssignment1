package maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mathtesting {

	@Test
	public void testAdd() {
		
		int exp = 15;
		Math a = new Math();
		int result = a.add();
		assertTrue(exp==result);
		
	}

}
