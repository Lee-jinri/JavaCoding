package firstExam;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		
		// 수량, 단가를 입력받아 금액을 계산한 후, 25%를 할인하여 원래 금액, 할인액, 지불금액을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수량을 입력하세요 : ");
		int amount = sc.nextInt();
		System.out.println("단가를 입력하세요 : ");
		int price = sc.nextInt();
		
		// a 원래 금액 , b 할인액 , c 지불금액
		
		int a =  amount * price;
		double b = (double) a * 0.25;
		double c = (double)a * 0.75;
		
		System.out.printf("원래 금액 : %d , 할인액 : %.0f, 지불 금액 : %.0f",a,b,c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
