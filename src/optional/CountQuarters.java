package optional;

import junit.framework.TestCase;

/* Complete the countQuarters() method so that it calculates the number of cents left over 
 * if you took out all the possible quarters. */

public class CountQuarters extends TestCase {
	
	public void test() throws Exception {
		assertEquals(0, countQuarters(0.25));
		assertEquals(0, countQuarters(1));
<<<<<<< HEAD
		assertEquals(1, countQuarters(25.26));
=======
		assertEquals(14, countQuarters(0.64));
>>>>>>> ad8adb218dabdc1af763a84d5f9cf3e65a6a3676
		assertEquals(3, countQuarters(12.78));
	}

	private Object countQuarters(double money) {
<<<<<<< HEAD
		return (int) (money * 100) % 25;
=======
		// TODO Auto-generated method stub
		return null;
>>>>>>> ad8adb218dabdc1af763a84d5f9cf3e65a6a3676
	}

}
