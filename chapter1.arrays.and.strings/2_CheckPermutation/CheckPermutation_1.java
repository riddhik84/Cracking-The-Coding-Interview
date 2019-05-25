/*
Given 2 strings, check if one string is permutation of other string.
*/

import java.util.Arrays;

public class CheckPermutation_1 {
	public static void main(String[] args){
		String input1 = "aab";
		String input2 = "baa";
		
		boolean result = checkPermutation(input1, input2);
		System.out.println("Permutation result : " + result);
	}
	
	public static boolean checkPermutation(String input1, String input2){
		//If null return false
		if(input1 == null || input2 == null){
			return false;
		}
		
		//If length mismatch return false
		if(input1.length() != input2.length()){
			return false;
		}
		
		//If both strings are same
		if(input1.equals(input2)){
			return true;
		}
		
		//Sort both strings and compare if same
		char[] inputChars1 = input1.toCharArray();
		Arrays.sort(inputChars1);
		String input1Sorted = new String(inputChars1);
		
		char[] inputChars2 = input2.toCharArray();
		Arrays.sort(inputChars2);
		String input2Sorted = new String(inputChars2);
		
		return input1Sorted.equals(input2Sorted) ? true : false;
	}
}