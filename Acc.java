public class Acc implements Runnable
{
	Account acc=new Account();
	public static void main(String[] args) {
		Acc r=new Acc();
		Thread one=new thread(r,lucky);
		Thread two=new Thread(r,fred);
		one.start();
		two.start();
		
		public void run() {
			for(int x=0;x<5;x++) {
				makeWithdrawl(10);
				if(acc.getBalance()<0) {
					System.out.println("Account is withdrawn");
				}
			}
		}
		public void makeWithdrawl(int amt) {
			if(acc.getBlance()>=amt) {
				System.out.println(Thread.currentThread().getName()+"is going to withdrwal");
				
				try {
					Thread.sleep(100);
				}
				
				catch(IntrruptedException) {
					
					System.out.println("Interrupted Exception");
				}
				acc.withdrawl(amt);
				
				System.out.println(Thread.currentThread.getName()+"completes its withdrawl");
			}
			else {
				System.out.println("not enough in account for"+Thread.currentThread().getName()+"for withdrawl"+acc.getBalance());
			}
			}
		}
	}