package ����;

import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {

		
//	�ݺ���
//	1. ����� : �ݺ����� �����Ϸ��� �������� �����ϴ� �����̸�, ���� �ʱⰪ�� �Բ� �����Ѵ�
//	2. �ݺ� ���ǽ� : �ݺ� Ƚ���� �����ϴ� ���ǽ��̴�. 
//				   ���� ���� ������ ���� �������ν� �ݺ��� ������ ������ �ϼ��Ѵ�.
//	3. �ݺ� ���๮ : �ݺ��ؼ� ������ ��ɹ��̴�.
//	4. ������ : �ݺ��� ������ ���ǿ� �����ϵ��� ���� ������ �����Ѵ�.

		// �ǽ� 1
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " ");
			System.out.println("Hello World");
			System.out.println("I love coding");
		}
		
		// �ǽ� 2
		int sum = 0; //sum�� �� �ʱ�ȭ
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1���� 10���� ������ �� : %d\n", sum);
		System.out.println();
		
		// �ǽ� 3
		int start, end;
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���� ���� �Է��ϼ��� : ");
		start = input.nextInt();
		end = input.nextInt();
		
		for(int i = start; i <= end; i++) {
			System.out.println(i + " ");
		}


	}
}
