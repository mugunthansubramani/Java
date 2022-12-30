import java.util.*;
class SetInter
{
	public static void main(String args[])
	{
		HashSet<Integer> i=new HashSet<Integer>();
		
		i.add(2);
		i.add(4);
		i.add(10);
		i.add(8);
		i.add(10);
		System.out.println(i);
		Iterator<Integer> h=i.iterator();
		while(h.hasNext())
		{
			System.out.println(h.next());
		}

		System.out.println("TreeSet");
		TreeSet<Integer> i1=new TreeSet<Integer>();
		
		i1.add(22);
		i1.add(44);
		i1.add(100);
		i1.add(88);
		i1.add(100);
		System.out.println(i1);

		System.out.println("LinkedSet");
		LinkedHashSet<String> i2=new LinkedHashSet<String>();
		
		i2.add("ONE");
		i2.add("THREE");
		i2.add("FOUR");
		i2.add("THREE");
		i2.add("FIVE");
		System.out.println(i2);
	}
}
		
