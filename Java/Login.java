import java.util.*;
class Login
{
	public static void main(String args[])
	{
		Scanner na=new Scanner(System.in);
		String s1;
		int n;
		System.out.println("Enter the Username");
		s1=na.next();
		System.out.println("Enter the Password");
		n=na.nextInt();
		if(s1.equals("Naveen"))
		{
			if(n==5225)
			{
			System.out.println("Valid user");
			}
			else
			{
			System.out.println("In-valid Password user");
			}
		}
		else
		{
		System.out.println("In-valid Username user");
		}
	}
}