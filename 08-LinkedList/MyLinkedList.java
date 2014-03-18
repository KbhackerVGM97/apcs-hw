import java.io.*;
import java.util.*;

public class MyLinkedList{

    private Node leader;
    
    public MyLinkedList(){
	head = null; // just as a precaution and to make it clear
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
    }
}