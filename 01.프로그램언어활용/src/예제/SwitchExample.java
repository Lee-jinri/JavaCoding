package ����;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		
		// Ŀ�� ���� ���
		// �Ƹ޸�ī��� 3500�� �Դϴ�.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� Ŀ�� ?");
		String order = input.nextLine();
		
		int price = 0; 
		
		switch (order) {
		case "ī���":
		case "�ٴҶ��":
			price = 4500;
			break;
		case "�Ƹ޸�ī��":
		case "����������":
			price = 2000;
			break;
		default:
			System.out.println("���� �޴��Դϴ�.");
		}
		
		if (price != 0) {
		System.out.println(order + "�� " + price + "���Դϴ�.");
		}

		
		int score = 0;
		char grade = '\0';	// char �����Ͱ� �ƹ��͵� �����ϰ����� �ʽ��ϴ�. NULL���� �ִ� ��.	
		
		System.out.println("������ �Է��ϼ��� : ");
		score = input.nextInt();
		
		if (score >= 100 || score <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			switch (score / 10) {
			case 10: case 9: 
				grade = 'A';
				break;
			case 8: 
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			System.out.printf("���� : %d , ��� : %c", score , grade);
			}
		}
		System.out.printf("���� : %d , ��� : %c", score , grade);
		
		
		
		
		
		
		
	}
}
