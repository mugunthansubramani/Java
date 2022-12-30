import java.util.*;
class HMap
{
	public static void main(String args[])
	{
		Map<Integer,String> is=new HashMap<Integer,String>();
		
		is.put(1,"ONE");
		is.put(3,"THREE");
		is.put(4,"FOUR");
		is.put(2,"TWO");
		is.put(5,"FIVE");
		
		System.out.println(is);
		for(Map.Entry e:is.entrySet())
		{
			System.out.println("Key: "+e.getKey()+"     Value "+e.getValue());
		}
		
		System.out.println(is.entrySet());
		
	}
}
		
