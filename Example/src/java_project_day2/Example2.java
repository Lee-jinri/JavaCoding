package java_project_day2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
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
				// 	A,B���� -> "excellent"  C,D���� -> "good" F���� -> "poor"
				//	���ȭ��
				// ------����Դϴ�-----
				// �߰���� : 90
				// �⸻��� : 89
				// ����Ʈ : 99
				// �⼮���� : 100
				// ���� : 93.50
				// ���� : A
				// �� : excellent
		
		
		Scanner sc = new Scanner(System.in);
		char grade ;
		String credit = "";
		
		System.out.println("�߰���� , �⸻��� , ����Ʈ , �⼮������ �Է��ϼ���.(����) : ");
		double midterm = sc.nextInt();
		double finalterm = sc.nextInt();
		double report = sc.nextInt();
		double attendance = sc.nextInt();
		
		double record = (((midterm + finalterm)/2) * 0.6) + (report * 0.2) + (attendance * 0.2);
		
		
		if (record >= 90) {
			grade = 'A';
		}else if (record >= 80) {
			grade = 'B';
		}else if (record >= 70) {
			grade = 'C';
		}else if (record >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		switch (grade) {
		case 'A','B':
			credit = "excellent";
			break;
		case 'C','D':
			credit = "good";
			break;
		case 'F':
			credit = "Poor";
			
		}
		
		
		System.out.println("==========����Դϴ�==========");
		System.out.printf("�߰���� : %.2f," , midterm);
		System.out.printf(" �⸻��� : %.2f," , finalterm);
		System.out.printf(" ����Ʈ : %.2f," , report);
		System.out.printf(" �⼮���� : %.2f," , attendance);
		System.out.printf(" ���� : %.2f," , record);
		System.out.println(" ���� : " + grade);
		System.out.println("�� : " + credit);
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}
