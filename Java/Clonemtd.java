class student1 implements Cloneable
{
	int rollno;
	String name;
	student1(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public static void main(String args[])
	{
		return super.Clone();
	}
}
class Clonemtd
{
	public static void main(String args[])
	{
		try
		{
			student1 s1=new student1(145,"Naveen");
			student2 s2=(student1)s1.clone();
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s2.rollno+" "+s2.name);
		}
		catch(Clone NotSupportedException e)
		{
			System.out.println(e);
		}
	}
}