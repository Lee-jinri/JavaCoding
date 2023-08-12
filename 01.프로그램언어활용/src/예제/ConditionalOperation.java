package 예제;

import java.util.Scanner;

public class ConditionalOperation {
	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		
		System.out.println("두 수(100과 200) 중에서 최대값 : " + ((x > y) ? x : y));
		
		// 임의의 수를 가진 변수를 선언하고 그 값이 짝수인지 홀수인지를 출력할 수 있도록 작성해주세요.
		
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		num = input.nextInt();
		
		System.out.println( (num % 2 == 0) ? "짝수입니다." : "홀수입니다.");
		
		
		// 두 수의 차를 출력하세요. 단 큰 수에서 작은 수를 뺀다.
		
		int num1 , num2;
		
		System.out.println("숫자 두 개를 입력하세요.(공백)");
		num1 = input.nextInt();
		num2 = input.nextInt();
		int result = ((num1 > num2 ) ? num1 - num2 : num2 - num1);
		
		System.out.println("두 수의 차 : " + result);
	}
}
