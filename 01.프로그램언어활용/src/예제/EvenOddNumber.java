package ����;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		
		/*
		 * �� ���� �Է¹޾�, �� �� ���̿� Ȧ���� �հ� ¦���� ���� ����ϴ� ���α׷�
		 * ���� ũ�⿡ ������� ���� �����ؾ� �Ѵ�.
		 */
		
		int i , start, end, temp, oddsum = 0 ,evensum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է����ּ���");
		start = sc.nextInt();
		end = sc.nextInt();
		sc.close();
		
		if ( start > end) {
			temp = start;
			start = end;   // ������ ��ȯ , start�� ���� �� end�� ū ���� �� �� �ְ�
			end = temp;
		}
		
		// [��� 1]
		for ( i = start ; i <= end; i++) {
			if (i % 2 == 0)
				evensum = evensum + i; // evensum += i �� ���� ǥ��
			else 
				oddsum = oddsum + i;   // oddsum += i �� ���� ǥ��
		}
		System.out.printf("¦���� �� : %d\t Ȧ���� �� : %d" , evensum, oddsum);

		
		
		
		
		
		
		
		
	}
}
