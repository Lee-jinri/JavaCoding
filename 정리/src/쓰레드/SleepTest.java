package ������;

public class SleepTest {
	public static void main(String[] args) {
		String messages[] = { "���1","���2","���3","���4"};
		
		for (int i = 0; i < messages.length; i++) {
			try {
				Thread.sleep(1000); // 1000�и��ʵ��� ������ �����Ѵ�.
				System.out.println(messages[i]);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
