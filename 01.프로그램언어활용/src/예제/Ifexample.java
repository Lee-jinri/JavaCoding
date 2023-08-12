package 예제;

import java.util.Scanner;

public class Ifexample {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// [예제1] 사용자에게 숫자 하나를 입력받아 짝수와 홀수를 출력하는 코드를 작성해주세요.
		
		int num ;
		
		System.out.println("숫자를 입력하세요 : ");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
		// [예제2] 사용자에게 점수를 입력받아 학점을 출력하는 프로그램을 작성해주세요.
		// 90이상 A / 80이상 B / 70이상 C / 60이상 D / 나머지 F
		// 점수 : 97점, 학점 : A
		int score;
		char grade = '\n';
		
		System.out.println("점수를 입력하세요 : ");
		score = input.nextInt();
		
		
		// [방법 1]
		
		if (score <0 || score > 100 ) {		// 점수가 0보다 작거나 100보다 크면 (잘못입력됨)
			System.out.println("점수를 잘못 입력하셨습니다.");
		}else {									// 그렇지않다면 점수 알려줌 
			if (score >= 90) 
			grade = 'A';
			else if (score >= 80)
			grade = 'B';
			else if (score >= 70)
			grade = 'C';
			else if (score >= 60)
			grade = 'D';			
			else
			grade = 'F';
		
		System.out.printf("점수 : %d 학점 : %c", score , grade);
		// %d 는 정수 , %c는 문자 첫 글자를 표현
	
		
		// [방법 2]
		
		if (score >=0 && score <= 100 ) {	// 점수가 0보다 크거나 100보다 작으면 (0~100)
			if (score >= 90) {				// 중첩 if문 사용
			grade = 'A';
			} else if (score >= 80) {
			grade = 'B';
			}else if (score >= 70) {
			grade = 'C';
			}else if (score >= 60) {
			grade = 'D';			
			}else {
			grade = 'F';
			}
		System.out.printf("점수 : %d 학점 : %c", score , grade);
		}	else {
			System.out.println();
			}
		}

		// [방법 3] While문을 사용한다.
		
		while(score < 0 || score > 100) {
			System.out.println("점수를 다시 입력해주세요");
			score = input.nextInt();
		}
		
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		// [방법 4] do ~ While문 사용
		
		// int score = 0;
		do {
			System.out.println("점수를 0 ~ 100 사이의 수로 입력하세요 :"); //선처리
			score = input.nextInt();
		} while(score < 0 || score > 100);
		
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		
		
		
		
	}
}
