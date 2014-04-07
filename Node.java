import java.io.*;
import java.util.*;

public class Node{
    private Double data;
    private Node next;
    
    public Node(Double info){
		data = info;
    }

    public void setData(Double info){
		data = info;
    }

    public Double getData(){
		return data;
    }

    public void setNext(Node follower){
		next = follower;
    }

    public Node getNext(){
		return next;
    }

    public String toString(){
		return "Data: "+data;//+" Next: "+next;
    }
}