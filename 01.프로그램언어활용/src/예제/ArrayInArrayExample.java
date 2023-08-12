package 예제;

public class ArrayInArrayExample {
	public static void main(String[] args) {
	// 2차원 배열
	// 자료형[][] 배열명 = new 자료형[행의 인덱스][열의 인덱스];
	
		int[][] arr1 = new int[2][3];
		
		System.out.println("arr1.length = "  + arr1.length); // 행의 개수
		System.out.println("arr1[0].length = " + arr1[0].length); // 열의 개수
		System.out.println("arr1[1].length = " + arr1[1].length);
		
		
		for(int i = 0; i < arr1.length; i++) {
			for (int k =0; k < arr1[i].length; k++) {
				System.out.println("arr1[" + i + "][" + arr1[i][k]);
			}
			System.out.println();
		}
		
		
		int arr2[][] = new int[][] { {10, 20, 30},{40, 50, 60} };
		
		/*  0열 	1열	2열
		0행 10	20 	30
		1행 40 	50	60 */
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%-5d", arr2[i][j]);
			}
			System.err.println();
		}
		System.out.println();
		
		// 2차원 배열 (가변 배열)
		
		int[][] arr3 = new int[2][];
		arr3[0] = new int[] {1,5};
		arr3[1] = new int[3];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++)
				System.out.println("arr3[" + i + "][" + j + "] = " + arr3[i][j]);
		}
		System.out.println();
		
		// 5X5 2차원 배열에 1~25로 초기화하여 화면에 출력.
		
		int[][] array = new int [5][5];
		//배열 초기화
		for (int i = 0, num = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
			}
		}
		
		
		// 2차원 배열 출력
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k ++) {
				System.out.printf("%-5d", array[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		int sum = 0;
		for (int i =0; i < array.length; i ++) {
			for (int j =0; j < array[i].length; j++) {
				if (i == j) {
					sum += array[i][j];
				}
			}
		}
		
		/* (0,0)
		 * (1,0) (1,1)
		 * (2,0) (2,1) (2,2) 
		 * (3.0) (3.1) (3.2) (3.3)
		 * (4,0) (4,1) (4,2) (4,3) (4,4) 
		 */
		System.out.println("합계 : " + sum);
		System.out.println();
		
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {
				 total += array[i][j];
			}
		}
		System.out.println("합계 : " + total);
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
