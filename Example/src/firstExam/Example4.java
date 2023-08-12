package firstExam;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// 100부터 999까지의 숫자(3자리수)를 입력받아 각 자리의 수를 합한 합계를 출력하는 프로그램을 작성하시오.
		// [예시]
		// 입력값 : 123  출력값 : 6
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.(3자리수 100 ~ 999) : ");
		int num = sc.nextInt(); // 123
		
		int num1 = num / 100 ;  				// 1    		
		int num2 = (num / 10) - (num1 * 10) ;   //
		int num3 = num % 10;
		
		
		System.out.println("num1 : " + num1 +", num2 : " + num2 + ", num3 : " + num3);
		System.out.println(num1 + num2 + num3);
		
		
		
		

	}

}
