import java.util.*;
class Marksheet
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		String name;
		int rollno,mark1,mark2,mark3,tl,pr;

		System.out.println("Enter the Student Name:");
		name=s.nextLine();

		System.out.println("Enter the Rollno:");
		rollno=s.nextInt();

		System.out.println("Enter the mark1");
		mark1=s.nextInt();

		System.out.println("Enter the mark2");
		mark2=s.nextInt();
		
		System.out.println("Enter the mark3");
		mark3=s.nextInt();

		System.out.println("Enter the total");
		tl=mark1+mark2+mark3;

		System.out.println("Enter the percentage");
		pr=(mark1+mark2+mark3)/3;

		
		System.out.println("*****************************");
		System.out.println("Marksheet");
		System.out.println("*****************************");

		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("English:"+mark1);
		System.out.println("Maths:"+mark2);
		System.out.println("Science:"+mark3);
		System.out.println("Total:"+tl);
		System.out.println("Percentage:"+pr);
		}
}