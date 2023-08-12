package 예제;

import java.util.Scanner;

public class BreakExample {
	public static void main (String[] args) {
		/* 사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하세요.
		 * 0 ~ 100 사이의 값을 입력하지 않으면 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum= 0, avg = 0;
		int score=0, count = 1 ;
		
		while(true) {
			System.out.println("점수를 입력하세요(0 ~ 100) : ");
			score = sc.nextInt();
			
			if (score < 0 || score < 100)
				break;
			
			else 	
				sum += score;
				count ++;
				avg = sum / count;
				
		}
		
		System.out.printf("총점 : %d 평균 %d", sum, avg);
		


		
		
		
		
		
		
		
		
	}
}
