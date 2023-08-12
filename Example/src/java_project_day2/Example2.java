package java_project_day2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		// [예제 2]
				// 다음과 같은 방식으로 성적 처리 프로그램을 작성하세요.
				// [ 조건 ] 
				// 1 중간고사, 기말고사, 레포트, 출석점수를 입력받아서 계산한다.
				// 2 성적을 아래에 준한 점수를 합산하되 소수 이하 2자리 까지 출력하라.
				//   (1) (중간 + 기말)/2 -> 60%
				//   (2) 레포트 -> 20%
				//   (3) 출석 -> 20%
				//  학점의 기준(if ~ else if ~ else문 이용)
				//	90이상 'A'학점/ 80이상 'B'학점 / 70이상 'C'학점 / 60이상 'D'학점 / 나머지 'F'학점
				//  (4) 평가기준 (switch문 이용)
				// 	A,B학점 -> "excellent"  C,D학점 -> "good" F학점 -> "poor"
				//	출력화면
				// ------결과입니다-----
				// 중간고사 : 90
				// 기말고사 : 89
				// 레포트 : 99
				// 출석점수 : 100
				// 성적 : 93.50
				// 학점 : A
				// 평가 : excellent
		
		
		Scanner sc = new Scanner(System.in);
		char grade ;
		String credit = "";
		
		System.out.println("중간고사 , 기말고사 , 레포트 , 출석점수를 입력하세요.(공백) : ");
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
		
		
		System.out.println("==========결과입니다==========");
		System.out.printf("중간고사 : %.2f," , midterm);
		System.out.printf(" 기말고사 : %.2f," , finalterm);
		System.out.printf(" 레포트 : %.2f," , report);
		System.out.printf(" 출석점수 : %.2f," , attendance);
		System.out.printf(" 성적 : %.2f," , record);
		System.out.println(" 학점 : " + grade);
		System.out.println("평가 : " + credit);
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}
