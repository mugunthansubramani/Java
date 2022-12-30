import java.util.*;
class ArryLst
{
	public static void main(String args[])
	{
		ArrayList<String>is=new ArrayList<String>(); //array list - class , ls - object

		is.add("Apple");
		is.add("Orange");
		is.add("Apple");
		is.add("Mango");

		Iterator it=is.iterator(); //iterator - searching from top to bottom
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
