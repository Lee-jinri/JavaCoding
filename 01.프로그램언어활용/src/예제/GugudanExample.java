package ����;

import java.util.Scanner;

public class GugudanExample {
	public static void main(String[] args) {
		
		// ����ڿ��� ���� �Է¹޾� �� ���� ������ ����ϱ�
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� : ");
		int dan = input.nextInt();
		
		if (dan < 2 || dan > 9) {
			System.out.println("���� 2 ~ 9������ �Է����ּ���");
		} else { 
			for (int i = 1; i <= 9 ; i ++) {
				System.out.println(dan + " X " + i + " = " +(dan * i));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
