package java_project_day3;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
//		�޴��� �ִ� �����ڸ� �����ϰ� �ǿ����� �� ���� �Է¹޾� ��Ģ���� ���α׷�
//		
//		[����]
//		�޴����� 1~5 �� �ƴϸ� �ٽ� �Է�
//		���ᰡ ���õ� ������ �ݺ�
//		�������� ����� �Ҽ� ù��° �ڸ����� ǥ��
//		
//		[���࿹]
//		�����ڸ� 1~4��, ����� 5�� ����
//		1. +
//		2. -
//		3. *
//		4. /
//		5. ����
//		���� >>
//		1
//		��Ģ���� �� �� ���� �Է��ϼ��� : 1 4
//		1 + 4 = 5
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int num1 = 0; int num2 = 0;
		
		while(true) {
			System.out.print("�����ڸ� �����ϼ���.(1~4, ����� 5) : \n 1. + \n 2. - \n 3. * \n 4. / \n 5.���� \n ���� >>");
			a = sc.nextInt();
			if (a == 5) {
				System.out.println("�����մϴ�.");
				break;
			}else
			System.out.println("��Ģ���� �� �� ���� �Է��ϼ��� : ");
			num1 = sc.nextInt(); num2 = sc.nextInt();
			
			if (a == 1) {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			}else if (a == 2) {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			}else if (a == 3) {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			}else if (a == 4) {
				System.out.printf("%d / %d = %.1f",num1,num2,(double)(num1 / num2));
			}
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
