import java.util.*;
class test5
{  static int i,j;
	 static int count[]=new int[256];
	static void occurance(String str) 
	{
		int len=str.length();
		System.out.println(len);
		for (i=0;i<len ;i++ )
		{
			count[str.charAt(i)]++;
		}
		for (i=0;i<len ;i++ )
		{
			System.out.println(count[i]);
		}

		char c[]=new char[len];
		for (i=0;i<len ;i++ )
		{
			c[i]=str.charAt(i);
				int s=0;
			for(j=0;j<len;j++) {

				if(c[j]==str.charAt(i))
					s++;
			}
				if(s==1)
			System.out.println(" occurance of "+  str.charAt(i)   +  " is "    + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
	   String str=sc.nextLine();
	   occurance(str);
	}
}
