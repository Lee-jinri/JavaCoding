package ����;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// Scanner ���
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		int x = input.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
		int y = input.nextInt();
		
		int sum = x + y;
		
		System.out.println("�� ���� �� : " + x + " + " + y + " = " + sum);
		input.nextLine();   // name2�� line�� ���͸� �о������ �ѹ� �� ����ߵ�.
		
//		������ �̸�, ����, �ּҸ� �Է¹޾� �Ʒ��� ���� ����� �� �ֵ��� �ۼ����ּ���.
	//	
//		[��¹� ����]
//		ȫ�浿�� �ȳ��ϼ���! 50���̽ó׿�.
//		�ּҴ� ����Ư���� ������ ������� 14�� 6 �������� 4F
		
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name2 = input.nextLine();
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age2 = input.nextInt();
		input.nextLine();   // adress�� line�� ���͸� �о������ �ѹ� �� ����ߵ�.
		
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		String adress = input.nextLine();
		
		System.out.println(name2 + "�� �ȳ��ϼ���! "+ age2 + "���̽ó׿�." + "�ּҴ� " + adress );

	}

}
