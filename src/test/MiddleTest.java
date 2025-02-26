package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Middle;

class MiddleTest {

	boolean checkArraysEqual(char[] one, char[] two){
		if (one.length != two.length)
			return false;
		for(int i=0; i<one.length; i++) {
			if (one[i] != two[i])
				return false;
		}
		return true;
	}

	@Test
	void middleTest01() {
		char[] expected = {'h','e','l','l','o','w','o','r','l','d'};
		char[] actual = Middle.splitToLetters("hello", "world");
		Assertions.assertTrue(checkArraysEqual(expected,actual));
	}
	
	@Test
	void middleTest02() {
		char[] expected = {'h','i','h','o','w','d','o','y','o','u','l','i','k','e','t','h','e','c','l','a','s','s'};
		char[] actual = Middle.splitToLetters("hi", "howdoyouliketheclass");
		Assertions.assertTrue(checkArraysEqual(expected,actual));
	}



}
