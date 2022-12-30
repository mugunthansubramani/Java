class StArrayMaxMin
{
	public static void main(String args[])
	{
		int i,a[]={10,55,99,1,546,12};
		int max,min;
		
		max=a[0];
		min=a[0];
		for(i=0;i<6;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximum value:"+max);
		System.out.println("Minimum value:"+min);
	}
}