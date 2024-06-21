package binaryTreeProject;

public class TestBinaryTree {
	public static void main(String[] args) {
		//initialization
		BinaryTreeClass myTree = new BinaryTreeClass();
		
		//add the elements
		myTree.put(60);
		myTree.put(50);
		myTree.put(70);
		myTree.put(80);
		myTree.put(40);
		
		//print the tree in different ways
		myTree.inOrderTraversal();
		System.out.println();
		myTree.inPreOrderTraversal();
		System.out.println();
		myTree.inPostOrderTraversal();
	}
}
