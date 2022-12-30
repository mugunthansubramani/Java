class Bonus
{
	public static void main(String args[])
	{
		double bp=15000;
		char gender='f'; //'m'
		double bonus;

		if(bp>=15000) 
		{

			if(gender=='m') //Outer block
			{
				bonus=bp*20/100; //Inner block
				System.out.println("Bonus of an Employee"+bonus);
			}
			else
			{
				bonus=bp*38/100;
				System.out.println("Bonus of an Employee"+bonus);
			}

		}
		else
		{
			bonus=bp*18/100;
			System.out.println("Bonus of an Employee"+bonus);
		}

	}
}