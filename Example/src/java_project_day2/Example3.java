package java_project_day2;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
//		369������ ������ �ۼ��غ���.
//		1 ~ 99������ ������ Ű����κ��� �Է¹ް� �� ���� ������ ������ ������ "���� ������ �ʰ��Ͽ����ϴ�"��� ����ϰ� �����Ѵ�.
//		������ 3,6,9�� �ϳ��� �ִ� ���� "�ڼ�¦"�� ����ϰ�
//		�� �� �ִ� ���� "�ڼ�¦¦"�� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//		���� ��� ������ 13�� ��� "�ڼ�¦"��
//		36�� ��� "�ڼ�¦¦"�� ����Ѵ�.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 99���� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if ((num / 10) % 3 == 0 && (num % 10 ) % 3 == 0) {
			System.out.println("�ڼ�¦¦");
		}else if ((num / 10) % 3 == 0 || (num % 10 ) % 3 == 0) {
			System.out.println("�ڼ�¦");
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
