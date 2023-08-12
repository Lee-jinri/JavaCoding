package java_project_day3;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		// -1이 입력될 때까지 정수를 입력받아 그 수의 합계를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.(-1은 종료) : ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		
		
		while (num != -1) {
			sum += num;
			count ++;
			num = sc.nextInt();	
		}
		
		if (sum == 0) {
			System.out.println("입력된 수가 없습니다.");
		}else 
			System.out.println("합계 : " + sum);
			System.out.print("입력된 수의 개수는 " + count + "개이며");
			System.out.printf("평균은 %.2f입니다.", (double)sum / count);
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
