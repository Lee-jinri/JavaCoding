package ����;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		
		// 3���� ������ �Է¹޾Ƽ� �ִ밪 ����ϵ��� ���α׷� �ۼ����ּ���.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("3���� ���� �Է��ϼ��� (����)");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int max;
		
		
		// ��� 1
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		System.out.println("�ִ밪�� " + max);
		
		
		// ��� 2
		
		max = num1;
		
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		System.out.println("�ִ밪�� " + max);
		
		
	}
}
