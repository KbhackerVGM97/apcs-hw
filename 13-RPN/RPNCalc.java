import java.io.*;
import java.util.*;
// I keep getting  cannot find lastln error whenever i compile, and i cant find the issue
public class RPNCalc{
    public static void main (String[] args){
	MyStackDouble data = new MyStackDouble();
	Scanner sc = new Scanner(System.in);
	while (true){
	    //do the stuff and return the ans
	    String lastln = sc.nextLine();
	    System.out.println ("."+lastln+".");
	    if (lastln.equals("+")){
		data.push(data.pop()+data.pop());
		System.out.println(data.peek());
	    }
	    else if (lastln.equals("-")){
		data.push(data.pop()-data.pop());
		System.out.println(data.peek());
	    }
	    else if (lastln.equals("/")){
		data.push(data.pop()/data.pop());
		System.out.println(data.peek());
	    }
	    else if (lastln.equals("*")){
		data.push(data.pop()*data.pop());
		System.out.println(data.peek());
	    }
	    else{
		//try{
		    data.push(Double.parseDouble(lastln));
		    //}
		    //catch(Exception e){
		    //System.out.println("Whoops");
		    //}
	    }
			
	}
    }
}