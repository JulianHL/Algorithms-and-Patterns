package binaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTreeClass binaryTree = new BinaryTreeClass();
		binaryTree.put(60);
		binaryTree.put(50);
		binaryTree.put(70);
		binaryTree.put(40);
		binaryTree.put(80);
		
		binaryTree.printInOrder();

	}
}
