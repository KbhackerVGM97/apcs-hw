import java.io.*;
import java.util.*;

public class Node{
    private String data;
    private Node next;
    
    public Node(String info){
	data = info;
    }

    public void setData(String info){
	data = info;
    }

    public String getData(){
	return data;
    }

    public void setNext(Node follower){
	next = follower;
    }

    public Node getNext(){
	return next;
    }
}