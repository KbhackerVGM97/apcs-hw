public class Driver{
	public static void main(String[] args){
		MyLinkedList l = new MyLinkedList();
		String a = new String("A");
		String b = new String("B");
		String c = new String("C");
		String d = new String("D");
		String e = new String("E");
		
		l.add(0,a);
		l.add(1,d);
		l.add(2,c);
		System.out.println(l);
		l.set(1, "B");
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.remove(1));
		System.out.println(l);
	}
}