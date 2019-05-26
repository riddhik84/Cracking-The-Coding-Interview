//BFS in binary tree
import java.util.*;

public class BreadthFirstSearch_BinaryTree{
	public static void main(String args[]){
		Node head = createBinaryTree();
		int searchNode = 8;
		boolean result = BFS(head, searchNode);
		System.out.println("Binary tree search result for " + searchNode + " is " + result);
		
	}
	
	static Node createBinaryTree(){
		//Create a Binary Tree with 8 nodes including head
		Node head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);

		head.leftNode = two;
		head.rightNode = three;
		two.leftNode = four;
		two.rightNode = five;
		three.leftNode = six;
		three.rightNode = seven;
		four.leftNode = eight;

		
		ArrayList<Node> nodes = new ArrayList<>();
		nodes = head.getChildren();
		System.out.println("Head children:" +nodes.size());
		nodes = two.getChildren();
		System.out.println("Two's children:" + nodes.size());
		nodes = three.getChildren();
		System.out.println("Three's children:" + nodes.size());
		nodes = four.getChildren();
		System.out.println("Four's children:" + nodes.size());
		
		nodes = four.getChildren();
		System.out.println("Four's children:" + nodes.size());
		nodes = five.getChildren();
		System.out.println("Five's children:" + nodes.size());
		nodes = six.getChildren();
		System.out.println("Six's children:" + nodes.size());
		
		return head;
	}
	
	static boolean BFS(Node head, int searchNode){
		/* Breadth First Search Steps:
		* Add node to the queue
		* Is node = searchNode? return found : next steps...
		* is node visited? remove node from queue : next steps... (Step not important in Binary Tree search)
			** add node neighbours to the queue
			** mark node as visited
			** remove node from queue
		* repeat above steps till queue is not empty
		*/
		boolean found = false;
		Queue<Node> BFS_queue = new LinkedList<>();   // queue = linkedlist
		if (head != null){
			BFS_queue.add(head); // Add head to the queue
			while(!BFS_queue.isEmpty()){
				Node n = BFS_queue.peek();
				if(n.getNodeData() == searchNode){ //Check if the searched value is found
					found = true;
					return found;
				} else {
					ArrayList<Node> children = n.getChildren(); //Add node children to the queue
					if(children.size() > 0){
						for (Node ch : children){
							BFS_queue.add(ch);
						}
					}
					//Print BFS node traversal
					System.out.println("Visited Node: " + n.getNodeData());
					n.setVisited(true); //Mark the node visited - but condition is never used
					BFS_queue.poll(); //Removed from the queue
				}
			}
		} else {
			found = false;
		}
		return found;
	}	
}

class Node {
	int data;
	Node leftNode;
	Node rightNode;
	boolean visited = false;
	
	Node (int data){
		this.data = data;
	}
	
	ArrayList<Node> getChildren(){
		ArrayList<Node> children = new ArrayList<>();
		if(leftNode != null){
			children.add(leftNode);
		}
		
		if(rightNode != null){
			children.add(rightNode);
		}
		
		return children;
	}
	
	void setLeftNode (Node left){
		leftNode = left;
	}
	
	Node getLeftNode(){
		return leftNode;
	}
	
	void setRightNode(Node right){
		rightNode = right;
	}
	
	Node getRightNode(){
		return rightNode;
	}
	
	void setNodeData(int data){
		this.data = data;
	}
	
	int getNodeData(){
		return data;
	}
	
	void setVisited(boolean state){
		visited = state;
	}
	
	boolean isVisited(){
		return visited;
	}
	
	
}