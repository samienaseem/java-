class Static {
	static  int a=10;

	 static void show () {
		System.out.println(a);
		a++;
	}

	public static void main(String[] args) {
		Static s=new Static();
		Static s1=new Static();
		Static s2=new Static();
		Static s3=new Static();
		s.show();
		s2.show();
		s3.show();
		s1.show();
		//show();
	}
}