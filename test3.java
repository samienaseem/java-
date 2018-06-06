abstract class demo1 {
	abstract void show ();

}
class test3 extends demo1 {
	static int a=10;
	final int b=20;

	public void show() {
			System.out.println("show");
			System.out.println(a);
			System.out.println(b);
			b=b+1;
}

	public static void main(String[] args) {

		test3 d1=new test3();
		d1.show();
		
		}
}
