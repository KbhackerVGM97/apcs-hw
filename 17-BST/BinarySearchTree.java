public class BinarySearchTree{
    private Node root;
	
	public BinarySearchTree(){
		root=null;
	}
	
	public void setRoot(Node next){
		root = next;
	}
	public Node getRoot(){
		return root;
	}
	
    private Node PBsearch(int x){
		Node p = root;
		Node pb = p;
		while(p!=null&&p.getData()!=x){
			pb=p;
			if (p.getData<x)
			p=p.getRight();
			else
			p=p.getLeft();
		}
		return pb;
    }
	
	public Node search(int x){
		Node p = PBsearch(x);
		if (x>p.getData)
			return p.getRight;
		return p.getLeft;
	}
	
	public Node Rsearch(int x){
		if (x == root.getData)
			return root;
		return search2(root,x);
	}
	
	private Node search2(Node n, int x){
		if (n.getData()==n)
			return n;
		if (n.getData()>x){
			if (n.getLeft()==null)
				return null;
			return search2(n.getLeft, x);
		}
		else{
			if (n.getRight()==null)
				return null;
			return search2(n.getRight(),x)
		}
	}

    public void insert(int n){
		Node p=root;
		Node pb=root;
		while (p!=null){
			pb=p;
			if (n>p.getData())
				p=p.getRight();
			else
				p=p.getLeft();
		}
		if (n > pb.getData())
			pb.setRight(n);
		else
			pb.setLeft(n);
    }
	
	private boolean isLeaf(int n){
		Node p = search(n);
		if (p.getLeft()==p.getRight())
			return true;
		return false;
	}
	
	private boolean isSingleChilded(int n){
		Node p = PBsearch(n);
		if (p.getLeft()==null||p.getRight()==null)
			return true;
		return false;
	}
	
	public delete(int x){
		//circumstances 1 & 2
		Node p = search(x);
		Node pb = PBsearch(x);
		if (isLeaf(x)){
			if (x>pb.getData())
				pb.setRight(null);
			else
				pb.setLeft(null);
		}
		else if(isSingleChilded(x)){
			if (x>pb.getData()){
				if(p.getLeft()==null)
					pb.setRight(p.getRight());
				else
					pb.setRight(p.getLeft());
			}
			else{
				if (p.getLeft()==null)
					pb.setLeft(p.getRight());
				else
					pb.setLeft(p.getLeft());
			}
		}
		//3rd case
		Node p1=p.getLeft();
		while (p1.getRight()!=null)
			p1=p1.getRight();
		delete(p1);
		//ill finish it up later
		//root case
		if (x==root.getData()){
			//how to remove root effectively?!?!
		}
	}

	public void print(){
		if(root == null)
			System.out.println("null tree");
		else
			print(root);
	}

	private void print(Node n){
		if (n==null)
			return;
		else{
			print(n.getLeft());
			System.out.println(n.getData());
			print(n.getRight());	
		}
	}

	/*
	pre order traversal
	in order traversal
	post oreder traversal
	*/
}
