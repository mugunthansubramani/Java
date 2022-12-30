import java.util.*;
import java.io.*;
public class Vectormtd
{
	public static void main(String args[])
	{
		try
		{
			Vector v=new Vector(2);
			System.out.println("size="+v.size());
			System.out.println("capacity="+v.capacity());

			v.addElement(1);
			v.addElement(2);
			v.addElement(100.2456);
			v.addElement("Naveen");
			v.addElement("Bala");
			v.addElement("Mugunth");

			System.out.println("Size="+v.size());
			System.out.println("Elements of the vector="+v);
			System.out.println("First Element="+v.firstElement());
			System.out.println("Last Element+"+v.lastElement());
			
			v.removeElementAt(1);
			System.out.println("After Removing the Element at Index 2"+v);

			for(Enumeration e=v.elements(); e.hasmoreElements();)
			{
				System.out.println(e.nextElements());
			}
			v.removeAllElements();
			System.out.println("first="+v.firstElement());
		}
		catch(Exception e){}
	}
}
			