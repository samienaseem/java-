class AreaRectangle {
	int result;
	int area(int a,int b) {
		result=a*b;
		return result;
	}

	public static void main(String[] args) {
		int c;
		AreaRectangle ar= new AreaRectangle();
		c=ar.area(10,20);
		System.out.println(c);


	}
}