import java.util.*;
class UserInput
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter the First Number:");
		n1=ob.nextInt();

		System.out.println("Enter the Second Number:");
		n2=ob.nextInt();

		n3=n1*n2;
		System.out.println("Output");
		System.out.println("Product of a Number is:"+n3);
		}
}
	