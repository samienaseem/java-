class SelectionSort
{
	public static void main(String[] x )
	{
			int a[]={9,8,7,6,5,4,3,6,0},i,j;
	System.out.println("enter the elements of array\n");
	for(i=0;i<9;i++)
	{
	  System.out.println(a[i]);
	}
	for(i=0;i<9;i++)
	{
		for(j=i+1;j<9;j++)
		{
			if(a[i]>a[j])
			{
				a[j]=(a[i]+a[j])-(a[i]=a[j]);
			}
		}
		
	}
	System.out.println("the sorted array is=");
	for(i=0;i<9;i++)
	{
	   System.out.print(a[i]);

	}
   }
}