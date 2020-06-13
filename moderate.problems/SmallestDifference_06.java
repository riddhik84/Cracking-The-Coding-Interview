import java.util.*;

public class SmallestDifference_06 {
	public static void main(String[] args) {
        int[] array1 = {1,3,15,11,2};
		int[] array2 = {23,127,235,19,8};
        int diff = findSmallestDifference(array1, array2);
		System.out.println("Smallest difference is " + diff);
    }
	
	public static int findSmallestDifference(int[] arr1, int[] arr2){
		//sort both arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		int diff = Integer.MAX_VALUE;
		//check difference between each element and keep track of min diff
		
		//extended version - also print the numbers for which there is smallest difference
		int num1 = 0;
		int num2 = 0;
		while(i < arr1.length && j < arr2.length){
			if((int)Math.abs(arr1[i] - arr2[j]) < diff){
				diff = (int)Math.abs(arr1[i] - arr2[j]);
				num1 = arr1[i];
				num2 = arr2[j];
			}
			if(arr1[i] < arr2[j]){
				i++;
			} else {
				j++;
			}
		}
		
		System.out.println("Smallest difference between numbers " + num1 + " " + num2);
		return diff;
	}
}