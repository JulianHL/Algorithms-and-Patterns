package binaryTree;

public class TestBinaryTree {
	public static void main(String[] args) {
		
		BinaryTreeClass myTree = new BinaryTreeClass();
		
		
		myTree.put(60);
		myTree.put(50);
		myTree.put(70);
		myTree.put(80);
		myTree.put(40);
		
		
		myTree.inOrderTraversal();
		System.out.println();
		myTree.inPreOrderTraversal();
		System.out.println();
		myTree.inPostOrderTraversal();
	}
}
