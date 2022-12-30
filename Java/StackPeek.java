import java.util.*;
class stk
{
	public static void main(String args[])
	{
		Stack<String>st=new Stack<String>();
	
		st.push("One");
		st.push("Two");
		st.push("Three");
		st.push("Four");

		System.out.println("Elements in the Stack"+st);
		System.out.println("Elements in the Top of the Stack:"+st.peek());
		System.out.println("Remove Elements"+st.pop());
		System.out.println("Elements in the Stack"+st);
	}
}