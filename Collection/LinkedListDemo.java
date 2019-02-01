import java.util.*;
class LinkedListDemo
{
	public static void main(String args[])
	{
	LinkedList<String> l1=new LinkedList<String>();
	System.out.println("initial size of al:"+l1.size());
	l1.add("C");
	l1.add("A");
	l1.add("E");
	l1.add("D");
	l1.add("F");
	l1.add(1,"A2");
	l1.addLast("Z");
	l1.addFirst("A");

	System.out.println("initial size addition al:"+l1);
	l1.remove("F");
	l1.remove(2);
	System.out.println("initial deletion al:"+l1);
	l1.removeFirst();
	l1.removeLast();
	System.out.println("after deletion of first and last al:"+l1);
	String val=l1.get(2);
	l1.set(2,"5");
	System.out.println("changed list:"+l1);
	}
}