class StArray1
{
	public static void main(String[] args)
	{
		int i,a[]={10,55,99,2,3,0};
		for(i=0;i<6;i++)
		{
			System.out.println("Array position:"+i+"  Array value:"+a[i]);
		}
		System.out.println("Reverse order");
		for (i=5;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}