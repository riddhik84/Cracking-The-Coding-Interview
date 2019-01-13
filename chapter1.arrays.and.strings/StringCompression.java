
public class StringCompression{
	public static void main(String[] args){
		String input = "aaaaaaaaaaaaaa";
		
		String compressedString = getCompressedString(input);
		System.out.println("Compressed String: " + compressedString);
	}
	
	public static String getCompressedString(String input){
		//Add proxy character at the end to loop till the last char count
		input = input + "$";
		StringBuilder output = new StringBuilder();
		
		int consecutiveChars = 1;
		//Loop length - 1 to avoid proxy character
		for(int i = 0; i < input.length() - 1; i++){
			if(input.charAt(i) == input.charAt(i+1)){
				consecutiveChars++;
			} else {
				output.append(input.charAt(i));
				output.append(consecutiveChars);
				consecutiveChars = 1;
			}
		}
		//System.out.println("Compressed string: " + output.toString() + " Len: " + output.toString().length());
		
		//If compressed string is smaller than the actual string return compressed string else return actual string
		return output.toString().length() < input.length() ? output.toString() : input.substring(0, input.length() - 1);
	}
}