package ����;

public class BadIndex {

	public static void main(String[] args) {
		
		// ����κ��� �ٱ���~~
		int[] array = new int[10];
		try {
			for (int i = 0; i < 10; i++) {
				array[i] = i+1;
			}
		
			int result = array[10];
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� �߸��Ǿ����ϴ�.");
		}
			System.out.println("���� �� ������ ����ɱ��?");
	
	}
}
