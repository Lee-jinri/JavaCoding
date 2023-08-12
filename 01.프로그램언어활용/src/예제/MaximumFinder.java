package 예제;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		
		// 3개의 정수를 입력받아서 최대값 출력하도록 프로그램 작성해주세요.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("3개의 수를 입력하세요 (공백)");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int max;
		
		
		// 방법 1
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		System.out.println("최대값은 " + max);
		
		
		// 방법 2
		
		max = num1;
		
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		System.out.println("최대값은 " + max);
		
		
	}
}
