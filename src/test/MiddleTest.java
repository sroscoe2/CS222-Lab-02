package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Middle;

class MiddleTest {

	@Test
	void middleTest01() {
		char[] expected = {'h','e','l','l','o','w','o','r','l','d'};
		char[] actual = Middle.splitToLetters("hello", "world");
		Assertions.assertEquals(expected,actual);
	}
	
	@Test
	void middleTest02() {
		char[] expected = {'h','i','h','o','w','d','o','y','o','u','l','i','k','e','t','h','e','c','l','a','s','s'};
		char[] actual = Middle.splitToLetters("hi", "how do you like the class");
		Assertions.assertEquals(expected,actual);
	}


}
