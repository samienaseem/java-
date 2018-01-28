abstract class petrol {
	petrol() {
		System.out.println("the rate of the petrol is 79");
	}
	abstract void petrolrise();
};
abstract class diesel extends petrol {
	diesel() {
		System.out.println("the rate of the diesel is 56");
	}
	abstract void dieselrise();
};
class rise extends diesel {
	void petrolrise() {
		System.out.println("the rise in petrol is 1 rs");
	}
	void dieselrise() {
		System.out.println("the rise in diesel is .50rs");
	}
		public static void main(String[] args) {
		rise r1=new rise();
		r1.petrolrise();
		r1.dieselrise();
	}
	
};