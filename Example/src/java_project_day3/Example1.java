package java_project_day3;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		// -1�� �Էµ� ������ ������ �Է¹޾� �� ���� �հ踦 ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.(-1�� ����) : ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		
		
		while (num != -1) {
			sum += num;
			count ++;
			num = sc.nextInt();	
		}
		
		if (sum == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}else 
			System.out.println("�հ� : " + sum);
			System.out.print("�Էµ� ���� ������ " + count + "���̸�");
			System.out.printf("����� %.2f�Դϴ�.", (double)sum / count);
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
