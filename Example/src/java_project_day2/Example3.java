package java_project_day2;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
//		369게임을 간단히 작성해보자.
//		1 ~ 99까지의 정수를 키보드로부터 입력받고 그 수가 범위에 속하지 않으면 "값의 범위를 초과하였습니다"라고 출력하고 종료한다.
//		정수에 3,6,9중 하나가 있는 경우는 "박수짝"을 출력하고
//		두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성한다.
//		예를 들면 정수가 13인 경우 "박수짝"을
//		36인 경우 "박수짝짝"을 출력한다.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 99까지 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if ((num / 10) % 3 == 0 && (num % 10 ) % 3 == 0) {
			System.out.println("박수짝짝");
		}else if ((num / 10) % 3 == 0 || (num % 10 ) % 3 == 0) {
			System.out.println("박수짝");
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
