package ����;

import java.util.Scanner;

public class BreakExample {
	public static void main (String[] args) {
		/* ����ڰ� �Է��� ������ ����, ����� ���� ���α׷��� �ۼ��ϼ���.
		 * 0 ~ 100 ������ ���� �Է����� ������ ����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum= 0, avg = 0;
		int score=0, count = 1 ;
		
		while(true) {
			System.out.println("������ �Է��ϼ���(0 ~ 100) : ");
			score = sc.nextInt();
			
			if (score < 0 || score < 100)
				break;
			
			else 	
				sum += score;
				count ++;
				avg = sum / count;
				
		}
		
		System.out.printf("���� : %d ��� %d", sum, avg);
		


		
		
		
		
		
		
		
		
	}
}
