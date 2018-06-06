class news {
	news()
	{
		this(10);
	   System.out.println("default");
	}
	news (int a) {
		this(false);
		System.out.println("integer");	

	}

	news ( boolean b) {
		System.out.println("boolean");
	}

	public static void main(String[] args) {
		news n1=new news();
	}
}