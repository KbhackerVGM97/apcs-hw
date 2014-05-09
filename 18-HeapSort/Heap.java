public class Heap{
    private int[] data;
    private int size;
    
    public Heap(){
	data=newint[10];
	size=0;
    }

    private void tackOnEnd(int n){
	if (size>=data.size)
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
	return siftUp(n/2);       
    }

    public void add(int n){
	tackOnEnd(n);
	siftUp(size-1);
    }
}
