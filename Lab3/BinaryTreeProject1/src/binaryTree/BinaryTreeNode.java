package binaryTree;

public class BinaryTreeNode {

	private int info;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	// Constructors
	public BinaryTreeNode(int info) {
		this.info = info;
	}
	
	public BinaryTreeNode() {
		this.info = 0;
	}
	
	// Getters and Setters
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
}
