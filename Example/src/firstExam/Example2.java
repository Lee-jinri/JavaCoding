package firstExam;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		// x���� ������ y���� �л��鿡�� �Ȱ��� �������ַ��� �� ��, 
		// �� �л����� ���� �� �ִ� ������ ���� ���� ������ ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���� : ");
		int x = sc.nextInt() ; // ����
		System.out.println("�л� �� : ");
		int y = sc.nextInt() ; // �л���
		
		int a = x / y ; // �л����� ���� �� �ִ� ������ �� 
		int b = x % y ; // ���� ������ ��
		
		System.out.println("�л����� ���� �� �ִ� ������ �� : " + a);
		System.out.println("���� ������ �� : " + b);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
