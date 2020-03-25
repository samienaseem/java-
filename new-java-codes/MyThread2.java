class MyThread2 implements Runnable {

	public void run() {

		for(int i=0; i<=5; i++) {

			System.out.println("Run"+" "+i);
		}
	}
}

class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread2 t=new MyThread2();
		Thread t2 =new Thread(t);
		t2.start();

		for(int i=0;i<=5;i++){

			System.out.println("Main"+" "+i);
		}
	}
}