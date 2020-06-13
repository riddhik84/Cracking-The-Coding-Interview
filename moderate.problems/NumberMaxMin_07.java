
public class NumberMaxMin_07 {
	public static void main(String[] args) {
        int num1 = 20;
		int num2 = 30;
        int min = findMin(num1, num2);
		int max = findMax(num1, num2);
		System.out.println("Min: " + min + " Max: " + max);
    }
	
	static int findMin(int a, int b){
		// (20+30)/2 = 25
		// abs(20-30)/2 = 5
		//25 - 5 = 20 min value
		return (a+b)/2 - Math.abs(a-b)/2;	
	}
	
	static int findMax(int a, int b){
		//25 + 5 = 30 max value
		return (a+b)/2 + Math.abs(a-b)/2;
	}
	
	//Function from GFG 
	//https://www.geeksforgeeks.org/find-largest-two-distinct-numbers-without-using-conditional-statements-operators/
    static int largestNum(int a, int b) { 
        return a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0); 
    } 
}