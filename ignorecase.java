class ignorecase {
	public static void main(String[] args) {
		String s1="samar";
		String s2="SAMAR";
		String s3="naseem";
		String s4="naseem";
		System.out.println(s1==s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3==s4);

	}
}