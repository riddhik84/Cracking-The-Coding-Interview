/*
check if two strings are one change away to be equal by
- add a character
- remove a character
- change a character
*/


public class OneAway {
	public static void main(String[] args){
		String s1 = "pale";
		String s2 = "pal";
		
		boolean result = true;
		boolean result1 = false;
		
		int s1_len = s1.length();
		int s2_len = s2.length();
			
		if(s1.equals(s2)){
			result = true;
		}
		
		if(s1_len > s2_len){
			if((s1_len - s2_len) > 1){
				result = false;
			}
		} else {
			if((s2_len - s1_len) > 1){
				result = false;
			}
		}
		
		if(result != false){
			result1 = oneEditInsertRemove(s1, s2);
			if(result1 == true){
				result = true;
			} else {
				result = oneEditReplace(s1, s2);
			}
		}
	
		System.out.println("Result: " + result);
		
	}
	
	//TODO: change function to make it testable
	public static boolean oneEditInsertRemove(String s1, String s2){
		int s1_index = 0;
		int s2_index = 0;
		while (s2_index < s2.length() && s1_index < s1.length()){
			if(s1.charAt(s1_index) != s2.charAt(s2_index)){
				if(s1_index != s2_index){
					return false;
				}
				s2_index++;
			} else {
				s1_index++;
				s2_index++;
			}
		}
		return true;
	}
	
	public static boolean oneEditReplace(String s1, String s2){
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) != s2.charAt(i)){
				if(foundDifference == true){
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}
}

