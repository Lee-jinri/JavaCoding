package ����;

public class CountinueTest {
	public static void main(String[] args) {
		
		/* 1 ~ 10������ �� �߿��� Ȧ���� ����ϵ��� continue�� ����غ��� */
		
		int i = 0;
		do {
			i++;
			if (i % 2 == 0)
				continue; // ¦���� �Ʒ� ��¹� �����ϰ� �ݺ�
			System.out.printf("%5d", i); // %5d = d�� ����, ������ ���� �� ��ġ�� 5�ڸ��� Ȯ���ϰ� �ִ´� (�ڵ� ����) 
		} while ( i < 10 );
		
		System.out.println();
		
		
		
		/* 1 ~ 10������ �� �߿��� ¦���� ����ϵ��� continue�� ����غ��� */
	
		for (int a = 1; a <= 10 ;a++) {
			if (a % 2 != 0) {
				continue; // Ȧ���� ��¹� ����
			}
			System.out.printf("%5d", a);
		}
		
		
		
	
	}
}
