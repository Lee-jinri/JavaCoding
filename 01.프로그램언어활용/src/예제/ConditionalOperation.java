package ����;

import java.util.Scanner;

public class ConditionalOperation {
	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		
		System.out.println("�� ��(100�� 200) �߿��� �ִ밪 : " + ((x > y) ? x : y));
		
		// ������ ���� ���� ������ �����ϰ� �� ���� ¦������ Ȧ�������� ����� �� �ֵ��� �ۼ����ּ���.
		
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		num = input.nextInt();
		
		System.out.println( (num % 2 == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.");
		
		
		// �� ���� ���� ����ϼ���. �� ū ������ ���� ���� ����.
		
		int num1 , num2;
		
		System.out.println("���� �� ���� �Է��ϼ���.(����)");
		num1 = input.nextInt();
		num2 = input.nextInt();
		int result = ((num1 > num2 ) ? num1 - num2 : num2 - num1);
		
		System.out.println("�� ���� �� : " + result);
	}
}
