package ����;

public class Array3 {
	public static void main(String[] args) {
	// ������ �迭�� ���Ե� ������ �ش��ϴ� ���� �׷����� ������ ���� ����Ͻÿ�.
	// [���� ���]
	// 90�� : �� �� �� �� �� �� �� �� �� 
	// 20�� : �� ��
	// 50�� : �� �� �� �� �� 
	// 70�� : �� �� �� �� �� �� ��
	// 65�� : �� �� �� �� �� ��
	// 90�� : �� �� �� �� �� �� �� �� ��
	// 100��: �� �� �� �� �� �� �� �� �� ��
	// 43�� : �� �� �� ��
	// 55�� : �� �� �� �� ��
	// 87�� : �� �� �� �� �� �� �� ��

//		int array[] = {90, 20, 50, 70 ,65, 90, 100, 43, 55, 87};
//		String a = "��";
//		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = array[i] / 10;
//			System.out.println(array[i]); ???
//		}
		
		
		int jumsu[] = {90, 20, 50, 70 ,65, 90, 100, 43, 55, 87};
		int count[] = new int[10];
		
		for(int i = 0; i < count.length; i++) {
			count[i] = jumsu[i] / 10; // 10�� �ڸ� ����			
		}

		for (int i = 0; i < jumsu.length; i++) {
			System.out.printf("%4d�� : ",jumsu[i]);
			for (int j = 0; j < count[i]; j++) {
				System.out.print("�� ");
			}
			System.out.printf("\n");
		}












	}

}
