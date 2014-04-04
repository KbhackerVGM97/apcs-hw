public class MyLLIterator<E> implements Iterator<E>{
    private Node currentnode;
    public MyLLIterator<E>(Node n){
	currentnode=n;
    }
    public boolean hasNext(){
	return false;
    }
    public E next(){
	return null;
    }    
    public void Remove(){
    }
}
