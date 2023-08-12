package 예제;

import java.util.Scanner;

public class arrayExample2 {

	public static void main(String[] args) {
		
		final int YEARS = 3; // 3년
		final int QUARTERS = 5; // 4분기 + 총합
		
		double rain[][] = {
				{368.1, 586.5, 351.2, 66.5, 0},
				{173.9, 493.0, 448.4, 168.1, 0},
				{172.8, 1012.4, 259.4, 46.7, 0}};
		
		// 사용자에게 값을 받는 경우
//		double[][] rain = new double[YEARS][QUARTERS];
//		Scanner sc = new Scanner(System.in);
//		for(int y = 0; y < YEARS; y++) {
//			for (int q = 0; q < QUARTERS -1; q++) {
//				System.out.print((y+1) +" 년차 " + (q+1) + "분기 강수량: ");
//				rain[y][q] =sc.nextDouble();
//			}
//		}
//		
		
		for (int y = 0; y < YEARS; y++) {
			for (int q = 0; q < QUARTERS-1; q++) {
				rain[y][QUARTERS-1] = rain[y][q];
				//rain[y][QUARTERS -1] = rain[y][QUARTERS -1] + rain[y][q];
				//rain[행][열 마지막 인덱스] = rain[행][열 마지막인덱스] + 분기별 강수량;
				//rain[행][4] = rain[행][4] + 분기별 강수량
			}
		}
		
		String[] year = {"2018","2019","2020"};
		System.out.println("년도\t1분기\t2분기\t3분기\t4분기\t총합");
		System.out.println("---------------------------------------------");
		
		for( int y = 0; y < YEARS; y++) {
			System.out.print((y+1)+"년차\t");
			System.out.println(year[y]+"년도\t");
			for (int q =0; q< QUARTERS; q++) {
				System.out.printf("%.1f\t",rain[y][q]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
