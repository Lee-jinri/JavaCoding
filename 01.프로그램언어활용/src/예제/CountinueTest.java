package 예제;

public class CountinueTest {
	public static void main(String[] args) {
		
		/* 1 ~ 10까지의 수 중에서 홀수를 출력하도록 continue를 사용해보자 */
		
		int i = 0;
		do {
			i++;
			if (i % 2 == 0)
				continue; // 짝수면 아래 출력문 생략하고 반복
			System.out.printf("%5d", i); // %5d = d는 정수, 정수의 값을 이 위치에 5자리를 확보하고 넣는다 (자동 공백) 
		} while ( i < 10 );
		
		System.out.println();
		
		
		
		/* 1 ~ 10까지의 수 중에서 짝수를 출력하도록 continue를 사용해보자 */
	
		for (int a = 1; a <= 10 ;a++) {
			if (a % 2 != 0) {
				continue; // 홀수면 출력문 생략
			}
			System.out.printf("%5d", a);
		}
		
		
		
	
	}
}
