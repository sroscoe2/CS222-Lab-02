package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Beginning;

class BeginningTest {

	@Test
	void letterTest01() {
		String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer blandit neque a neque vestibulum blandit. Aliquam erat volutpat. In blandit diam ut faucibus eleifend. Praesent cursus porta dui vel cursus. Mauris ultricies ligula condimentum justo gravida, quis facilisis urna ullamcorper. Sed a lobortis erat, sit amet aliquam quam. Fusce ac convallis tortor. Pellentesque dui odio, suscipit non interdum tempor, laoreet efficitur tortor.";
		boolean expected = true;
		boolean result = Beginning.findLetterInString(s, 'f');
		Assertions.assertEquals(expected, result);
	}

	@Test
	void letterTest02() {
		String s = "Etiam sagittis at dui in lobortis. Suspendisse ullamcorper, nisi non viverra eleifend, risus risus porta nunc, non elementum lectus sapien sed nisl. Cras placerat erat sit amet augue mattis imperdiet. Etiam et lectus nec velit rutrum vestibulum. Quisque libero eros, vestibulum quis scelerisque et, pellentesque sed magna. Curabitur est sapien, porta sit amet consectetur ut, egestas vitae diam. Quisque accumsan sapien a augue vehicula dapibus. Donec lobortis vulputate ligula eget aliquet. Fusce commodo ligula eu metus finibus, a feugiat diam sollicitudin. Maecenas non massa id lectus commodo ullamcorper. Nunc a purus felis. Curabitur eleifend iaculis eleifend.";
		boolean expected = true;
		boolean result = Beginning.findLetterInString(s, 'Q');
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void letterTest03() {
		String s = "Etiam sagittis at dui in lobortis. Suspendisse ullamcorper, nisi non viverra eleifend, risus risus porta nunc, non elementum lectus sapien sed nisl. Cras placerat erat sit amet augue mattis imperdiet. Etiam et lectus nec velit rutrum vestibulum. Quisque libero eros, vestibulum quis scelerisque et, pellentesque sed magna. Curabitur est sapien, porta sit amet consectetur ut, egestas vitae diam. Quisque accumsan sapien a augue vehicula dapibus. Donec lobortis vulputate ligula eget aliquet. Fusce commodo ligula eu metus finibus, a feugiat diam sollicitudin. Maecenas non massa id lectus commodo ullamcorper. Nunc a purus felis. Curabitur eleifend iaculis eleifend.";
		boolean expected = false;
		boolean result = Beginning.findLetterInString(s, 'z');
		Assertions.assertEquals(expected, result);
	}
}
