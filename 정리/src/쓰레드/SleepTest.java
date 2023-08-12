package 쓰레드;

public class SleepTest {
	public static void main(String[] args) {
		String messages[] = { "명언1","명언2","명언3","명언4"};
		
		for (int i = 0; i < messages.length; i++) {
			try {
				Thread.sleep(1000); // 1000밀리초동안 실행을 중지한다.
				System.out.println(messages[i]);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
