class child {
	void show () {
		System.out.println("this is show pf child ");
	}
}

class parent extends child {
	void display() {
		System.out.println("this is displayu of parent class");
	}

	public static void main(String[] args)throws Exception {
		parent p=new parent();
		p.display();
		p.show();
		Thread.sleep(1000000);
	}

}
