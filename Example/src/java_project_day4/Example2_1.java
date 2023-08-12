package java_project_day4;

import java.util.Scanner;

public class Example2_1 {

	public static void main(String[] args) {
		
		/* 
		 * [요구사항]
		 * 극장 예약 시스템을 작성해보자.
		 * 좌석은 10개
		 * 사용자가 예약하려고 할 때 먼저 좌석 배치표를 보여준다
		 * 예약이 끝난 좌석은 1로 예약이 안 된 좌석은 0
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int seat[][] = new int[10][10];
		int a = 0;
		
		
		
		while(true) {
			System.out.println("예약할 좌석을 선택하세요(종료 -1) : ");
			
			
			for(int i = 0; i<seat.length; i++) {
				seat[0][i] = i+1;
				System.out.print(seat[0][i] + " ");
				}
			System.out.println();
			for(int i = 0; i<seat.length; i++) {
				System.out.print(seat[1][i] + " ");
				}
			
			a = sc.nextInt();
			if (a == -1) {
				System.out.println("종료합니다.");
				break;
			}else if(a != -1) {
				seat[1][a-1] = 1;
			}
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
