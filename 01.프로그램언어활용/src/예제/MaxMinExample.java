package ����;

import java.util.Scanner;

public class MaxMinExample {
	public static void main(String[] args) {
		
		/* 10���� �����͸� �Է¹޾� �ּҰ�, �ִ밪�� ���Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ��� */
		Scanner sc = new Scanner(System.in);
		int num, max = -99999, min = 99999; 
		// min�� 0�ε� �ּҰ��� 1�̶�� ����� 0�� �Ǳ⶧���� �ּҰ��� ���� ū ������ �����ؾ���
		
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			if (num > max) {
				max = num;
			}else if (num < min) {  // max�� ���� ���� ���� min���� �� ���ְ� else���°� 
				min = num;			// �׳� if�� ���� max�� �̹� �� ���̶� min���� Ȯ���� �ʿ䰡 ���µ�
			}						// min���� Ȯ���� �ϰ� �� (���ʿ�) �׷��� else~if
			
			if (i == 9 ) {
				sc.close();
			}
		}
		System.out.printf("�ִ� : %d\t �ּڰ� : %d\n", max, min);
		// \t �� ���� \n�� ����
		
	}
}
