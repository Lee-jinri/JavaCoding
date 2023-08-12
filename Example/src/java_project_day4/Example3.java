package java_project_day4;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 * [요구사항]
		 * Math.random()의 난수 발생기능을 이용하여 사용자와 컴퓨터가 하는 가위바위보 게임을 만들자
		 * 가위, 바위 보는 각각 1,2,3이다
		 * 사용자가 1,2,3 중 하나를 입력하면 동시에 프로그램도 난수발생기를 이용하여
		 * 1,2,3 중에 한 수를 발생시킨다.
		 * 그리고 사용자와 컴퓨터 중 누가 이겼는지를 판별하여 승자를 출력한다.
		 * 게임은 반복되도록 작성한다 (종료는 4)
		 * 
		 * [실행화면]
		 * 가위(1), 바위(2), 보(3), 종료(4) 중 하나를 선택하세요 >> 1
		 * 컴퓨터는 가위를 냈습니다.
		 * 비겼습니다.
		 * 가위(1), 바위(2), 보(3), 종료(4) 중 하나를 선택하세요 >> 4
		 * 프로그램을 종료합니다.
		 * 
		 * System.out.println((int)(Math.random()*10)); // 0 ~ 9 사이의 정수값
		 * System.out.println((int)(Math.random()*10)+ 1) ; // 1 ~ 10 사이의 정수값
		 */

		
		System.out.print("가위(1), 바위(2), 보(3), 종료(4)중 하나를 선택하세요 >>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		
		String a[] = {"가위", "바위", "보"}; 
		
		int cp = (int) (Math.random() * 3);
		
		String com = a[cp];
		
		System.out.println("컴퓨터는 " + com + "을 냈습니다.");
	
		while(true) {
			if (user == 1){
				if (cp== 1) {
					System.out.println("비겼습니다.");
				}else if (cp == 2) {
					System.out.println("당신이 졌습니다.");
				}else if (cp == 3) {
					System.out.println("당신이 이겼습니다.");
				}
				if (user == 2) {
					if (cp == 1) {
						System.out.println("당신이 이겼습니다.");
					}else if (cp == 2) {
						System.out.println("비겼습니다.");
					}else if (cp == 3) {
						System.out.println("당신이 졌습니다.");
					}
				}if (user == 3) {
					if (cp ==1) {
						System.out.println("당신이 졌습니다.");
					}else if (cp == 2) {
						System.out.println("당신이 이겼습니다.");
					}else if (cp == 3) {
						System.out.println("비겼습니다.");
				}
				}if (user == 4) {
					sc.close();	
					break;
				}else 
					System.out.println("다시 입력해주세요.");
					return;
			}
		}
		
			
			
			
			
	}
}
