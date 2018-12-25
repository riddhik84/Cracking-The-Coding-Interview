
class IsUnique {
	
	public static void main(String[] args){
		String input = "hel";
		boolean result = isUniqueChar(input);
		System.out.println("Is Unique: " + result);
	}
	
	static boolean isUniqueChar(String input){
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
		return true;
	}
}