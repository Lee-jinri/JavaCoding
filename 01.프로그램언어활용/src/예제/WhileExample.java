package ����;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		
		/* -1�� �Էµ� ������ ������ �Է¹޾� �� ������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���. */
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0; int sum = 0;
		
		System.out.println("������ �Է����ּ���. (����� -1)");
		int a = sc.nextInt();
		while (a != -1) {
			sum += a;
			count ++;
			a = sc.nextInt();
		}
		if (count == 0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.println("�հ� : " + sum);
			System.out.println("������ ������ " + count + "���̸�");
			System.out.printf("����� %.2f�Դϴ�.", (double)sum / count);
		}
		sc.close();
		
		
		
		
		
		
		
		
//		
//		do {
//			System.out.println("���� �Է��ϼ��� : ");
//			a = sc.nextInt();
//		}while(true);
//			if(a != -1) {
//			return;
//			else {
//			break;}
//			}
				
			
		
	
	}
}
