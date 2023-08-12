package java_project_day3;

import java.util.Scanner;

public class Example2 {
	public static void main (String[] args) {
		
		// 사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하세요.
		// 0 ~ 100 사이가 아닌 값을 입력하면 종료된다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
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
			System.out.println("입력된 수가 없습니다");
		}else {
			avg = (double)sum / count;
			System.out.printf("총점 : %d, 평균 : %.2f",sum,avg);
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
