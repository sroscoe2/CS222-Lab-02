package main;

public class Middle {
	
	public static char[] splitToLetters(String a, String b) {
		/*
		 * #7. TODO: Why does this method initially fail?
		 * 
		 */
		
		
		// convert a to char array
		char[] result = a.toCharArray();
		
		// TODO: call reallocate() with result and b.length()
		
		// use a loop to add characters in b to result
		char[] bchar = b.toCharArray();
		for(int i=0; i<b.length(); i++) {
			result[a.length()+i] = bchar[i];
		}

		
		return result;
	}
	
	public static char[] reallocate(char[] c, int s) {
		/* TODO return an array,
		 * Which contains things already in c.
		 * But its size is increased by 
		 * the amount specified in the second parameter.
		 */
	
		// TODO replace null with something else.
		return null;
	}

	public static void main(String[] args) {
		System.out.println(splitToLetters("hello, world!", "This is another string."));

	}

}
