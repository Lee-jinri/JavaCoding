package ¾²·¹µå;

public class JoinExample {
	public static void main(String[] args) {
		SumThread joinThread1 = new SumThread(1, 5);
		SumThread joinThread2 = new SumThread(6, 10);
		
		joinThread1.start();
		joinThread2.start();
		
		try {
			joinThread1.join();
			joinThread2.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("Thread(1, 5) sum : " + joinThread1.getSum());
		System.out.println("Thread2(6, 10) sum : " + joinThread2.getSum());
		System.out.println("Total sum : " + (joinThread1.getSum() + joinThread2.getSum()));
	}

}
