package 예제;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		
		// 커피 가격 출력
		// 아메리카노는 3500원 입니다.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("무슨 커피 ?");
		String order = input.nextLine();
		
		int price = 0; 
		
		switch (order) {
		case "카페라떼":
		case "바닐라라떼":
			price = 4500;
			break;
		case "아메리카노":
		case "에스프레소":
			price = 2000;
			break;
		default:
			System.out.println("없는 메뉴입니다.");
		}
		
		if (price != 0) {
		System.out.println(order + "는 " + price + "원입니다.");
		}

		
		int score = 0;
		char grade = '\0';	// char 데이터가 아무것도 참조하고있지 않습니다. NULL값을 주는 것.	
		
		System.out.println("점수를 입력하세요 : ");
		score = input.nextInt();
		
		if (score >= 100 || score <= 0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			switch (score / 10) {
			case 10: case 9: 
				grade = 'A';
				break;
			case 8: 
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			System.out.printf("점수 : %d , 등급 : %c", score , grade);
			}
		}
		System.out.printf("점수 : %d , 등급 : %c", score , grade);
		
		
		
		
		
		
		
	}
}
