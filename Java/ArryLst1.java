import java.util.*;
class ArryLst1
{
	public static void main(String args[])
	{
		ArrayList<String>is=new ArrayList<String>(); //array list - class , ls - object

		is.add("Apple");
		is.add("Orange");
		is.add("Apple");
		is.add("Mango");
		is.add("Mango");
		is.add("Mango");

		/*Iterator it=is.iterator(); //iterator - searching from top to bottom
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/

		System.out.println("Showing all elements");
		for(String str:is)
		{
			System.out.println(str);
		}
		System.out.println("Remove Element:"+is.remove(2));
		System.out.println("Get Element using Index:"+is.get(3));
		
		System.out.println("Remove elements starting letter 'A'"+(is.removeIf(n->(n.charAt(0)=='A'))));
		System.out.println("After Remove Single Element");

		for(String str:is)
		{
			System.out.println(str);
		}
	}
}
