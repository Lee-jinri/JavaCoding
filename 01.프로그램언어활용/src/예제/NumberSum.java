package ����;

import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
	/* ����ڷκ��� 5���� ������ �޾Ƽ� �հ� ��հ��� ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * [����]
	 * 1��° �� �Է� : 1
	 * 2��° �� �Է� : 2
	 * 3��° �� �Է� : 3
	 * 4��° �� �Է� : 4
	 * 5��° �� �Է� : 5
	 * �Է� ���� �� 
	 * �հ� : 15 ��� :3.0
	 */
	
	Scanner sc = new Scanner(System.in);

	int num = 0;
	int sum = 0;
	int avg = 0;
	
	System.out.println("������ �Է��ϼ��� (����)");
	
	for (int i = 1 ; i <= 5; i ++) {
		num = sc.nextInt();
		System.out.println(i +"��° �� �Է� : " + num);
		sum += num;
		avg = sum / i;
	}
	
	System.out.println("�Է¹��� ��");
	System.out.printf("�հ� : %d ��� : %.1f" ,sum, (double)avg);
	
	
	// [2��° ���]
	int su = 1; int num2 = 0;
	while(su <= 5) {
		System.out.println(num +"��° �� �Է� : ");
		num2 = sc.nextInt();
		
		sum = sum + num2;
		su++;
	}
	System.out.printf("�Է¹��� �� \n �հ� : %d ��� : %.1f", sum, ((double)sum /(su-1)));
	sc.close();
	
	
	
	
	
	
	}
}
