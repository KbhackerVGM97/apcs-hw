import java.io.*;
import java.util.*;

public class MyLinkedList{

    private Node head, tail;
    private int length;
    
    public MyLinkedList(){
		head = new Node("dummy"); 
		length = 0;
		tail = head
    }

    public String toString(){
		String ans = "";
		Node n = head.getNext();
		for (int i = 0; i < length; i ++){
			ans += n.getData()+";";
			if (i < length -1)
				n = n.getNext();    
		}
		return ans;
    }

	public void add(String s){
		tmp = new Node(s);
		tmp.setNext(tail.getNext());
		tail.setNext(tmp);
		length++;
	}
	
    public void add (int i, String s){
		if (i==length)
			add(s);
		else{
		Node n= head;
		Node tmp = new Node(s);
		for (int j = 0; j < i; j++)
			n = n.getNext();
		tmp.setNext(n.getNext());
		n.setNext(tmp);
		length ++;}
	}

    public int length(){
		return length;
    }

    private Node getNode(int i){
		Node n = head;
		for (int j = 0; j < i; j++){
			n = n.getNext();
		}
		return n;
    }
	
	public String get(int i){
		return getNode(i+1).getData();
	}
	
	public String remove(int i){
		String ans = getNode(i+1).getData();
		getNode(i).setNext(getNode(i).getNext().getNext());
		length--;
		return ans;
	}

    public String set(int i, String s){
		Node n = getNode(i);
		n.getNext().setData(s);
		return n.getNext().getData();
    }
}