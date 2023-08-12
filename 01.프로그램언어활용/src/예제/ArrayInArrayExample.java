package ����;

public class ArrayInArrayExample {
	public static void main(String[] args) {
	// 2���� �迭
	// �ڷ���[][] �迭�� = new �ڷ���[���� �ε���][���� �ε���];
	
		int[][] arr1 = new int[2][3];
		
		System.out.println("arr1.length = "  + arr1.length); // ���� ����
		System.out.println("arr1[0].length = " + arr1[0].length); // ���� ����
		System.out.println("arr1[1].length = " + arr1[1].length);
		
		
		for(int i = 0; i < arr1.length; i++) {
			for (int k =0; k < arr1[i].length; k++) {
				System.out.println("arr1[" + i + "][" + arr1[i][k]);
			}
			System.out.println();
		}
		
		
		int arr2[][] = new int[][] { {10, 20, 30},{40, 50, 60} };
		
		/*  0�� 	1��	2��
		0�� 10	20 	30
		1�� 40 	50	60 */
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%-5d", arr2[i][j]);
			}
			System.err.println();
		}
		System.out.println();
		
		// 2���� �迭 (���� �迭)
		
		int[][] arr3 = new int[2][];
		arr3[0] = new int[] {1,5};
		arr3[1] = new int[3];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++)
				System.out.println("arr3[" + i + "][" + j + "] = " + arr3[i][j]);
		}
		System.out.println();
		
		// 5X5 2���� �迭�� 1~25�� �ʱ�ȭ�Ͽ� ȭ�鿡 ���.
		
		int[][] array = new int [5][5];
		//�迭 �ʱ�ȭ
		for (int i = 0, num = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
			}
		}
		
		
		// 2���� �迭 ���
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k ++) {
				System.out.printf("%-5d", array[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		int sum = 0;
		for (int i =0; i < array.length; i ++) {
			for (int j =0; j < array[i].length; j++) {
				if (i == j) {
					sum += array[i][j];
				}
			}
		}
		
		/* (0,0)
		 * (1,0) (1,1)
		 * (2,0) (2,1) (2,2) 
		 * (3.0) (3.1) (3.2) (3.3)
		 * (4,0) (4,1) (4,2) (4,3) (4,4) 
		 */
		System.out.println("�հ� : " + sum);
		System.out.println();
		
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {
				 total += array[i][j];
			}
		}
		System.out.println("�հ� : " + total);
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
