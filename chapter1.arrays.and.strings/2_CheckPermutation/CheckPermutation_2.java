
public class CheckPermutation_2 {
	public static void main(String[] args){
		String s1 = "ab cc";
		String s2 = "abc c";
		
		boolean result = checkPermutation(s1, s2);
		System.out.println("Permutation Result: " + result);
	}
	
	public static boolean checkPermutation(String s1, String s2){
		//Return false if any string is null
		if(s1 == null || s2 == null){
			return false;
		}
		
		//Return false if the string length not equal
		if(s1.length() != s2.length()){
			return false;
		}
		
		//Create an array with 127 ASCII characters. Count the occurances of each character in string1.
		//Compare the character count from string2. If any of the counter reach < 0, return false else return true.
		char[] s1_array = s1.toCharArray();
		int[] chars_array = new int[128];
		
		for(char c : s1_array){
			chars_array[c]++;
			//System.out.println(chars_array[c]);
		}
		
		for(int i = 0; i < s2.length(); i++){
			chars_array[s2.charAt(i)]--;
			//System.out.println(chars_array[s2.charAt(i)]);
			if(chars_array[s2.charAt(i)] < 0){
				return false;
			}
		}
		return true;
	}
}