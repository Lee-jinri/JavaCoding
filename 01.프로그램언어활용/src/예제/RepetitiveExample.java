package ����;

import java.util.Scanner;

public class RepetitiveExample {
	public static void main(String[] args) {
		
		// �޴��� �ִ� �����ڸ� �����ϰ� 
		// �ǿ����� �� ���� ���� �Է¹޾� ��Ģ������ �ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		String oper = null;
		int num1, num2;
		int a; int result = 0;
		
		Label : while(true) {
		System.out.print("�����ڸ� 1~4����, ����� 5�� �������ּ���. "
				+ "\n 1. + \n 2. - \n 3. * \n 4. / \n 5.����");
		
		a = sc.nextInt();
		System.out.println("���� : " + a);
		
		System.out.print("��Ģ������ �� �� ���� �Է��ϼ��� : ");
		num1 = sc.nextInt(); num2 = sc.nextInt();
		System.out.printf("���� : %d %d\n",num1,num2);
		
		
		if(a == 1) {
			oper = "+";
			result = num1 + num2;
		}else if(a == 2) {
			oper = "-";
			result = num1 - num2;
		}else if(a == 3) {
			oper = "*";
			result = num1 * num2;
		}else if(a == 4) {
			oper = "/";
			result = num1 / num2;
		}else if(a == 5){ 
			System.out.println("�����մϴ�.");
			break Label;
		}
		char b = oper.charAt(0);
		System.out.printf("%d %c %d = %d\n",num1,b,num2,result);
		continue;
		}
		
		
		
	}
}
