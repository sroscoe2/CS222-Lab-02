package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.End;

class EndTest {

	@Test
	void decodeTest01() {
		String message = "ding secret blah blah blah blah blah blah blah" +
				" blah blah blah message ding";
		String expected = "secret message "; 
		String actual = End.decode(message);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void decodeTest02() {
		String message = "ding hello "
				+ "blah blah blah blah blah blah blah blah blah blah "
				+ "how "
				+ "blah blah blah blah blah blah blah blah blah blah "
				+ "are "
				+ "blah blah blah blah blah blah blah blah blah blah "
				+ "you "
				+ "ding";
		String expected = "hello how are you "; 
		String actual = End.decode(message);	
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void decodeTest03() {
		String message = "When I hear my phone ding I sincerely wish that students read more books about undying unweilding hope which prompts them to learn about the great mystery of you or rather your personal life experiences While its we who are reckless unfettering idiots its greatly preferable that we prioritize the enjoying of life Understanding this great mystery can lead to unlocking this confounding conundrum Implementing this wish creates students of a different class Ding There goes my phone again";
		String expected = "i hope you are enjoying this class "; 
		String actual = End.decode(message);	
		Assertions.assertEquals(expected, actual);
	}


}
