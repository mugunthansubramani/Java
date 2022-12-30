import java.util.*;
class LinkList
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();

		ll.add("A");
		ll.add("O");
		ll.add("N");
		ll.add("M");
		ll.add("S");
		ll.add("K");

		

		System.out.println("Original Contents="+ll);
		ll.addLast("Z");
		System.out.println("Contents After Adding 'Z' atlast="+ll);
		
		ll.addFirst("G");
		System.out.println("Contents After Adding 'G' atfirst="+ll);

		ll.remove("N");
		System.out.println("Contents After Removing 'N' ="+ll);

		ll.addLast("LL");
		System.out.println("Contents ="+ll);

		ll.removeFirst();
		System.out.println("Contents After using removeFirst() ="+ll);

		ll.removeLast();
		System.out.println("Contents After using removeLast() ="+ll);

		Object val=ll.get(5);
		System.out.println("Printing the value="+val);
		System.out.println("getfirst="+ll.getFirst());
		System.out.println("getlast="+ll.getLast());

		
	}
}
