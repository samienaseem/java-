class pattern
{
	public static void main(String x[])
   {
	int a[]={3,5,1,6,7};
	//byte i,j;
	for(int i=7;i>0;i--)
	{
		for(int j=0;j<5;j++)
		{
			if(a[j]>=i)
			{
				System.out.print("*");
			}
			 else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
   }
}