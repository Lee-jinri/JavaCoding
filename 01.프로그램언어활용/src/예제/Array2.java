package 예제;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		
		// 10미만의 정수 두 개를 입력받아서 첫번째 원소와 두번째 원소를 입력받은 수로 초기화
		// 세번째 원소부터 마지막 원소까지는 전전항과 전항을 곱한 값의 일의 자리이다.
		
		Scanner sc=new Scanner(System.in);
		int num = 0;
		int array[] = new int[10];
		
		// 입력받고 초기화
		for (int i = 0; i < 2 ; i++) {
			System.out.println("원소 입력 :");
			array[i] = sc.nextInt();
			array[i] = sc.nextInt();
			if (array[i] > 10 || array[i] < 1);
				continue;
		}
		
		for(int i = 0; i < array.length;i++) {
			array[2] = array[0]*array[1];
		}
		
		
		// 출력
		for (int i=0 ; i <array.length;i++) {
			System.out.print(array[i]);
		}
		
		
		
		

		do { 
			System.out.println("숫자 두개를 입력 :");
			array[num] = sc.nextInt();
			if (array[num] < 1 || array[num] > 9) {
				continue;
			}
		} while (num < 2);
		
		for (int i = 2; i < array.length; i++) {
			array[i] = (array[i - 2] * array[i - 1]) %10;
		}
		
		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if ( i < array.length - 1) {
				System.out.print(" , ");
			}
		}System.out.print("]");
		
		
		
		
	}
}
