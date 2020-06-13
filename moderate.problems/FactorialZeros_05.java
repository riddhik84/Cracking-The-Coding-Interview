
public class FactorialZeros_05 {
	public static void main(String[] args){
		int[] nums = {1,5,8,19,20,25,100,250,500,1000};
		for(int i : nums){
			int count = countTrailingZeros(i);
			System.out.println("Trailing zeros in the number: " + i + " are: " + count);
		}
	}
	
	static public int countTrailingZeros(int num){
		int count = 0;
		for(int i = 5; num / i > 0; i *= 5){
			count += num / i; 
		}
		return count;
	}
}