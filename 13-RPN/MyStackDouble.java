public class MyStackDouble{
    private Node top;
    private int size;
    //constructor 1
    public MyStackDouble(){
		top = null;
		size = 0;
    }
    //push 2
    public void push(Double s){
		Node n = new Node(s);
		n.setNext(top);
		top=n;
		size++;
    }    
    //pop 4
    public Double pop(){
		Double s = top.getData();
		top=top.getNext();
		size--;
		return s;
    }
    //peek 6
    public Double peek(){
		return top.getData();
    }
    //isEmpty 5
    public boolean isEmpty(){
		return (top == null);
    }
    //toDouble 3
    public String toString(){
		String ans = "";
		Node n = top;
		while(n != null){
			ans += n.getData() + ", ";
			n=n.getNext();
		}
		return ans;
    }
}