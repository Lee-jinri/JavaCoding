package ����;

public class Arrray1 {
	public static void main(String[] args) {
		// ���忡 �ִ� �µ� �������� 1�ð����� ������ �µ� ���� ���� �������� ����
		// �������� ������ �ð��� ���Ͽ� ����ϴ� �ڵ�
		// 1, ������ �Ϸ� 8�ð� �����Ѵ�
		// 2, �µ��� �ǽð����� �Էµ�����, ���⼭�� �迭�� ����
		//	  ������ ���� ������ ����Ѵ�.
		// 3, �µ��� 30���� ������ �������� ������Ų��.
		
		int degree[] = {28, 30, 29, 32, 31, 28, 29, 30};
		int airConditioner = 0;
		
		for (int i =0; i < degree.length; i++) {
			if (degree[i] >= 30)
				airConditioner++;
		}
		System.out.printf("�������� �� %d�ð� ���� �����Ǿ���. \n,airConditioner");
		
	}
}
