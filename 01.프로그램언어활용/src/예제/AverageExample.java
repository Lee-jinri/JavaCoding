package ����;

import java.util.Scanner;

public class AverageExample {
	public static void main(String[] args) {
		
		/* 10���� ���ڸ� �Է¹޾� 0���� ū ���ڿ� ���� ��հ� ������ ����ϴ� �ڵ带 �ϼ��ϼ���. �ٽ��ϱ�;;*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : (����)");
		
		int count = 0, total = 0, num , i ;
		double avg;
		
		// ���� 10���� �ݺ��ؼ� �־��ִ� �ڵ� for
		for (i = 0; i < 10 ; i++) {
			System.out.println("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			// ���� ���� ���� 0���� ũ�ٸ� total�� + num�� �ض�
			if (num > 0 ) {
				total += num;
				count++;  // count�� ����� ���ϱ����� ������ �ʿ��ؼ� �����
			}
			if (i == 9) {
				sc.close();
			}
		}
		
		if (count != 0) {
			avg = (double) total / count;
			System.out.printf("��� : %.2f ���� : %d\n", avg ,count);
		} else {
			System.out.println("����� ���� �� �����ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
