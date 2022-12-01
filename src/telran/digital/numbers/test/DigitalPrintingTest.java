package telran.digital.numbers.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static telran.digital.numbers.DigitalNumbersPrinting.*;

public class DigitalPrintingTest {
	@Test
	@Disabled
	void lineTest( ) {
		System.out.println(line (30, 30));
	}
	@Test
	@Disabled
	void verticalLineTest (){
		displayStrings(verticalLine(30,20));
	}
	@Test
	@Disabled
	void twoVerticalLinesTest() {
		displayStrings(twoVerticalLines(30, 10, 5));
	}
	@Test
	@Disabled
	void zeroTest( ) {
		displayStrings(zero(30, 10, 9));
	}
	@Test
	@Disabled
	void oneTest() {
		displayStrings(one(30,10,9 ));
	}
	@Test
	@Disabled
	void twoTest() {
		displayStrings(two(30,10,9));
	}
	@Test
	@Disabled
	void threeTest() {
		displayStrings(three(30,10,9));
	}
	@Test
	@Disabled
	void fourTest() {
		displayStrings(four(30,10,9));
	}
	@Test
	@Disabled
	void fiveTest() {
		displayStrings(five(30,10,9));
	}
	@Test
	@Disabled
	void sixTest() {
		displayStrings(six(30,10,9));
	}
	@Test
	@Disabled
	void sevenTest() {
		displayStrings(seven(30,10,9));
	}
	@Test
	@Disabled
	void eightTest() {
		displayStrings(eight(30,10,9));
	}
	@Test
	@Disabled
	void nineTest() {
		displayStrings(nine(30,10,9));
	}
	@Test
	void numberTest() {
		int number1 = 1234567890;
		int number2 = 5568926;
		int offset = 10;
		int width = 10;
		int height = 5;
		displayDigitalNumber(number1, offset, width, height);
		System.out.println("\n");
		displayDigitalNumber(number2, offset, width, height);
	}
	@Test
	private void displayStrings(String[] strings) {
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		} 
		
	}
}
