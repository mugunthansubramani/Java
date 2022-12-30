class Factorial
{
	public static void main(String args[])
	{
		int i, n=4;
		int fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial Number:"+fact);
	}
}