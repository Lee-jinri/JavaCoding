package ����;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		
		// 10�̸��� ���� �� ���� �Է¹޾Ƽ� ù��° ���ҿ� �ι�° ���Ҹ� �Է¹��� ���� �ʱ�ȭ
		// ����° ���Һ��� ������ ���ұ����� �����װ� ������ ���� ���� ���� �ڸ��̴�.
		
		Scanner sc=new Scanner(System.in);
		int num = 0;
		int array[] = new int[10];
		
		// �Է¹ް� �ʱ�ȭ
		for (int i = 0; i < 2 ; i++) {
			System.out.println("���� �Է� :");
			array[i] = sc.nextInt();
			array[i] = sc.nextInt();
			if (array[i] > 10 || array[i] < 1);
				continue;
		}
		
		for(int i = 0; i < array.length;i++) {
			array[2] = array[0]*array[1];
		}
		
		
		// ���
		for (int i=0 ; i <array.length;i++) {
			System.out.print(array[i]);
		}
		
		
		
		

		do { 
			System.out.println("���� �ΰ��� �Է� :");
			array[num] = sc.nextInt();
			if (array[num] < 1 || array[num] > 9) {
				continue;
			}
		} while (num < 2);
		
		for (int i = 2; i < array.length; i++) {
			array[i] = (array[i - 2] * array[i - 1]) %10;
		}
		
		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if ( i < array.length - 1) {
				System.out.print(" , ");
			}
		}System.out.print("]");
		
		
		
		
	}
}
