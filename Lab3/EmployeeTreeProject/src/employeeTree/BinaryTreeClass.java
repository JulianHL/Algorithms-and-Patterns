package employeeTree;

public class BinaryTreeClass {
	
	public BinaryTreeNode<Employee> rootNode;
	
	public BinaryTreeClass() {
		rootNode = null;
	}
	
	
	//methods
	
	//put
	public void put(Employee value) {
		
		BinaryTreeNode<Employee> newNode = new BinaryTreeNode<>();
		newNode.info = value;
		newNode.lLink = null;
		newNode.rLink = null;
		
		if(rootNode == null) {
			rootNode = newNode;
		}
		else {
			
			BinaryTreeNode<Employee> current = rootNode;
			boolean searching = true;
			
			while(searching) {
				
				if(value.getEmp_salary() < (int)current.info.getEmp_salary()) {
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
	private void printTreePreOrder(BinaryTreeNode<Employee> node) {
		if(node != null) {
			System.out.println(node.info);
			printTreePreOrder(node.lLink);
			printTreePreOrder(node.rLink);
		}
	}
	

	private void printTreePostOrder(BinaryTreeNode<Employee> node) {
		if(node != null) {
			printTreePostOrder(node.lLink);
			printTreePostOrder(node.rLink);
			System.out.println(node.info);
		}
	}
	

	private void printTreeOrder(BinaryTreeNode<Employee> node) {
		if(node != null) {
			printTreeOrder(node.lLink);
			System.out.println(node.info);
			printTreeOrder(node.rLink);
		}
	}
	
	public void inOrderTraversal() {
		System.out.println("Displaying the components of the tree list stored\nfrom input file Employee.in as Inorder Traversal\n");
		printTreeOrder(rootNode);
	}
	
	public void inPreOrderTraversal() {
		System.out.println("Displaying the components of the tree list stored\nfrom input file Employee.in as Preorder Traversal\n");
		printTreePreOrder(rootNode);
	}
	
	public void inPostOrderTraversal() {
		System.out.println("Displaying the components of the tree list stored\nfrom input file Employee.in as Postorder Traversal\n");
		printTreePostOrder(rootNode);
	}
}