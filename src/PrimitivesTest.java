import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimitivesTest {

	@Test
	void dataTypeTest() {
		int b = 10;
		short a = 20000;
		char c = 'd';
		long l = (long) 10.1;
		byte b1 = (byte) 1000;
		a=(short) l;
		float f = 10.2f;
		int b2 = 0xffffffff6;
		
		assertEquals(-10,b2);
	}
	@Test
	void operatorsTest() {
		int a = 10;
		assertEquals(13, a + 3);
		assertEquals(1, a % 3);
		int number = 123;
		assertEquals(3, getThirdDigit (number));
		assertEquals(2, getSecondDigit (number));
		assertEquals(1, getThirdDigit (number));
	}
//assumption: all three methods take number comprising of three digits
}
