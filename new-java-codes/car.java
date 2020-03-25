interface gear{

	int g=0; 
	void display();
	
}
interface doors {

	void show();
}
interface wheels {

	void run();
}
interface engine{

	void rotate();

}
class car implements gear,doors,wheels,engine {

	public void display() {
		//g+=1;
		System.out.println("gear shift "+g);
	}

	public void show() {

		//g+=1;
		System.out.println("door open "+g);
	}
	public void run() {

		//g+=1;
		System.out.println("car is moving");
	}
	public void rotate() {

		//g+=1;
		System.out.println("engine revs");
	}

	public static void main(String[] args) {
		car c=new car();
		c.display();
		c.show();
		c.run();
		c.rotate();
	}
}
 