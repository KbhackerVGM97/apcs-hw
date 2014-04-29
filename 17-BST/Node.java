public class Node{
    private int data;
    private Node left, right;

	public Node(int stuff){
		data=stuff;
		left=null;
		right=null;
	}
    public void setRight(Node next){
		right=next;
    }

    public void setLeft(Node next){
		left = next;
    }

    public void setData(int stuff){
		data=stuff;
    }

    public int getData(){
		return data;
    }

    public Node getLeft(){
		return left;
    }

    public Node getRight(){
		return right;
    }
}