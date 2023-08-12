package java_project_day2;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		// [예제 1] 계산기 프로그램 작성
		// 숫자 두 개를 입력받고 하나의 문자를 입력받음
		// 나눗셈의 경우 분모가 0인지 아닌지를 먼저 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 두 개를 입력하세요. : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("연산자를 입력하세요.(+,-,*,/) : ");
		char oper = sc.next().charAt(0);
		
		if (oper == '/') {
			if (num2 == 0) {
				System.out.println("다시 입력하세요.");
			}else if (num2 != 0) {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
		}if (oper == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}if (oper == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}if (oper == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
