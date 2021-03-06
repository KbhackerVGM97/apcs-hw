import java.io.*;
import java.util.*;

public class MyQueue{
    private Node head;
    private Node tail;
    private int length;

    public MyQueue(){
	head = null;
	tail = null;
	length = 0;
    }

    public void enqueue(String s){
	Node n = new Node(s);
	if (length==0){
	    head = n;
	    tail=head;
	}
	else{
	    tail.setNext(n);
	    tail=n;
	}
	length++;
    }

    public String dequeue(){
	if(length==0){
	    System.out.println("Queue is empty");
	    return null;
	}
	else{
	    String s = head.getData();
	    head=head.getNext();
	    length--;
	    if (head==null)
		tail=null;
	    return s;
	}
    }

    public String front(){
	if(length>0)
	    return head.getData();
	else{
	    System.out.println("Queue is empty");
	    return null;
	}
    }

    public int length(){
	return length;
    }

    public String toString(){
	String s = "";
	Node tmp = head;
	while (tmp!=null){
	    s=s+tmp.getData()+"-->";
	    tmp = tmp.getNext();
	}
	s=s+"tail";
    }
}
