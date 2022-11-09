import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrimitivesTest {

	@Test
	@Disabled
	void dataTypeTest() {
		int b = 10;
		short a = 20000;
		char c = 'd';
		long l = (long) 10.1;
		byte b1 = (byte) 1000;
		a = (short) l;
		float f = 10.2f; // ставим f что бы принялось как флоат
		int b2 = 0xfffffff1;

		assertEquals(-15, b2); // сравнение, что одно равно другому
	}

	@Test
	@Disabled
	void operatorsTest() {
		int a = 10;
		assertEquals(13, a + 3);
		assertEquals(1, a % 3);
		int number = 123;
		assertEquals(3, getThirdDigit(number));
		assertEquals(2, getSecondDigit(number));
		assertEquals(1, getFirstDigit(number));

	}

	private int getFirstDigit(int number) {
		return number / 100;
	}

	private int getSecondDigit(int number) {
		return (number / 10) % 10;
	}

	private int getThirdDigit(int number) {
		return number % 10;
	}

	@Test
	@Disabled
	void getBitValueTest() {
		long num = 0x3ab7f5; // 001110101011011111_1_10101
		assertEquals(1, BitOperations.getBitValue(num, 5));
		assertEquals(0, BitOperations.getBitValue(num, 11));
		assertEquals(0, BitOperations.getBitValue(num, 1));
		assertEquals(1, BitOperations.getBitValue(num, 2));
		assertEquals(-1, BitOperations.getBitValue(num, 100));
		assertEquals(-1, BitOperations.getBitValue(num, -2));
	}

	@Test
	@Disabled
	void setBitValueTest() {
		long number = 0x3ab7f5; // 001110101011011111_1_10101
		assertEquals(0x3ab7f4, BitOperations.setBitValue(number, 0, false));
		assertEquals(0x3ab7f5, BitOperations.setBitValue(number, 1, false));
		assertEquals(0x3abff5, BitOperations.setBitValue(number, 11, true));
	}

	@Test
	@Disabled
	void negateBitValueTest() {
		long number = 0x3ab7f5; // 001110101011011111_1_10101
		assertEquals(0x3ab7b5, BitOperations.invertBitValue(number, 6));
		assertEquals(0x3ab7f4, BitOperations.invertBitValue(number, 0));
	}

	@Test
	@Disabled
	void oneInNumberTest() {
		long number = 0x3ab7f5; // 111 0 1 0 1 0 11 0 111 1111 0 1 0 1
		assertEquals(16, BitOperations.oneInNumber(number));
	}

	@Test
	@Disabled
	void leadingZerosTest() {
		long number = 0;
		assertEquals(64, BitOperations.leadingZeros(number));
	}

	@Test
	@Disabled
	void isHappyNumberTest() {
		int number = 123411;
		int number1 = 555411;
		int numberIncorrectLength = 111111111;
		int numberIncorrectLength1 = 111;
		assertEquals(true, Numbers.isHappyNumber(number));
		assertEquals(false, Numbers.isHappyNumber(number1));
		assertEquals(false, Numbers.isHappyNumber(numberIncorrectLength));
		assertEquals(false, Numbers.isHappyNumber(numberIncorrectLength1));
	}

	@Test
	@Disabled
	void getDigitsTest() {
		int expected[] = { 1, 2, 3, 4 };
		assertArrayEquals(expected, Numbers.getDigits(1234));
	}

	@Test
	@Disabled
	void getNumberDigitsTest() {
		int expectedNumber = 1234;
		assertEquals(expectedNumber, Numbers.getNumberFromDigits(new int[] { 1, 2, 3, 4 }));

	}

	@Test
	void IsraelIdVerification() {
		int expectedNumber = 346847874;
		assertTrue(IsraelIdentity.IsraelIdVerification(expectedNumber));

	}
	@Test
	void generateRandomIDTest() {
		assertTrue(IsraelIdentity.IsraelIdVerification(IsraelIdentity.generateRandomID()));

	}

	@Test
	void addsNumberTest() {
		int firstArray[] = { 1, 2, 3, 4, 5, 6 };
		int number = 7;
		int newArray[] = MyArrays.addsNumber(firstArray, number);
		assertEquals(7, newArray[newArray.length - 1]);
		System.out.print(Arrays.toString(newArray));
	}
}