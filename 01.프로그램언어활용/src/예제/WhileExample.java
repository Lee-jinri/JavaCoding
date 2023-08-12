package 예제;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		
		/* -1이 입력될 때까지 정수를 입력받아 그 수들의 합을 출력하는 프로그램을 작성하세요. */
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0; int sum = 0;
		
		System.out.println("정수를 입력해주세요. (종료는 -1)");
		int a = sc.nextInt();
		while (a != -1) {
			sum += a;
			count ++;
			a = sc.nextInt();
		}
		if (count == 0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.println("합계 : " + sum);
			System.out.println("정수의 개수는 " + count + "개이며");
			System.out.printf("평균은 %.2f입니다.", (double)sum / count);
		}
		sc.close();
		
		
		
		
		
		
		
		
//		
//		do {
//			System.out.println("수를 입력하세요 : ");
//			a = sc.nextInt();
//		}while(true);
//			if(a != -1) {
//			return;
//			else {
//			break;}
//			}
				
			
		
	
	}
}
