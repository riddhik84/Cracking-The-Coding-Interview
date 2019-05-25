/*
Determine if a string has all unique characters
What if you cannot use additional data structure?
*/
public class IsUnique {
	
	public static void main(String[] args){
		String input = "hel";
		boolean result = isUniqueChar(input);
		System.out.println("Is Unique: " + result);
	}
	
	public static boolean isUniqueChar(String input){
		if(input != null && input.length() > 1){
			char[] chars = input.toCharArray();
			boolean[] valueArray = new boolean[256];
		
			for(int i = 0; i < chars.length; i++){
				int charValue = chars[i];
				if(valueArray[charValue] == false){
					valueArray[charValue] = true;
				} else {
					return false;
				}	
			}
		} else {
			return false;
		}
		return true;
	}
}