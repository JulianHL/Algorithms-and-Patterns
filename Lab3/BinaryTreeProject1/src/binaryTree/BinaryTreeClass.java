package binaryTree;

public class BinaryTreeClass {

private BinaryTreeNode root;
private BinaryTreeNode currentNode;

public BinaryTreeNode getRoot() {
	return root;
}

public void setRoot(BinaryTreeNode root) {
	this.root = root;
}

public void put(int info) {
	BinaryTreeNode newNode = new BinaryTreeNode(info);
	
	if (root==null) {
		root = newNode;
		currentNode = root;
	}else {
	if (currentNode == null) {
		currentNode.setRight(newNode);
		currentNode = root;
	}else {
		
		if(currentNode.getInfo()<info) {
			currentNode = currentNode.getRight();
			put(info);
			}
		else {
			currentNode = currentNode.getLeft();
			put(info);
			}
		}
	}
}


public void printInOrder() {
	InOrder(root);
}

private void InOrder(BinaryTreeNode root) {
	
	if(root.getLeft()!=null) {
		InOrder(root.getLeft());
	}
	System.out.println(root.getInfo());
	if(root.getRight()!=null) {
		InOrder(root.getRight());
	}
	
}


}
