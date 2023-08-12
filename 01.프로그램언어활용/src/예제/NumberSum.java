package 예제;

import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
	/* 사용자로부터 5개의 정수를 받아서 합과 평균값을 계산하여 출력하는 프로그램을 작성하세요.
	 * [예시]
	 * 1번째 수 입력 : 1
	 * 2번째 수 입력 : 2
	 * 3번째 수 입력 : 3
	 * 4번째 수 입력 : 4
	 * 5번째 수 입력 : 5
	 * 입력 받은 수 
	 * 합계 : 15 평균 :3.0
	 */
	
	Scanner sc = new Scanner(System.in);

	int num = 0;
	int sum = 0;
	int avg = 0;
	
	System.out.println("정수를 입력하세요 (공백)");
	
	for (int i = 1 ; i <= 5; i ++) {
		num = sc.nextInt();
		System.out.println(i +"번째 수 입력 : " + num);
		sum += num;
		avg = sum / i;
	}
	
	System.out.println("입력받은 수");
	System.out.printf("합계 : %d 평균 : %.1f" ,sum, (double)avg);
	
	
	// [2번째 방법]
	int su = 1; int num2 = 0;
	while(su <= 5) {
		System.out.println(num +"번째 수 입력 : ");
		num2 = sc.nextInt();
		
		sum = sum + num2;
		su++;
	}
	System.out.printf("입력받은 수 \n 합계 : %d 평균 : %.1f", sum, ((double)sum /(su-1)));
	sc.close();
	
	
	
	
	
	
	}
}
