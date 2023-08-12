package firstExam;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		// 국어, 영어, 수학 점수를 입력받아, 총점과 평균(소수 첫번째 자리)을 구해 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		avg = (double)(sum / 3);
		System.out.printf("평균 : %.1f" , avg);
		
		
		
		
		
		
		
		
		
		

	}

}
