package ����;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		// �ּ���
		/* ������ �ּ�
		 * 
		 * 
		 */
		
		String dkanrjteh = null; // string�� �ƹ� ���� ���� �ʰڴ�.
		
		var price = 10000;   //=> �ڵ����� int
		var name = "ȫ�浿";  //=> �ڵ����� string
		
		// ���� 2���� �����Ͽ� ���� ������ ���� �ʱ�ȭ�� �� ���� ��ȯ�� ���� ����ϴ� ���α׷��� �ۼ�����
		
		// ���� ���� : �ڷ��� ������ = ��;
		int number1, number2, temp;
		// �� ���� : ������ = ��;
		number1 = 1;
		number2 = 2;
		
		System.out.println("��ȯ �� number1 : " + number1);
		System.out.println("��ȯ �� number2 : " + number2);
		
		// �� ��ȯ : ���ο� ������ ���� �־� number1�� ������ ���� ������� �ʰ� ��.
		temp = number1;   
		number1 = number2;
		number2 = temp;
		
		System.out.println("��ȯ �� number1 : " + number1);
		System.out.println("��ȯ �� number2 : " + number2);
		
		
		// boolean �ڷ���
		
		boolean b = true;
		System.out.println("b : " + b);
		b = ( 1 > 2 );
		System.out.println("b : " + b);
	
		// char �ڷ���
		char c1 = 'A'; 		// ���ڸ� ���� ���� (�빮�� A�� 97)
		char c2 = 65;  		// �������� ����
		char c3 = '\u0041'; // 16������ ����
		
		char c4 = '��'; 		// ���ڸ� ���� ����
		char c5 = 44032;    // �������� ����
		char c6 = '\uac00'; // 16������ ����
		
		int uniCode = c1;   // �����ڵ� ���
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
		// ������
		
		byte age;		 // 1byte
		short point;	 // 2byte
		int price2;		 // 4byte
		long totalSales; //8byte
		
		age = 23;
		point = 32000;
		price2 = 3500000;
		totalSales = 21474832165l; // L���̱�
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price2);
		System.out.println(totalSales);
	
		// �Ǽ���
		
		double radius, area, cir;
		final double PI = 3.14;
		radius = 5.0;
		
		area = PI * radius * radius;
		cir = 2 * PI * radius;
		
		System.out.println("���� ������ " + area);
		System.out.println("���� �ѷ��� " + cir);
		
		// ��¹�� (format) (�Ҽ��� 2�ڸ��� ���)
		System.out.printf("���� ���� : %.2f ���� �ѷ� : %.2f", area, cir);
		
	}
}
