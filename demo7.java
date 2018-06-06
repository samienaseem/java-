interface test1 {
	abstract void show();
}
interface test2 {
	void display();
}
class demo implements test1,test2 {
	public void show() {
		System.out.println("show");
	}
	public void display() {
		System.out.println("display");
	}

	public static void main(String[] args) {
		demo t=new demo();
		t.show();
		test2 t2=new demo();
		t2.display();
	}
}