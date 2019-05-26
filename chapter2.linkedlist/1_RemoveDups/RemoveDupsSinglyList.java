import java.util.HashSet;
public class RemoveDupsSinglyList {
	public static void main(String[] args){
		
			Node head = new Node(10);
			Node second = new Node(10);
			Node third = new Node(12);
			Node fourth = new Node(13);
			Node fifth = new Node(14);
			
			head.next = second;
			second.next = third;
			third.next = fourth;
			fourth.next = fifth;
			
			//Add data in HashSet to capture unique values
			HashSet<Integer> unique = new HashSet<Integer>();

			Node n = head;
			Node previous = null; //Keep track of previous node while traversing list
			while(n != null){
				//System.out.println(n.getData());
				int data = n.getData();
				if(unique.contains(data)){
					previous.next = n.next;
				} else {
					unique.add(data);
					previous = n; //Keep track of previous node while traversing list
				}
				n = n.next;
			}
			
			n = head;
			while(n != null){
				System.out.println(n.getData());
				n = n.next;
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