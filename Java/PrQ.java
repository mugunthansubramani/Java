import java.util.*;
class PrQ
{
	public static void main(String args[])
	{
		PriorityQueue<String> ls=new PriorityQueue<String>();

		ls.add("Naveen");
		ls.add("Mugunth");
		ls.add("Bala");
		ls.add("Kishore");
		ls.add("Dhileep");

		System.out.println(ls);
		System.out.println("Head:"+ls.element());
		System.out.println(ls);
		System.out.println("Head:"+ls.peek());
		System.out.println(ls);
		System.out.println(ls.remove());
		System.out.println("After Removing:"+ls);
		System.out.println("Poll Methods:"+ls.poll());
		System.out.println("Afer poll Methods:"+ls);

		Iterator t=ls.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
	}
}
