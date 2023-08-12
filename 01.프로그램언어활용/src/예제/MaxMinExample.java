package 예제;

import java.util.Scanner;

public class MaxMinExample {
	public static void main(String[] args) {
		
		/* 10개의 데이터를 입력받아 최소값, 최대값을 구하여 출력하는 코드를 작성하세요 */
		Scanner sc = new Scanner(System.in);
		int num, max = -99999, min = 99999; 
		// min이 0인데 최소값이 1이라면 결과가 0이 되기때문에 최소값을 가장 큰 값으로 설정해야함
		
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println("숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num > max) {
				max = num;
			}else if (num < min) {  // max에 들어가지 않은 값은 min으로 갈 수있게 else쓰는것 
				min = num;			// 그냥 if로 쓰면 max에 이미 들어간 값이라서 min에는 확인할 필요가 없는데
			}						// min까지 확인을 하게 됨 (불필요) 그래서 else~if
			
			if (i == 9 ) {
				sc.close();
			}
		}
		System.out.printf("최댓값 : %d\t 최솟값 : %d\n", max, min);
		// \t 은 띄어쓰기 \n은 엔터
		
	}
}
