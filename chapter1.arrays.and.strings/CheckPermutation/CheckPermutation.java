import java.util.Arrays;

public class CheckPermutation {
	public static void main(String[] args){
		String input1 = "a ab";
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
		
		//Sort both strings and compare if same
		char[] inputChars1 = input1.toCharArray();
		Arrays.sort(inputChars1);
		String input1Sorted = new String(inputChars1);
		
		char[] inputChars2 = input2.toCharArray();
		Arrays.sort(inputChars2);
		String input2Sorted = new String(inputChars2);
		
		System.out.println(input1Sorted);
		System.out.println(input2Sorted);
		
		if (input1Sorted.equals(input2Sorted)){
			return true;
		}
		
		return false;
	}
}