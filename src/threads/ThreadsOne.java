package threads;
class Book implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("update database");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
class Num extends Thread{
	 public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			//try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

public class ThreadsOne {
	public static void main(String args[]) throws InterruptedException {
		
		Book b=new Book();
		Num n=new Num();
		Thread t=new Thread(b);
		//b.update();
		t.start();
		n.start();
		t.join();
		n.join();
		System.out.println("hi");		
	}

}
