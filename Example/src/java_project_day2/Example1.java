package java_project_day2;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		
		// [���� 1] ���� ���α׷� �ۼ�
		// ���� �� ���� �Է¹ް� �ϳ��� ���ڸ� �Է¹���
		// �������� ��� �и� 0���� �ƴ����� ���� 
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �� ���� �Է��ϼ��� : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���(+,-,*,/) : ");
		char ch= input.next().charAt(0);
		
		
		int result = 0;
		
		
		if(ch == '+') {
			result = num1 + num2;
		}else if(ch == '-') {
			result = num1 - num2;
		}else if(ch == '*') {
			result = num1 * num2;
		}else if(ch == '/') { 
			if(num2 != 0) {
				result = num1 / num2;
			}else {
				System.out.println("0���� ���� �� �����ϴ�.");
				input.close();
				return;
		}
	}else { 
		System.out.println("��Ģ������ �ƴմϴ�.");
		input.close();
		return;
	}
		System.out.printf("%d %c %d = %d\n", num1 , ch , num2 , result);
		
		
		input.close();
		
		// [���� 2]
		// ������ ���� ������� ���� ó�� ���α׷��� �ۼ��ϼ���.
		// [ ���� ] 
		// 1 �߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ѵ�.
		// 2 ������ �Ʒ��� ���� ������ �ջ��ϵ� �Ҽ� ���� 2�ڸ� ���� ����϶�.
		//   (1) (�߰� + �⸻)/2 -> 60%
		//   (2) ����Ʈ -> 20%
		//   (3) �⼮ -> 20%
		//  ������ ����(if ~ else if ~ else�� �̿�)
		//	90�̻� 'A'����/ 80�̻� 'B'���� / 70�̻� 'C'���� / 60�̻� 'D'���� / ������ 'F'����
		//  (4) �򰡱��� (switch�� �̿�)
		// 	A,B���� -> "excellent"  C,D���� - >"good" F���� - > "poor"
		//	���ȭ��
		// ------����Դϴ�-----
		// �߰���� : 90
		// �⸻��� : 89
		// ����Ʈ : 99
		// �⼮���� : 100
		// ���� : 93.50
		// ���� : A
		// �� : excellent
		
		int mid , finalExam, report, attend;
		double total; char grade;
		String credit = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���. (�߰����, �⸻���, ����Ʈ, �⼮����) : ") ;
		mid = sc.nextInt();
		finalExam = sc.nextInt();
		report = sc.nextInt();
		attend = sc.nextInt();
		
		
		total = (mid + finalExam)/2 * 0.6 + report * 0.2 + attend * 0.2; 
		
		if (total >= 90) {
			grade = 'A';
		}else if (total >= 80) {
			grade = 'B';
		}else if (total >= 70) {
			grade = 'C';
		}else if (total >= 60) {
			grade = 'D';
		}else 
			grade = 'F';
	
		
		switch (grade) {
		case 'A','B':
			credit = "excellent";
			break;
		case 'C','D':
			credit = "good";
			break;
		case 'F':
			credit = "poor";
		}
		
		System.out.println("=======����Դϴ�========");
		System.out.println("�߰���� : " + mid);
		System.out.println("�⸻��� : " + finalExam);
		System.out.println("����Ʈ : " + report);
		System.out.println("�⼮���� : " + attend);
		System.out.printf("���� : %.2f\n" , total);
		System.out.println("���� : " + grade);
		System.out.println("�� : "+ credit );
		
		sc.close();
	
	}
}
