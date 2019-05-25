/*
Tester class
*/

public class TestCheckPermutation {
	public static void main(String... args){
		CheckPermutation_1 tester1 = new CheckPermutation_1();
		printResults(null, null);
		printResults("", "");
		printResults(" ", " ");
		printResults(" ", "  ");

		printResults("abc", "acb");
		printResults("abc", "cba");
		printResults("abc", "a cb");
		
		printResults("??", "??");
		printResults("<>", "><");
		printResults("aB", "bA");
		
	}
	
	public static void printResults(String str1, String str2){
		System.out.println("IsPermutation_1: " + str1 + " " +str2 + " " + CheckPermutation_1.checkPermutation(str1, str2));
		System.out.println("IsPermutation_2: " + str1 + " " +str2 + " " + CheckPermutation_2.checkPermutation(str1, str2));
	}
}