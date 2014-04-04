import java.io.*;
import java.util.*;

public class MyStack{
    private Node top;
    private int size;
    //constructor 1
    public MyStack(){
	top = null;
	size = 0;
    }
    //push 2
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top=n;
	size++;
    }    
    //pop 4
    public String pop(){
	String s = top.getData();
	top=top.getNext();
	size--;
    }
    //peek 6
    public String peek(){
	return top.getData();
	
    }
    //isEmpty 5
    public boolean isEmpty(){
	return (top == null);
    }
    //toString 3
    public String toString(){
	String ans = "";
	Node n = top;
	while(n != null){
	    ans += n.getData() + ", ";
	    n=n.getNext();
	}
	return tmp;
    }
}