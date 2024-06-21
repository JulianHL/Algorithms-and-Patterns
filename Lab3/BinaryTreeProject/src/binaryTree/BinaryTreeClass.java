package binaryTree;

public class BinaryTreeClass {
	
	public BinaryTreeNode<Integer> rootNode;
	
	public BinaryTreeClass() {
		rootNode = null;
	}
	
	
	// methods
	
	// put
	public void put(int value) {
		
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>();
		newNode.info = value;
		newNode.lLink = null;
		newNode.rLink = null;
		
		if(rootNode == null) {
			rootNode = newNode;
		}
		else {
			
			BinaryTreeNode<Integer> current = rootNode;
			boolean searching = true;
			
			while(searching) {
				
				if(value < (int)current.info) {
					if(current.lLink == null) {		
						current.lLink = newNode;	
						searching = false;			
					}
					current = current.lLink;		
				}
				else {
					
					
					if(current.rLink == null) {
						current.rLink = newNode;
						searching = false;
					}
					current = current.rLink;
				}
				
			}
		}
	}
	
	
	// Traversals PrintTree preorder, inorder, postorder
	private void printTreePreOrder(BinaryTreeNode<Integer> node) {
		if(node != null) {
			System.out.println("-------"+node.info+"-------");
			printTreePreOrder(node.lLink);
			printTreePreOrder(node.rLink);
		}
	}
	

	private void printTreePostOrder(BinaryTreeNode<Integer> node) {
		if(node != null) {
			printTreePostOrder(node.lLink);
			printTreePostOrder(node.rLink);
			System.out.println("-------"+ node.info+"-------");
		}
	}
	

	private void printTreeOrder(BinaryTreeNode<Integer> node) {
		if(node != null) {
			printTreeOrder(node.lLink);
			System.out.println("-------"+ node.info+"------");
			printTreeOrder(node.rLink);
		}
	}
	
	public void inOrderTraversal() {
		System.out.println("Printing Inorder Tree Values");
		printTreeOrder(rootNode);
	}
	
	public void inPreOrderTraversal() {
		System.out.println("Printing Preorder Tree Values");
		printTreePreOrder(rootNode);
	}
	
	public void inPostOrderTraversal() {
		System.out.println("Printing Postorder Tree Values");
		printTreePostOrder(rootNode);
	}
}