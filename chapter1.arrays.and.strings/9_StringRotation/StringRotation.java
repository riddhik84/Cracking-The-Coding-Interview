
public class StringRotation {
	public static void main(String[] args){
		String s1 = null;
		String s2 = "";
		boolean result = false;

		if(s1 == null || s2 == null){ //null string check
			result = false;
		} else if(s1.equals(s2)){ // equal string check
			result = true;
		} else if(s2.length() == s1.length()){ // string length check
			result = isRotation(s1, s2);
		} else { // Negative condition
			result = false;
		}
		
		System.out.println("String rotation: " + result);

	}
	
	public static boolean isRotation(String s1, String s2){
		//To get substring combine s1 + s1 and find s2
		String fullString = s1 + s1;
		if(isSubstring(fullString, s2)){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isSubstring(String s1, String s2){
		int index = s1.indexOf(s2);
		System.out.println(index);
		//If index is -1 s2 is not substring of s1
		if(index != -1){
			/* not required since -1 indicate that the substring is not present
			for (int i = index, j = 0; i < s2.length() + index; i++, j++){
				System.out.println("i :" + i);
				if(s1.charAt(i) != s2.charAt(j)){
					return false;
				} 
			}*/
			return true;
		} else {
			return false;
		}
	}
}