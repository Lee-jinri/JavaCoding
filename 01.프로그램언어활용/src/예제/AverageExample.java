package 예제;

import java.util.Scanner;

public class AverageExample {
	public static void main(String[] args) {
		
		/* 10개의 숫자를 입력받아 0보다 큰 숫자에 대한 평균과 개수를 출력하는 코드를 완성하세요. 다시하기;;*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : (공백)");
		
		int count = 0, total = 0, num , i ;
		double avg;
		
		// 숫자 10개를 반복해서 넣어주는 코드 for
		for (i = 0; i < 10 ; i++) {
			System.out.println("숫자를 입력하세요 : ");
			num = sc.nextInt();
			// 만약 넣은 수가 0보다 크다면 total에 + num을 해라
			if (num > 0 ) {
				total += num;
				count++;  // count는 평균을 구하기위해 개수가 필요해서 만든것
			}
			if (i == 9) {
				sc.close();
			}
		}
		
		if (count != 0) {
			avg = (double) total / count;
			System.out.printf("평균 : %.2f 개수 : %d\n", avg ,count);
		} else {
			System.out.println("평균을 구할 수 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
