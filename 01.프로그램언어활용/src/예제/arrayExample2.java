package ����;

import java.util.Scanner;

public class arrayExample2 {

	public static void main(String[] args) {
		
		final int YEARS = 3; // 3��
		final int QUARTERS = 5; // 4�б� + ����
		
		double rain[][] = {
				{368.1, 586.5, 351.2, 66.5, 0},
				{173.9, 493.0, 448.4, 168.1, 0},
				{172.8, 1012.4, 259.4, 46.7, 0}};
		
		// ����ڿ��� ���� �޴� ���
//		double[][] rain = new double[YEARS][QUARTERS];
//		Scanner sc = new Scanner(System.in);
//		for(int y = 0; y < YEARS; y++) {
//			for (int q = 0; q < QUARTERS -1; q++) {
//				System.out.print((y+1) +" ���� " + (q+1) + "�б� ������: ");
//				rain[y][q] =sc.nextDouble();
//			}
//		}
//		
		
		for (int y = 0; y < YEARS; y++) {
			for (int q = 0; q < QUARTERS-1; q++) {
				rain[y][QUARTERS-1] = rain[y][q];
				//rain[y][QUARTERS -1] = rain[y][QUARTERS -1] + rain[y][q];
				//rain[��][�� ������ �ε���] = rain[��][�� �������ε���] + �б⺰ ������;
				//rain[��][4] = rain[��][4] + �б⺰ ������
			}
		}
		
		String[] year = {"2018","2019","2020"};
		System.out.println("�⵵\t1�б�\t2�б�\t3�б�\t4�б�\t����");
		System.out.println("---------------------------------------------");
		
		for( int y = 0; y < YEARS; y++) {
			System.out.print((y+1)+"����\t");
			System.out.println(year[y]+"�⵵\t");
			for (int q =0; q< QUARTERS; q++) {
				System.out.printf("%.1f\t",rain[y][q]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
