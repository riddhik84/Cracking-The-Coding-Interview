/*
* Java inbuilt LinkedList class
*/

import java.util.LinkedList;

public class JavaLinkedList {
	public static void main(String... args){
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(int i = 1; i <= 10; i++){
			linkedList.add(i);
		}
		
		int randomNode = generateRandomNode(linkedList);
		System.out.println(randomNode);
	}
	
	public static int generateRandomNode(LinkedList<Integer> linkedList){
		int count = linkedList.size();
		System.out.println(count);
		
		int random = (int) (Math.random() * count);
		return random;
	}
}