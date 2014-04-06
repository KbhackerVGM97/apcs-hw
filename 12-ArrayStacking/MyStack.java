import java.io.*;
import java.util.*;

public class MyStack{
    private int index;
	private String[] items;

    public MyStack(){
		items = new String[10];
		index=0;
    }

	private void grow(){
		String[] tmp = new String[items.length + (items.length / 2)];
		for (int i = 0; i < items.length; i++)
			tmp[i]=items[i];
		items=tmp;
	}
	
    public void push(String s){
		if (index==items.length)
			grow();
		items[index]=s;
		index++;
    }    

    public String pop(){
		String s = items[index];
		index--;
		return s;
    }

    public String peek(){
		return items[index];
    }
    
	public boolean isEmpty(){
		return (index>0);
    }
    
	public String toString(){
		String ans = "";
		for (int i = 0;i<index;i++){
			ans+=items[i];
			ans+=", ";
		}
		return ans;
    }
}