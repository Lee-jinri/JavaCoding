package firstExam;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		// ����, ����, ���� ������ �Է¹޾�, ������ ���(�Ҽ� ù��° �ڸ�)�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		sum = kor + eng + math;
		System.out.println("���� : " + sum);
		avg = (double)(sum / 3);
		System.out.printf("��� : %.1f" , avg);
		
		
		
		
		
		
		
		
		
		

	}

}
