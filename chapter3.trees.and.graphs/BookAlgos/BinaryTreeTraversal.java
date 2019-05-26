import java.util.*;

public class BinaryTreeTraversal{
	public static void main(String args[]){
		
		//Create a binary tree
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		
		//Binary tree traversals
		System.out.println("\nInOrder");
		inOrder(root);
		System.out.println("\n-----------------------------------");
		
		System.out.println("\nPreOrder");
		preOrder(root);
		System.out.println("\n-----------------------------------");
		
		System.out.println("\nPostOrder");
		postOrder(root);
		System.out.println("\n-----------------------------------");
		
	}
	
	public static void inOrder(Node node){
		//visit left, visit node, visit right
		if(node == null){
			return;
		}	
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	public static void preOrder(Node node){
		//visit node, visit left, visit right
		if(node == null){
			return;
		}	
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void postOrder(Node node){
		//visit left, visit right, visit node
		if(node == null){
			return;
		}	
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
}

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
	}
}