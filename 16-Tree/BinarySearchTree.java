public class BinarySearchTree{
    private Node root;
	
    public Node search(int x){
	Node p = root;
	while(p!=null&&p.getData()!=x){
	    if (p.getData<x)
		p=p.getRight();
	    else
		p=p.getLeft();
	}
    }

    public void insert(int n){
	Node p=root;
	Node pb=root;
	while 
    }
}
