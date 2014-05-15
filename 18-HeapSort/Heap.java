public class Heap{
    private int[] data;
    private int size;
    
    public Heap(){
	data=new int[10];
	size=0;
    }

    private void grow(){
	int[] temp = new int[data.length + data.length/2];
	for (int i=0; i<data.length; i++)
	    temp[i]=data[i];
	data=temp;
    }
	
    private void tackOnEnd(int n){
	if (size>=data.length)
	    grow();
	data[size]=n;
	size++;
    }
    
    private void swap(int a, int b){
	int temp=data[a];
	data[a]=data[b];
	data[b]=temp;
    }

    public void siftUp(int n){
	if (data[n]<=data[n/2])
	    return;
	swap(n,n/2);
	siftUp(n/2);       
    }

    public void add(int n){
	tackOnEnd(n);
	siftUp(size-1);
    }
	
    private void pushDown(int n){
	if (n*2<size){
	    if (data[2*n]>data[n])
		swap(n,2*n);
	    pushDown(2*n);
	}
	else if ((2*n) +1<size){
	    if(data[(2*n)+1]>data[n])
		swap(n, (2*n)+1);
	    pushDown((2*n) +1);
	}
	return;
    }
	
    public int getMax(){
	int temp = data[0];
	data[0]=data[size-1];
	size--;
	return temp;
    }
	
    //causes an array index out of bounds error when calling getmax
    //should return a sorted array.
    public int[] toArray(){
	int[] temp = data;
	for (int i=0;i<=data.length;i++)
	    temp[size+i]=getMax();
	return temp;
    }
	
    public String toString(){
	String out="";
	int[] temp=toArray();
		
	for (int i=0;i<temp.length;i++)
	    out += ","+temp[i];
	out=out.substring(1);
	return out;
    }
}
