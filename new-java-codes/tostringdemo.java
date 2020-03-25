class tostringdemo {
	int i;

	tostringdemo(int j) {
		this.i=j;
	}

	public String toString() {
		return i+"samar is very nice persons";
	}

	public static void main(String[] args) {
		tostringdemo t1=new tostringdemo(100);
		System.out.println(t1);
			}
}