package firstExam;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		
		// ����, �ܰ��� �Է¹޾� �ݾ��� ����� ��, 25%�� �����Ͽ� ���� �ݾ�, ���ξ�, ���ұݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int amount = sc.nextInt();
		System.out.println("�ܰ��� �Է��ϼ��� : ");
		int price = sc.nextInt();
		
		// a ���� �ݾ� , b ���ξ� , c ���ұݾ�
		
		int a =  amount * price;
		double b = (double) a * 0.25;
		double c = (double)a * 0.75;
		
		System.out.printf("���� �ݾ� : %d , ���ξ� : %.0f, ���� �ݾ� : %.0f",a,b,c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
