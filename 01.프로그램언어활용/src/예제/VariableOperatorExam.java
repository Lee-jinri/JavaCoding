package ����;

import java.util.Scanner;

public class VariableOperatorExam {

	public static void main(String[] args) {
		
		// ���� 1��
		// ����, ����, ���� ������ �Է¹޾� ������ ���(�Ҽ� ù��° �ڸ�)�� ���� ����ϴ� ���α׷�
		
		double korean, eng, math;
		
		Scanner input = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ��� : ");
		korean = input.nextDouble();
		System.out.println("���������� �Է��ϼ��� : ");
		eng = input.nextDouble();
		System.out.println("���������� �Է��ϼ��� : ");
		math = input.nextDouble();
		
		
		double sum = korean + eng + math;
		System.out.printf("���� : %.0f" , sum );
		System.out.println();
		System.out.printf("��� : %.1f " , sum / 3);
		
		//���� 2��
		// x���� ������ y���� �л��鿡�� �Ȱ��� �������ַ��� �� ��,  �� �л����� ���� �� �ִ� 
		// ������ ���� ���� ������ ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ� 

		System.out.println("������ ������ �Է��ϼ��� : ");
		int x = input.nextInt();
		System.out.println("�л��� ���� �Է��ϼ��� : ");
		int y = input.nextInt();
		
		System.out.println("�� �л��� ���� �� �ִ� ������ �� : " + x / y);
		System.out.println("���� ������ �� : " + x % y);

		
		// ���� 3��
		// ����, �ܰ��� �Է¹޾� �ݾ��� ����� ��, 25%�� �����Ͽ�, ���� �ݾ�, ���ξ�, ���ұݾ��� 
		// ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		int amount, price, sale;
		System.out.println("������ �Է��ϼ��� : ");
		amount = input.nextInt();
		System.out.println("�ܰ��� �Է��ϼ��� : ");
		price = input.nextInt();
		
		sale  = amount * price / 100 * 25 ;
		int sum2 = amount * price ; 
		System.out.println("���� �ݾ� : " + sum2);
		System.out.println("���ξ� : "+ sale);
		System.out.println("���� �ݾ� : " + (sum2 - sale));

		
		// ���� 4��
		// 100���� 999������ ����(3�ڸ���)�� �Է� �޾� �� �ڸ��� ���� ���� �հ踦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		int num; 
		System.out.println("3�ڸ� ���� �Է��ϼ��� : ");
		num = input.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
