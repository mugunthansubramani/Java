import java.util.Scanner;
class PrNum
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int i=0;
		int num=0;
		//Empty String
		String pn="";
		System.out.println("Enter the value of n:");
		int n=scanner.nextInt();
		scanner.close();
		for(i=1;i<=n;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				//Appended prime number to the string
				pn=pn + i +" "+"\n";
			}
		}
		System.out.println("Prime Numbers from 1 to n are:");
		System.out.println(pn);
	}
}