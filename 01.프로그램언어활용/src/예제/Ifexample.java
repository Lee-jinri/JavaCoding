package ����;

import java.util.Scanner;

public class Ifexample {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// [����1] ����ڿ��� ���� �ϳ��� �Է¹޾� ¦���� Ȧ���� ����ϴ� �ڵ带 �ۼ����ּ���.
		
		int num ;
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
		// [����2] ����ڿ��� ������ �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ����ּ���.
		// 90�̻� A / 80�̻� B / 70�̻� C / 60�̻� D / ������ F
		// ���� : 97��, ���� : A
		int score;
		char grade = '\n';
		
		System.out.println("������ �Է��ϼ��� : ");
		score = input.nextInt();
		
		
		// [��� 1]
		
		if (score <0 || score > 100 ) {		// ������ 0���� �۰ų� 100���� ũ�� (�߸��Էµ�)
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}else {									// �׷����ʴٸ� ���� �˷��� 
			if (score >= 90) 
			grade = 'A';
			else if (score >= 80)
			grade = 'B';
			else if (score >= 70)
			grade = 'C';
			else if (score >= 60)
			grade = 'D';			
			else
			grade = 'F';
		
		System.out.printf("���� : %d ���� : %c", score , grade);
		// %d �� ���� , %c�� ���� ù ���ڸ� ǥ��
	
		
		// [��� 2]
		
		if (score >=0 && score <= 100 ) {	// ������ 0���� ũ�ų� 100���� ������ (0~100)
			if (score >= 90) {				// ��ø if�� ���
			grade = 'A';
			} else if (score >= 80) {
			grade = 'B';
			}else if (score >= 70) {
			grade = 'C';
			}else if (score >= 60) {
			grade = 'D';			
			}else {
			grade = 'F';
			}
		System.out.printf("���� : %d ���� : %c", score , grade);
		}	else {
			System.out.println();
			}
		}

		// [��� 3] While���� ����Ѵ�.
		
		while(score < 0 || score > 100) {
			System.out.println("������ �ٽ� �Է����ּ���");
			score = input.nextInt();
		}
		
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		// [��� 4] do ~ While�� ���
		
		// int score = 0;
		do {
			System.out.println("������ 0 ~ 100 ������ ���� �Է��ϼ��� :"); //��ó��
			score = input.nextInt();
		} while(score < 0 || score > 100);
		
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		
		
		
		
	}
}
