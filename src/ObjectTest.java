import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	}
	
//	@Test
//	@Disable
//	void isSum2Test() {
//		short[] arr1 = { 6, 3, 6, 1, 3, 5, 4};
//			assertTrue(Strings.isSum2(arr1, (short) 7));
//		}
//	@Test
//	@Disable
//	void isSum2TestFalse() {
//		short[] arr1 = { 6, 3, 6, 1, 3, 5, 4};
//			assertFalse(Strings.isSum2(arr1, (short) 25));
//	}
}
