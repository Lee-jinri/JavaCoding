package java_project_day2;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		// [���� 1] ���� ���α׷� �ۼ�
		// ���� �� ���� �Է¹ް� �ϳ��� ���ڸ� �Է¹���
		// �������� ��� �и� 0���� �ƴ����� ���� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���� �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("�����ڸ� �Է��ϼ���.(+,-,*,/) : ");
		char oper = sc.next().charAt(0);
		
		if (oper == '/') {
			if (num2 == 0) {
				System.out.println("�ٽ� �Է��ϼ���.");
			}else if (num2 != 0) {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
		}if (oper == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}if (oper == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}if (oper == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
