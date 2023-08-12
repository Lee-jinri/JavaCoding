package java_project_day3;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
//		메뉴에 있는 연산자를 선택하고 피연산자 두 개를 입력받아 사칙연산 프로그램
//		
//		[조건]
//		메뉴에서 1~5 가 아니면 다시 입력
//		종료가 선택될 때까지 반복
//		나눗셈의 결과는 소수 첫번째 자리까지 표현
//		
//		[실행예]
//		연산자를 1~4로, 종료는 5를 선택
//		1. +
//		2. -
//		3. *
//		4. /
//		5. 종료
//		선택 >>
//		1
//		사칙연산 할 두 수를 입력하세요 : 1 4
//		1 + 4 = 5
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int num1 = 0; int num2 = 0;
		
		while(true) {
			System.out.print("연산자를 선택하세요.(1~4, 종료는 5) : \n 1. + \n 2. - \n 3. * \n 4. / \n 5.종료 \n 선택 >>");
			a = sc.nextInt();
			if (a == 5) {
				System.out.println("종료합니다.");
				break;
			}else
			System.out.println("사칙연산 할 두 수를 입력하세요 : ");
			num1 = sc.nextInt(); num2 = sc.nextInt();
			
			if (a == 1) {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			}else if (a == 2) {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			}else if (a == 3) {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			}else if (a == 4) {
				System.out.printf("%d / %d = %.1f",num1,num2,(double)(num1 / num2));
			}
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
