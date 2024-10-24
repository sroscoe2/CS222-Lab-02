package main;

/**
 * Class to get familiar with and practice writing
 * for-each loops. 
 */
public class Beginning {
	
	
	/**
	 * A method to find a number "target" in an array. 
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean findNumberInArray(int[] arr, int target) {
		/*
		 * TODO Write in words: what does this for loop do?
		 * 
		 */
		for(int num : arr) {
			if(num == target) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean findLetterInString(String s, char target) {
		// TODO: Convert s to char array with s.toCharArray()
		// TODO: Write a for-each loop to go through the char array
		// TODO: Test if each character in the array is equal to the target.
		
		
		
		
		// TODO: change this return statement? 
		// when do we return true? 
		return false;
	}
		

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.printf("Found %d ? %b",7,findNumberInArray(arr,7));
		System.out.printf("Found %d ? %b",13,findNumberInArray(arr,13));
		System.out.printf("Found %c ? %b",7,findLetterInString("the quick brown fox jumped over the lazy dog",'z'));
		System.out.printf("Found %c ? %b",13,findLetterInString("i am really enjoying this class!",'t'));

	}

}
