/*
write a function to to find if a string is permutation of pelindrome.
*/

import java.util.HashMap;

public class PalindromePermutation {
	public static void main(String[] args){
		String input = "abccfbca  ";
		
		boolean result = checkPalindromePermutation(input);
		System.out.println("Palindrome Permutation: " + result);
	}
	
	public static boolean checkPalindromePermutation(String str){
		if(str == null){
			return false;
		}
		
		if (str.length() <= 2){
			return true;
		}
		
		//Count occurance of each character using HashMap
		HashMap<Character, Integer> charMap = new HashMap<>();
		char[] str_array = str.toCharArray();
		for (char c : str_array){
			if (checkCharacter(c)){
					if(charMap.containsKey(c)){
					int value = charMap.get(c);
					System.out.println("value: " + value);
					value = value + 1;
					charMap.put(c, value);
				} else {
					charMap.put(c, 1);
				}
			} else {
				//If the character is other than alphabet, set the counter as 0
				charMap.put(c, 0);
			}
		}
		System.out.println(charMap);
		
		//Using oddCounter, find out how many character occurances are odd count
		int oddCounter = 0;
		if(!charMap.isEmpty()){
			for(int value : charMap.values()){
				if(value%2 != 0){
					oddCounter++;
				}
			}
		}
		System.out.println("oddCounter: " + oddCounter);
		
		//If string length is odd and oddCounter is 1, the string is palindrome permutation
		if((str.length() % 2 != 0) && (oddCounter == 1)){
			return true;
		//If string length is even and oddCounter is 0, the string is palindrome permutation
		} else if((str.length() % 2 == 0) && (oddCounter == 0)){
			return true;
		//If above two conditions are false, palindrome permutation is not possible	
		} else {
			return false;
		}
	}
	
	//Check if the character is alphabet
	public static boolean checkCharacter(char c){
		int ch = (int)c;
		System.out.println("Char: " + ch);
		if((ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122)){
			return true;
		} else {
			return false;
		}
	}
}