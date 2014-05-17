import java.util.*;

public class MedianStuff{
    public PriorityQueue<Double> bottom;
    public PriorityQueue<Double> top;
    public double median;
    private boolean even;

    public MedianStuff(){
	median=null;
	even = false;
	top = new PriorityQueue<Integer>();
	bottom = new PriorityQueue<Integer>(11,Collections.reverseOrder());
    }
    
    private void recalibrateMedian(){
	even = false;
	if (bottom.size()-1==top.size)
	    median=bottom.peak();
	else if (bottom.size()==top.size()-1)
	    median=top.peek();
	else if (bottom.size()==top.size()){
	    median=(top.peek()+bottom.peek())/2.0;
	    even=true;
	}
	else if (bottom.size()-1>top.size()){
	    top.add(bottom.poll());
	    recalibrateMedian();
	}
	else if (top.size()-1>bottom.size()){
	    bottom.add(top.poll());
	    recalibrateMedian();
	}
    }

    public void add(int n){
	if (median == null){
	    median=n;
	    bottom.add(n);
	}
	else if (n>median)
	    top.add(n);
	else
	    bottom.add(n);
	recalibrateMedian();
    }

    public double peekMedian(){
	return median;
    }
    
    public double removeMedian(){
	if (even)
	    return (top.poll()+bottom.poll())/2.0;
	else if (top.size()>bottom.size())
	    return top.poll();
	else if ()
    }
}