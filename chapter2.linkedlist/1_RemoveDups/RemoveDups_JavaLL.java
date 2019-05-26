
import java.util.LinkedList;
import java.util.HashSet;

public class RemoveDups_JavaLL {
	public static void main(String[] args){
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(int i = 1; i <= 10; i++){
			linkedList.add(i);
		}
		linkedList.add(3, 7);
		linkedList.add(7, 1);
		printList(linkedList);

		linkedList = removeDupsSinglyList(linkedList);
		printList(linkedList);		
	}
	
	public static LinkedList<Integer> removeDupsSinglyList(LinkedList<Integer> linkedList){
		HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i = 0; i < linkedList.size(); ){
			int element = linkedList.get(i);
			if(hashset.contains(element)){
				System.out.println(element + " " + i);
				linkedList.remove(i);
			} else {
				hashset.add(element);
				i++;
				/*
				Do not increment the element in if part. Because the list itself is getting modified on the fly.
				Increment it only when a new element is added
				*/
			}
		}
		return linkedList;
	}
	
	public static void printList(LinkedList<Integer> linkedList){
		for(int i : linkedList){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}