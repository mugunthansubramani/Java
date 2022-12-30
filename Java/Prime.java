import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,k,i;
		k=0;
		System.out.println("Enter any Number:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			k++;
		}
		if(k==2)
		{
			System.out.println("The Given Number is Prime"+n);
		}
		else
		{
			System.out.println("The Given Number is Not Prime"+n);
		}
	}
}