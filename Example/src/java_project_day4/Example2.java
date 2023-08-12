package java_project_day4;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		/* 
		 * [요구사항]
		 * 극장 예약 시스템을 작성해보자.
		 * 좌석은 10개
		 * 사용자가 예약하려고 할 때 먼저 좌석 배치표를 보여준다
		 * 예약이 끝난 좌석은 1로 예약이 안 된 좌석은 0
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int seat[][] = new int [2][10]; 
		int rv;
		
		
		System.out.println("------------------------------");
		for(int i = 0; i < seat.length; i++) { 
		      for(int j = 0; j < seat[i].length; j++) { 
		        seat[i][j] = 0; 
		        seat[1][j] = j + 1;
		        System.out.print(seat[i][j] + "  " );  
		     } 
		     System.out.println();
		     System.out.println("------------------------------");
		}
		
		while(true) {
			System.out.println("예약할 좌석을 입력하세요(종료는 -1) :");
			rv = sc.nextInt();
			
			if (seat[0][rv] == 0){
				seat[0][rv] = 1;
				System.out.println("예약되었습니다.");
			}else if (seat[0][rv] == 1) {
				System.out.println("이미 예약된 자리입니다.");
			}else if (rv == -1) {
				System.out.println("좌석 예약을 종료합니다.");
				break;
			}else 
				System.out.println("좌석 선택이 잘못되었습니다.");
		}
		sc.close();	
		
		}
	
}
