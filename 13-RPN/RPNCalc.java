import java.io.*;
import java.util.*;
// I keep getting  cannot find lastln error whenever i compile, and i cant find the issue
public class RPNCalc{
    public static void main (String[] args){
		MyStackDouble data = new MyStackDouble();
		Scanner sc = new Scanner(System.in);
		while (true){
			//do the stuff and return the ans
			String lastIn = sc.nextLine();
			if (lastln == "+"){
				data.push(data.pop()+data.pop());
			}
			if (lastln == "-"){
				data.push(data.pop()-data.pop());
			}
			if (lastln == "/"){
				data.push(data.pop()/data.pop());
			}
			if (lastln == "*"){
				data.push(data.pop()*data.pop());
			}
			else{
				try{
					data.push(Integer.parseDouble(lastln));
				}
				catch(Exception e){
					System.out.println("Whoops");
				}
			}
			
		}
    }
}