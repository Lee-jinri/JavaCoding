package ����;

import java.util.Scanner;

public class ScoreExample {
	public static void main(String[] args) {
		
		// �л� ���� �Է¹ް�, �л�����ŭ ������ �Է¹޾� ���� ���ϵ��� �ϴ� ���α׷�
				
		int total = 0;
		int count;
		
		Scanner sc = new Scanner(System.in);	// ��ĳ�� �ҷ�����
 		do { 									// ������ �ѹ� �̻� ����
			System.out.print("�л����� �Է��ϼ��� : ");
			count = sc.nextInt();
		} while (count < 0);
		
		int[] scores = new int[count];  //�迭����: scores��� �迭���� 
		// count�� ������ŭ(�л���)��ŭ�� ��Ұ� �ִ�
		
		for (int i =0; i < count; i++) { 
			// �л�����ŭ scores�� �ε����� 0������ ���ʷ� ������ �Է�
			System.out.print("������ �Է��ϼ��� : ");
			scores[i] =sc.nextInt();
		}
		
		// scores[0] ���� scores[count�� ����(�л���)]����
		// total�� ���Ѵ�
		for(int i = 0; i < count; i++) {
			total += scores[i];
		 // total = total + scores
		}
		// ���� count�� 0�� �ƴ϶�� �հ踦 ���
		// count�� 0�̶�� �հ踦 ���� �л��� �����ϴ�

		if(count != 0) {
			System.out.printf("�հ� : %d", total);
		}else {
			System.out.println("�հ踦 ���� �л��� �����ϴ�.");
		}
	}
}
