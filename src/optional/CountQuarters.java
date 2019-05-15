package optional;

import junit.framework.TestCase;

/* Write a method called countQuarters(int money) that calculates the number of cents left over 
 * if you took out all the possible quarters. */

public class CountQuarters extends TestCase {
	
	public void test() throws Exception {
		assertEquals(0, countQuarters(0.25));
		assertEquals(0, countQuarters(1));
		assertEquals(1, countQuarters(25.26));
		assertEquals(3, countQuarters(12.78));
	}

	private Object countQuarters(double money) {
		return (int) (money * 100) % 25;
	}

}