class mynameiskhan20 {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder("my name is khan");
		String s=(sb.reverse().toString()).replace(" ","%20");
		System.out.println(s);
	}
};