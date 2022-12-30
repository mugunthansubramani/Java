import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,i,n;

		System.out.println("Enter any Number:");
		n=sc.nextInt();

		System.out.println("The Fibonacci Series");
		n1=0;
		n2=1;
		n3=n1+n2;
		
		System.out.println(n1+"\n"+n2);
		System.out.println(n3);
		for(i=1;i<=n;i++)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println(n3);
		}
	}
}