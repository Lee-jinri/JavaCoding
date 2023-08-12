package 예제;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		
		/*
		 * 두 수를 입력받아, 두 수 사이에 홀수의 합과 짝수의 합을 출력하는 프로그램
		 * 수의 크기에 상관없이 수행 가능해야 한다.
		 */
		
		int i , start, end, temp, oddsum = 0 ,evensum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력해주세요");
		start = sc.nextInt();
		end = sc.nextInt();
		sc.close();
		
		if ( start > end) {
			temp = start;
			start = end;   // 데이터 교환 , start가 작은 값 end가 큰 값이 될 수 있게
			end = temp;
		}
		
		// [방법 1]
		for ( i = start ; i <= end; i++) {
			if (i % 2 == 0)
				evensum = evensum + i; // evensum += i 와 같은 표현
			else 
				oddsum = oddsum + i;   // oddsum += i 와 같은 표현
		}
		System.out.printf("짝수의 합 : %d\t 홀수의 합 : %d" , evensum, oddsum);

		
		
		
		
		
		
		
		
	}
}
