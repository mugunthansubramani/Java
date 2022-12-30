class employee
{
	int salary=40000;
}
class programmer extends Employee
{
	int bonus=12000;
}
class InherSingle
{
	pubic static void main(String args[])
	programmer p=new Employee();
	System.out.println("Programmer salary="+p.salary);
	System.out.println("Programmer bonus="+p.bonus);
}