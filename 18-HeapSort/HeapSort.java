import java.util.*;

public class HeapSort{
    public static void main (String[] args){
		Heap buddy = new Heap();
		int[] datea = new int[20];
		int i;
		for (i = 0; i<20;i++)
			datea[i] = (int) (Math.random() * i);
		System.out.println(Arrays.toString(datea));
		for (i=0;i<datea.length;i++)
			buddy.add(datea[i]);
		System.out.println(buddy);
	}
}