
public class URLify {
	public static void main(String[] args){
		String input = "Mr John Smith    ";
		//Truelength = string len till last character (before spaces)
		int trueLength = 13;
		
		String urlified_string = getURLifiedString(input, trueLength);
		System.out.println(urlified_string);
	}
	
	public static String getURLifiedString(String input, int trueLength){
		char[] input_array = input.toCharArray();
		int spaceCounter = 0;
		for(int i = 0; i < trueLength; i++){
			if(input_array[i] == ' '){
				spaceCounter++;
			}
		}
		
		//Count total lenght of the string with spaces * 2
		int totalLength = trueLength + spaceCounter * 2;
		
		for(int j = trueLength - 1; j >=0; j--){
			if(input_array[j] == ' '){
				//Replace chars in place when a space is found in the string
				input_array[totalLength - 1] = '0';
				input_array[totalLength - 2] = '2';
				input_array[totalLength - 3] = '%';
				totalLength = totalLength - 3;
			} else {
				input_array[totalLength - 1] = input_array[j];
				totalLength--;
			}
		}
		return new String(input_array);
	}
}