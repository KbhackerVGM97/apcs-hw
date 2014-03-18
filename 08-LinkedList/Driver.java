public class Driver{
    /*    public static void main (String[] args){
	Node n = new Node("Bob");
	System.out.println(n);

	Node n2 = new Node("Joe");
	n.setNext(n2);
	n2.setNext(new Node("Tom"));

	Node last = n.getNext().getNext();
	System.out.println(last);

	last.setNext(n);
	//they are now looped together

	}*/

    public static void main (String[] args){
	
	MyLinkedList L = new MyLinkedList();

	L.add("Bob");
	L.add("Joe");
	L.add("Tom");
	
    }
}