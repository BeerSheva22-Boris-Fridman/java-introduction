package telran.text;
import static org.junit.jupiter.api.Assertions.*;
import static telran.text.Strings.*;
import org.junit.jupiter.api.*;



class ObjectTest {

	@Test
	void test() {
	Integer a = 11;
	Integer b = 11;
	assertEquals(a, b);
	Integer c = 201;
	Integer d = 201;
	assertEquals(c, d);
	assertTrue(a == b);
	assertFalse(c == d); // proverjaet ssilki
	assertTrue(c.equals(d)); //proverjaet znachenija
	}
	@Test
	void stringTest() {
		String hello = "hello";
		char[] helloAr = hello.toCharArray(); // char eto toze 4iclo
		assertEquals('h', helloAr[0]);
		System.out.println((byte)helloAr[0]);
		assertEquals(5, hello.length());
	}
	@Test
	void AnagramTestTrue() {		
		String word = "yellow";
		assertTrue(Strings.isAnagram(word, "loweyl"));
		assertTrue(Strings.isAnagram(word, "elolyw"));
		assertTrue(Strings.isAnagram(word, "wolley"));
		assertTrue(Strings.isAnagram(word, "loleyw"));
	}
	@Test
	void AnagramTestFalse() {
		String word = "yellow";
		assertFalse(Strings.isAnagram(word,""));
		assertFalse(Strings.isAnagram(word, "yellob"));
		assertFalse(Strings.isAnagram(word,"yello"));
		assertFalse(Strings.isAnagram(word,"yelllo"));
		//assertFalse(Strings.isAnagram("yttttoooo", "yoootttty")); 
	}
	@Test
	void javavariableTest( ) {
		assertTrue("java".matches(Strings.javaNameExp()));
		assertFalse("1java".matches(Strings.javaNameExp()));
		assertFalse("_".matches(Strings.javaNameExp()));
		assertTrue("__".matches(Strings.javaNameExp()));
		assertTrue("java_1_2".matches(Strings.javaNameExp()));
		assertTrue("$".matches(Strings.javaNameExp()));
		assertFalse("$ _".matches(Strings.javaNameExp()));
	}
	
	@Test
	void ipV4OctetTest( ) {
	assertTrue("000".matches(Strings.ipV4Octet()));
		assertTrue("123".matches(Strings.ipV4Octet()));
		assertTrue("255".matches(Strings.ipV4Octet()));
		assertTrue("1".matches(Strings.ipV4Octet()));
		assertTrue("12".matches(Strings.ipV4Octet()));	
		
		assertFalse("1java".matches(Strings.ipV4Octet()));
		assertFalse("java".matches(Strings.ipV4Octet()));
		assertFalse("__123".matches(Strings.ipV4Octet()));
		assertFalse("_ 123".matches(Strings.ipV4Octet()));
		assertFalse("_123".matches(Strings.ipV4Octet()));
		assertFalse("$ _".matches(Strings.ipV4Octet()));
		assertFalse(" ".matches(Strings.ipV4Octet()));
		assertFalse("256".matches(Strings.ipV4Octet()));
		assertFalse("1255".matches(Strings.ipV4Octet()));
	
		
	}
	@Test
	void ipV4Test( ) {
		assertTrue("000.000.000.000".matches(Strings.ipV4()));
		assertTrue("0.0.0.0".matches(Strings.ipV4()));
		assertTrue("255.255.255.255".matches(Strings.ipV4()));
		assertTrue("123.000.235.024".matches(Strings.ipV4()));
		assertTrue("1.000.235.024".matches(ipV4()));
		assertTrue("11.000.235.024".matches(Strings.ipV4()));
		assertTrue("10.29.166.193".matches(Strings.ipV4()));
		assertTrue("23.00.23.04".matches(Strings.ipV4()));
				
		assertFalse("1java".matches(Strings.ipV4()));
		assertFalse("java".matches(Strings.ipV4()));
		assertFalse("_23.123.232.231".matches(Strings.ipV4()));
		assertFalse(" 23.1.1.1".matches(Strings.ipV4()));
		assertFalse("_123".matches(Strings.ipV4()));
		assertFalse("$ _".matches(Strings.ipV4()));
		assertFalse(" ".matches(Strings.ipV4()));
		assertFalse("256.1.1.1".matches(Strings.ipV4()));
		assertFalse("1255.221.001.222".matches(Strings.ipV4()));
		assertFalse("111.111.111.111.111".matches(Strings.ipV4()));
		assertFalse("123.000.235".matches(Strings.ipV4()));
		assertFalse("12".matches(Strings.ipV4()));
		
	}
	@Test
//	@Disabled
	void computeExpressionTest() {
		assertEquals(10.5, computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5", null, null));
		assertEquals(25.5, computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5 + a + b", new double[] {15, 0}, new String[] {"a", "b"}));
		assertEquals(15, computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5 + a + b + 4.5 / 2", new double[] {15, 0}, new String[] {"a", "b"}));
		assertEquals(15, computeArithmeticExpression("2 + (2 + 1 * 2) + (0.5 + a) + b + 4.5 / 2", new double[] {15, 0}, new String[] {"a", "b"}));
		assertTrue(Double.isNaN(computeArithmeticExpression("2 (+ 2) + 1 * 2 + 0.5 + a + b", new double[] {15,25, 0}, new String[] {"a", "b"})));
		assertTrue(Double.isNaN(computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5 + a + b", new double[] {15,25, 0}, new String[] {"a", "b"})));
		assertTrue(Double.isNaN(computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5 + ImNotAvariable + b", new double[] {15,25, 0}, new String[] {"a", "b"})));
		assertTrue(Double.isNaN(computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5 + a + b", new double[] {15,25}, new String[] {"a", "b", "c"})));
		assertTrue(Double.isNaN(Strings.computeArithmeticExpression("2 # 2 ++ 10", null, null)));
		assertEquals(10.5, Strings.computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5", new double[] {2,1}, new String[] {"a", "c"}));
		assertTrue(Double.isNaN(Strings.computeArithmeticExpression("2 + 2 + 1 * 2 + d23", new double[] {2,1}, new String[] {"a", "c"}))); 
	}
	@Test
	void Braces() {
		assertTrue(checkBraces("2 + 2 + 1 * 2 + 0.5"));
	}
	@Test
	void hhhTest( ) {
		assertTrue("2+2+1*2+0.5".matches(arithmeticExpression()));
	}
	
	@Test
	void ggg() {
		String r = "b";
		assertEquals(0, getOperandValue(r, new double[] {15, 0}, new String[] {"a", "b"}));
	}
}
	
	
