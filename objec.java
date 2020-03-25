interface dada {

	void show();
}

interface papaji {

	void display();


}

class beta implements dada,papaji{

	 public void show() {

		System.out.println("show  method call");
	}

	 public void display() {

		System.out.println("display method called");
	}
}

class objec{

	public static void main(String[] args) {
		beta b=new beta();
		b.show();
		b.display();
	}
}