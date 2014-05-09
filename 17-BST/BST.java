public class BST{
	private Node root;
	
	public BST(){
		root=null;
	}
	
	public void setRoot(Node next){
		root = next;
	}
	public Node getRoot(){
		return root;
	}

	public void print(){
		if(root == null)
			System.out.println("null tree");
		else
			print(root);
	}
	private void print(Node n){
		System.out.println(n.getData());
		if(n.getRight()!=null)
			print(n.getRight());
		if(n.getLeft()!=null)		
			print(n.getLeft());
	}
}
