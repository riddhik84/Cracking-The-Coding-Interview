//BFS in binary tree
import java.util.*;

public class BreadthFirstSearch_Graph{
	public static void main(String args[]){
		Node head = createBinaryTree();
		int searchNode = 7;
		boolean result = BFS(head, searchNode);
		System.out.println("Graph search result for " + searchNode + " is " + result);
		
	}
	
	static Node createBinaryTree(){
		//Create a Graph with 7 nodes including head
		Node head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);

		head.addNeighbour(two);
		head.addNeighbour(three);
		two.addNeighbour(three);
		two.addNeighbour(four);
		two.addNeighbour(five);
		two.addNeighbour(six);
		three.addNeighbour(four);
		four.addNeighbour(six);
		five.addNeighbour(seven);
		six.addNeighbour(seven);

		
		ArrayList<Node> nodes = new ArrayList<>();
		nodes = head.getNeighbours();
		System.out.println("Head Neighbours:" +nodes.size());
		nodes = two.getNeighbours();
		System.out.println("Two's Neighbours:" + nodes.size());
		nodes = three.getNeighbours();
		System.out.println("Three's Neighbours:" + nodes.size());
		nodes = four.getNeighbours();
		System.out.println("Four's Neighbours:" + nodes.size());
		nodes = five.getNeighbours();
		System.out.println("Five's Neighbours:" + nodes.size());
		nodes = six.getNeighbours();
		System.out.println("Six's Neighbours:" + nodes.size());
		nodes = seven.getNeighbours();
		System.out.println("Seven's Neighbours:" + nodes.size());
		
		return head;
	}
	
	static boolean BFS(Node head, int searchNode){
		/* Breadth First Search Steps:
		* Add node to the queue
		* Is node = searchNode? return found : next steps...
		* is node visited? remove node from queue : next steps... (Important step in Graph to avoid duplicate search)
			** add node neighbours to the queue
			** mark node as visited
			** remove node from queue
		* repeat above steps till queue is not empty
		*/
		boolean found = false;
		Queue<Node> BFS_queue = new LinkedList<>();
		if (head != null){
			BFS_queue.add(head); // Add head to the queue
			while(!BFS_queue.isEmpty()){
				Node n = BFS_queue.peek();
				if(!n.isVisited()){
					if(n.getNodeData() == searchNode){ //Check if the searched value is found
						found = true;
						return found;
					} else {
						ArrayList<Node> neighbours = n.getNeighbours(); //Add node children to the queue
						if(neighbours.size() > 0){
							for (Node nb : neighbours){
								BFS_queue.add(nb);
							}
						}
						//Print BFS node traversal
						System.out.println("Visited Node: " + n.getNodeData());
						n.setVisited(true); //Mark the node visited - but condition is never used
						BFS_queue.poll(); //Removed from the queue
					}
				} else {
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
	//Create a Node class with list of neighbours
	int data;
	boolean visited;
	ArrayList<Node> neighbours = new ArrayList<>();
	
	Node (int data){
		this.data = data;
		visited = false;
	}
	
	ArrayList<Node> getNeighbours(){
		return neighbours;
	}
	
	void addNeighbour(Node node){
		neighbours.add(node);
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