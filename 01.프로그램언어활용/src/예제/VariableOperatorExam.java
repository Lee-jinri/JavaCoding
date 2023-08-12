package 예제;

import java.util.Scanner;

public class VariableOperatorExam {

	public static void main(String[] args) {
		
		// 예제 1번
		// 국어, 영어, 수학 점수를 입력받아 총점과 평균(소수 첫번째 자리)을 구해 출력하는 프로그램
		
		double korean, eng, math;
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 : ");
		korean = input.nextDouble();
		System.out.println("영어점수를 입력하세요 : ");
		eng = input.nextDouble();
		System.out.println("수학점수를 입력하세요 : ");
		math = input.nextDouble();
		
		
		double sum = korean + eng + math;
		System.out.printf("총점 : %.0f" , sum );
		System.out.println();
		System.out.printf("평균 : %.1f " , sum / 3);
		
		//예제 2번
		// x개의 사탕을 y명의 학생들에게 똑같이 나누어주려고 할 때,  각 학생들이 받을 수 있는 
		// 사탕의 수와 남는 사탕의 수를 계산해 출력하는 프로그램을 작성하시오 

		System.out.println("사탕의 개수를 입력하세요 : ");
		int x = input.nextInt();
		System.out.println("학생의 수를 입력하세요 : ");
		int y = input.nextInt();
		
		System.out.println("각 학생이 받을 수 있는 사탕의 수 : " + x / y);
		System.out.println("남는 사탕의 수 : " + x % y);

		
		// 예제 3번
		// 수량, 단가를 입력받아 금액을 계산한 후, 25%를 할인하여, 원래 금액, 할인액, 지불금액을 
		// 출력하는 프로그램을 작성하시오
		
		int amount, price, sale;
		System.out.println("수량을 입력하세요 : ");
		amount = input.nextInt();
		System.out.println("단가를 입력하세요 : ");
		price = input.nextInt();
		
		sale  = amount * price / 100 * 25 ;
		int sum2 = amount * price ; 
		System.out.println("원래 금액 : " + sum2);
		System.out.println("할인액 : "+ sale);
		System.out.println("지불 금액 : " + (sum2 - sale));

		
		// 예제 4번
		// 100부터 999까지의 숫자(3자리수)를 입력 받아 각 자리의 수를 합한 합계를 출력하는 프로그램을 작성하시오
		
		int num; 
		System.out.println("3자리 수를 입력하세요 : ");
		num = input.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
