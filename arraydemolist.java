import java.util.*;
class  arraydemolist
{
	public static void main(String[] args) 
	{
		ArrayList i=new ArrayList();
		i.add("A");
		i.add(10);
		i.add(null);
		System.out.println(i);
		i.remove(2);
		System.out.println(i);
		i.add(2);
		System.out.println(i);
		i.add(2,"m");
		i.add("N");
	//	i.add(7,"s");
		i.add(3,"aa");
		System.out.println(i);

	}
}
