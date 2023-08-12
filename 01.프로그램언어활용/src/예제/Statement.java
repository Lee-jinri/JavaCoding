package 예제;

import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {

		
//	반복문
//	1. 제어변수 : 반복문을 제어하려는 목적으로 선언하는 변수이며, 보통 초기값을 함께 지정한다
//	2. 반복 조건식 : 반복 횟수를 결정하는 조건식이다. 
//				   보통 제어 변수의 값을 비교함으로써 반복이 끝나는 조건을 완성한다.
//	3. 반복 실행문 : 반복해서 실행할 명령문이다.
//	4. 증감식 : 반복이 끝나는 조건에 도달하도록 제어 변수를 증감한다.

		// 실습 1
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " ");
			System.out.println("Hello World");
			System.out.println("I love coding");
		}
		
		// 실습 2
		int sum = 0; //sum의 값 초기화
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지 정수의 합 : %d\n", sum);
		System.out.println();
		
		// 실습 3
		int start, end;
		Scanner input = new Scanner(System.in);
		System.out.println("두 개의 수를 입력하세요 : ");
		start = input.nextInt();
		end = input.nextInt();
		
		for(int i = start; i <= end; i++) {
			System.out.println(i + " ");
		}


	}
}
