class clonedemo implements Cloneable {

	int i=10;
	int j=20;

	public static void main(String[] args) throws Exception  {
		
		clonedemo c1= new clonedemo();
		clonedemo c2= (clonedemo)c1.clone();

		c1.i=100;
		c1.j=200;
		System.out.println(c2.i+"---   ---"+c2.j);
	}

}