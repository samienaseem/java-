class news {
	news()
	{
	   System.out.println("default");
	}
	news (int a) {
		System.out.println("integer");	
	}

	news ( boolean b) {
		System.out.println("boolean");
	}

	public static void main(String[] args) {
		news n1=new news();
	}
}