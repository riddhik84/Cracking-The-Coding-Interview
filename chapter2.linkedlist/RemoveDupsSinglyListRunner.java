import java.util.HashSet;

//Space O(1)
//Time O(N2)
public class RemoveDupsSinglyListRunner {
	public static void main(String[] args){
		
			Node head = new Node(10);
			Node second = new Node(11);
			Node third = new Node(12);
			Node fourth = new Node(10);
			Node fifth = new Node(14);
			
			head.next = second;
			second.next = third;
			third.next = fourth;
			fourth.next = fifth;

			//head, current and runner all point to the same linked list created
			//If runner make changes in the sequence, head and current will also be changed
			//as the linkedlist if objects
			
			Node current = head;
			while(current != null){
				//System.out.println(n.getData());
				Node runner = current;
				while(runner.next != null){
					if(current.getData() == runner.next.getData()){
						runner.next = runner.next.next; //If duplicate value is found, remove the node
					} else {
						runner = runner.next;
					}
				}
				current = current.next;
			}
			
			current = head;
			while(current != null){
				System.out.println(current.getData());
				current = current.next;
			}
	}
}

//Singly linked list
class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
	
	int getData(){
		return data;
	}
}