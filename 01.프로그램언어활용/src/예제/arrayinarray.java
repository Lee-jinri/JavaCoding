package 예제;

public class arrayinarray {

	public static void main(String[] args) {
		/* 이차원 배열의 가로, 세로, 대각선의 합을 구하세요.
		 * 실행결과
		 * ============ 실행 전 ==========
		 * 10  10  10  10  0
		 * 30  30  30  30  0
		 * 40  40  40  40  0
		 * 50  50  50  50  0
		 * 0    0   0  0   0
		 * 
		 * ============ 계산 후=============
		 * 10  10  10  10  40
		 * 30  30  30  30  120
		 * 40  40  40  40  160
		 * 50  50  50  50  200
		 * 130 130 130 130 130
		 */
		
		// 값 4개 + 합
		int arr[][] = {
				{10, 10, 10, 10, 0},
				{30, 30, 30, 30, 0},
				{40, 40, 40, 40, 0},
				{50, 50, 50, 50, 0},
				{0, 0, 0, 0, 0}};  

		
		System.out.println("==============실행 전==============");
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-5d",arr[i][j]);
			}System.out.println();
		}
		
		
		int num = 0;
		
		// 더하기
							// -1은 마지막 행,열 사용하지 않겠다
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][i];
				if (i == j)
					arr[4][4] += arr[i][j];
			}System.out.println();
		}
		
		
		System.out.println("================실행 후==============");
		// 출력
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-5d",arr[i][j]);
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
