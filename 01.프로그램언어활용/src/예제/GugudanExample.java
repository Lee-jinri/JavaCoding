package 예제;

import java.util.Scanner;

public class GugudanExample {
	public static void main(String[] args) {
		
		// 사용자에게 단을 입력받아 그 단의 구구단 출력하기
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("단을 입력하세요 : ");
		int dan = input.nextInt();
		
		if (dan < 2 || dan > 9) {
			System.out.println("단은 2 ~ 9단으로 입력해주세요");
		} else { 
			for (int i = 1; i <= 9 ; i ++) {
				System.out.println(dan + " X " + i + " = " +(dan * i));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
