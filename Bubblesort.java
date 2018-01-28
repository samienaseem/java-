class BubbleSort
{
	public static void main(String[] x )
	{
		int a[]={2,4,8,1,6,7};
		int i,j,temp;
	  System.out.println("the given array is");
	     for(i=0;i<6;i++)
	        {
		     System.out.println(a[i]);
		}
	for(i=0;i<6;i++)
	{
		for(j=0;j<6-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
	}
			System.out.println("the sorted array is");
	for(i=0;i<6;i++)
	{
		System.out.print(a[i]);
	}

	}
}