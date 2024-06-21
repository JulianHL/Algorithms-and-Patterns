package binaryTreeProject;

public class BinaryTreeClass {
	//this is our first node
	public BinaryTreeNode rootNode;
	
	public BinaryTreeClass() {
		rootNode = null;
	}
	
	//add value to the tree
	public void put(int value) {
		//first we create the node that we're going to add
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode();
		newNode.info = value;
		newNode.lLink = null;
		newNode.rLink = null;
		
		//then we check if we already have a root node
		if(rootNode == null) {
			rootNode = newNode;
		}
		else {
			//if we already have a root node
			//then we need to allocate the new node in one of the branches of the tree
			//we start from the very beginning the root node
			BinaryTreeNode current = rootNode;
			boolean searching = true;
			
			while(searching) {
				//then in a loop we compare the value of the new node with the info in the current node
				//if the value is less than the current node info
				if(value < (int)current.info) {
					if(current.lLink == null) {		//we ask if the node on the left is null
						current.lLink = newNode;	//if it is null then we set the new node to the left link
						searching = false;			//and we break the loop
					}
					current = current.lLink;		//if it isn't null then we need to move to the node on the left
				}
				else {
					//if the value is greater than the info in the current node info
					//we start to move to the right doing the same processs but with the right link
					if(current.rLink == null) {
						current.rLink = newNode;
						searching = false;
					}
					current = current.rLink;
				}
				//we made this logic to let the values lessers to the root node info on the left side of the tree
				//and the values greaters on the right side of the tree
			}
		}
	}
	
	//these are different ways to print the tree
	//depending in what values you want show first using recursivity
	//print tree in pre order
	private void printTreePreOrder(BinaryTreeNode node) {
		if(node != null) {
			System.out.println("value: " + node.info);
			printTreePreOrder(node.lLink);
			printTreePreOrder(node.rLink);
		}
	}
	
	//print tree in post order
	private void printTreePostOrder(BinaryTreeNode node) {
		if(node != null) {
			printTreePostOrder(node.lLink);
			printTreePostOrder(node.rLink);
			System.out.println("value: " + node.info);
		}
	}
	
	//print tree in traverse order
	private void printTreeOrder(BinaryTreeNode node) {
		if(node != null) {
			printTreeOrder(node.lLink);
			System.out.println("value: " + node.info);
			printTreeOrder(node.rLink);
		}
	}
	
	public void inOrderTraversal() {
		System.out.println("Tree in order traversal");
		printTreeOrder(rootNode);
	}
	
	public void inPreOrderTraversal() {
		System.out.println("Tree in pre order");
		printTreePreOrder(rootNode);
	}
	
	public void inPostOrderTraversal() {
		System.out.println("Tree in post order");
		printTreePostOrder(rootNode);
	}
}