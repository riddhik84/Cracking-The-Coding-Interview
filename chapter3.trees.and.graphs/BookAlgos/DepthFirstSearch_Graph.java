//BFS in binary tree
import java.util.*;

public class DepthFirstSearch_Graph{
	public static void main(String args[]){
		Node head = createTree();
		int searchNode = 9;
		boolean result = DFS(head, searchNode);
		System.out.println("Graph search result for " + searchNode + " is " + result);
		
	}
	
	static Node createTree(){
		//Create a Graph with 7 nodes including head
		Node head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);

		head.addNeighbour(two);
		two.addNeighbour(three);
		two.addNeighbour(four);
		two.addNeighbour(five);
		two.addNeighbour(six);
		three.addNeighbour(two);
		three.addNeighbour(seven);
		four.addNeighbour(two);
		five.addNeighbour(two);
		five.addNeighbour(six);
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
	
	static boolean DFS(Node head, int searchNode){
		/* Depth First Search Steps:
		* Add node to the stack
		* Is node = searchNode? return found : next steps...
		* is node visited? remove node from stack : next steps... (Important step in Graph to avoid duplicate search)
			** add node neighbours to the stack
			** mark node as visited
			** remove node from stack
		* repeat above steps till stack is not empty
		*/
		boolean found = false;
		Stack<Node> DFS_stack = new Stack<>();
		if (head != null){
			DFS_stack.push(head); // Add head to the stack
			while(!DFS_stack.isEmpty()){
				Node n = DFS_stack.pop();              //////////// For DFS use pop() here and not peek()
				if(!n.isVisited()){
					if(n.getNodeData() == searchNode){ //Check if the searched value is found
						found = true;
						return found;
					} else {
						ArrayList<Node> neighbours = n.getNeighbours(); //Add node children to the stack
						if(neighbours.size() > 0){
							for (Node nb : neighbours){
								if(nb.getNodeData() == searchNode){ //This if loop is extended logic to check for the node right away in neighbours
									found = true;
									return found;
								}
								DFS_stack.push(nb);
							}
						}
						//Print BFS node traversal
						System.out.println("Visited Node: " + n.getNodeData());
						n.setVisited(true); //Mark the node visited - but condition is never used
						//DFS_stack.pop();                      //////////// For DFS this step is not required
					}
				} else {
					DFS_stack.pop(); //Removed from the stack
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