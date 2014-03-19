import java.io.*;
import java.util.*;

public class MyLinkedList{

    private Node head;
    private int length;
    
    public MyLinkedList(){
	head = null; // just as a precaution and to make it clear
	length = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
	length ++;
    }

    public String toString(){
	String ans = "";
	Node n = this.head;
	for (int i = 0; i < length; i ++){
	    ans += n.getData()+", ";
	    if (i < length -1)
		n = n.getNext();    
	}
	return ans;
    }

    public void add (int i, String s){
	Node n= head;
	Node tmp = new Node(s);
	if (i ==0)
	    add(s);
	else{
	    for (int j = 0; j < i-1; j++){
		n = n.getNext();
	    }
	    tmp.setNext(n.getNext());
	    n.setNext(tmp);
	}
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

    public String set(int i, String s){
	Node tmp = new Node(s);
	Node n= head;
	if (i == 0){
	    tmp.detNext(n.getNext);
	    head = tmp;
	}
	else{
	    Node k = getNode(i-1);
	    n = k.getNext();
	    tmp.setNext(k.getNext().getNext());
	    k.setNext(tmp);
	}
	return n;
    }
}