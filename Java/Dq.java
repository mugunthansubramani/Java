import java.util.*;
class Dq
{
	public static void main(String args[])
	{
		Deque<String> ls=new ArrayDeque<String>();

		ls.add("Naveen");
		ls.add("Mugunth");
		ls.add("Bala");
		ls.add("Karthi");
		ls.add("Dhileep");

		System.out.println("Elements in the Queue:"+ls);		

		ls.addFirst("OD");
		System.out.println("Add Elements First in the Queue:"+ls);

		ls.addLast("Nivas");
		System.out.println("Add Elements Last in the Queue:"+ls);

		ls.removeFirst();
		System.out.println("Remove Elements First in the Queue:"+ls);

		ls.removeLast();
		System.out.println("Remove Elements Last in the Queue:"+ls);
		
	}
	
}