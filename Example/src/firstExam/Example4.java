package firstExam;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// 100���� 999������ ����(3�ڸ���)�� �Է¹޾� �� �ڸ��� ���� ���� �հ踦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// [����]
		// �Է°� : 123  ��°� : 6
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.(3�ڸ��� 100 ~ 999) : ");
		int num = sc.nextInt(); // 123
		
		int num1 = num / 100 ;  				// 1    		
		int num2 = (num / 10) - (num1 * 10) ;   //
		int num3 = num % 10;
		
		
		System.out.println("num1 : " + num1 +", num2 : " + num2 + ", num3 : " + num3);
		System.out.println(num1 + num2 + num3);
		
		
		
		

	}

}
