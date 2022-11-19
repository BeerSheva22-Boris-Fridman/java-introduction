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
		assertTrue(isAnagram(word, "loweyl"));
		assertTrue(isAnagram(word, "elolyw"));
		assertTrue(isAnagram(word, "wolley"));
		assertTrue(isAnagram(word, "loleyw"));
	}
	@Test
	void AnagramTestFalse() {
		String word = "yellow";
		assertFalse(isAnagram(word,""));
		assertFalse(isAnagram(word, "yellob"));
		assertFalse(isAnagram(word,"yello"));
		assertFalse(isAnagram(word,"yelllo"));
	}
	
	
}
