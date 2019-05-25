
public class TestIsUnique {
	
	public static void main(String[] args){
		//Happy Path
		printResults("123456789zxcvbnmlkjhgfdsaqwertyuiop;'[/.,!@#$%^&*()_+{}|:<>?");
		printResults("AweSOME");
		printResults("aA");

		//UnHappy Path
		printResults("ajshdhsds");
		printResults("&*^&*^&*^&");
		printResults(null);
		printResults("");
		printResults("  ");
		printResults(" 1");
		
	}
	
	public static void printResults(String input){
		//System.out.format("%8s: %s%n", input, IsUnique.isUniqueChar(input));
		System.out.println("Input: " + input + " " + IsUnique.isUniqueChar(input));
	}
}