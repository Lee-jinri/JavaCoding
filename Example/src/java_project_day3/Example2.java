package java_project_day3;

import java.util.Scanner;

public class Example2 {
	public static void main (String[] args) {
		
		// ����ڰ� �Է��� ������ ����, ����� ���� ���α׷��� �ۼ��ϼ���.
		// 0 ~ 100 ���̰� �ƴ� ���� �Է��ϸ� ����ȴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		while (score > -1 && score < 101 ) {
			sum += score;
			count ++;
			score = sc.nextInt();
		}
		
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�");
		}else {
			avg = (double)sum / count;
			System.out.printf("���� : %d, ��� : %.2f",sum,avg);
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
