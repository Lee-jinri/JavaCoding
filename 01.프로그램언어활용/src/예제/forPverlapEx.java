package 예제;

public class forPverlapEx {
	public static void main(String[] args) {
		
		System.out.println("기본 for문");
		for (int i = 1 ; i <= 5 ; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		System.out.println("중첩된 for문");
		/* 중첩된 for문
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 
		 */
		for (int i = 1; i <= 5; i++ ) {
			for(int j = 1; j <= 5 ; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		/* 결과
		 * 1 2 3 4 5
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 */ 
		
		for (int i = 5; i >= 1 ; i-- ) {
			for(int j = 1; j <= i ; j++) {
				System.out.print( j + " ");
			}
			System.out.println("");
		}
		System.out.println();
		
		/* 결과
		 * 1
		 * 1 2
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5 
		 */
		
		for (int i = 5; i >= 1; i--) {
			for (int j =1 ; j <=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		
		/* 
		 * 2단부터 9단까지 출력하기
		 */
		
		for (int m = 2; m <=9; m++) {
			for (int n =2; n <= 9; n++) {
				System.out.printf("%d * %d = %d\n",m,n,m*n);
			}
			System.out.println("\n");
		}
		
		for (int n = 1; n <= 9; n++) {
			for (int m = 2; m <= 9; m++) {
				System.out.printf("%d * %d = %2d",m,n,(n*m));
			}
			System.out.println();
		}
		
		
	}
}
