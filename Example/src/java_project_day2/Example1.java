package java_project_day2;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		
		// [예제 1] 계산기 프로그램 작성
		// 숫자 두 개를 입력받고 하나의 문자를 입력받음
		// 나눗셈의 경우 분모가 0인지 아닌지를 먼저 
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 두 개를 입력하세요 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("연산자를 입력하세요(+,-,*,/) : ");
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
				System.out.println("0으로 나눌 수 없습니다.");
				input.close();
				return;
		}
	}else { 
		System.out.println("사칙연산이 아닙니다.");
		input.close();
		return;
	}
		System.out.printf("%d %c %d = %d\n", num1 , ch , num2 , result);
		
		
		input.close();
		
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
		// 	A,B학점 -> "excellent"  C,D학점 - >"good" F학점 - > "poor"
		//	출력화면
		// ------결과입니다-----
		// 중간고사 : 90
		// 기말고사 : 89
		// 레포트 : 99
		// 출석점수 : 100
		// 성적 : 93.50
		// 학점 : A
		// 평가 : excellent
		
		int mid , finalExam, report, attend;
		double total; char grade;
		String credit = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력하세요. (중간고사, 기말고사, 레포트, 출석점수) : ") ;
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
		
		System.out.println("=======결과입니다========");
		System.out.println("중간고사 : " + mid);
		System.out.println("기말고사 : " + finalExam);
		System.out.println("레포트 : " + report);
		System.out.println("출석점수 : " + attend);
		System.out.printf("성적 : %.2f\n" , total);
		System.out.println("학점 : " + grade);
		System.out.println("평가 : "+ credit );
		
		sc.close();
	
	}
}
