package ����;

public class arrayinarray {

	public static void main(String[] args) {
		/* ������ �迭�� ����, ����, �밢���� ���� ���ϼ���.
		 * ������
		 * ============ ���� �� ==========
		 * 10  10  10  10  0
		 * 30  30  30  30  0
		 * 40  40  40  40  0
		 * 50  50  50  50  0
		 * 0    0   0  0   0
		 * 
		 * ============ ��� ��=============
		 * 10  10  10  10  40
		 * 30  30  30  30  120
		 * 40  40  40  40  160
		 * 50  50  50  50  200
		 * 130 130 130 130 130
		 */
		
		// �� 4�� + ��
		int arr[][] = {
				{10, 10, 10, 10, 0},
				{30, 30, 30, 30, 0},
				{40, 40, 40, 40, 0},
				{50, 50, 50, 50, 0},
				{0, 0, 0, 0, 0}};  

		
		System.out.println("==============���� ��==============");
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-5d",arr[i][j]);
			}System.out.println();
		}
		
		
		int num = 0;
		
		// ���ϱ�
							// -1�� ������ ��,�� ������� �ʰڴ�
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][i];
				if (i == j)
					arr[4][4] += arr[i][j];
			}System.out.println();
		}
		
		
		System.out.println("================���� ��==============");
		// ���
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-5d",arr[i][j]);
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
