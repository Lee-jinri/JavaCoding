package java_project_day4;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 * [�䱸����]
		 * Math.random()�� ���� �߻������ �̿��Ͽ� ����ڿ� ��ǻ�Ͱ� �ϴ� ���������� ������ ������
		 * ����, ���� ���� ���� 1,2,3�̴�
		 * ����ڰ� 1,2,3 �� �ϳ��� �Է��ϸ� ���ÿ� ���α׷��� �����߻��⸦ �̿��Ͽ�
		 * 1,2,3 �߿� �� ���� �߻���Ų��.
		 * �׸��� ����ڿ� ��ǻ�� �� ���� �̰������ �Ǻ��Ͽ� ���ڸ� ����Ѵ�.
		 * ������ �ݺ��ǵ��� �ۼ��Ѵ� (����� 4)
		 * 
		 * [����ȭ��]
		 * ����(1), ����(2), ��(3), ����(4) �� �ϳ��� �����ϼ��� >> 1
		 * ��ǻ�ʹ� ������ �½��ϴ�.
		 * �����ϴ�.
		 * ����(1), ����(2), ��(3), ����(4) �� �ϳ��� �����ϼ��� >> 4
		 * ���α׷��� �����մϴ�.
		 * 
		 * System.out.println((int)(Math.random()*10)); // 0 ~ 9 ������ ������
		 * System.out.println((int)(Math.random()*10)+ 1) ; // 1 ~ 10 ������ ������
		 */

		
		System.out.print("����(1), ����(2), ��(3), ����(4)�� �ϳ��� �����ϼ��� >>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		
		String a[] = {"����", "����", "��"}; 
		
		int cp = (int) (Math.random() * 3);
		
		String com = a[cp];
		
		System.out.println("��ǻ�ʹ� " + com + "�� �½��ϴ�.");
	
		while(true) {
			if (user == 1){
				if (cp== 1) {
					System.out.println("�����ϴ�.");
				}else if (cp == 2) {
					System.out.println("����� �����ϴ�.");
				}else if (cp == 3) {
					System.out.println("����� �̰���ϴ�.");
				}
				if (user == 2) {
					if (cp == 1) {
						System.out.println("����� �̰���ϴ�.");
					}else if (cp == 2) {
						System.out.println("�����ϴ�.");
					}else if (cp == 3) {
						System.out.println("����� �����ϴ�.");
					}
				}if (user == 3) {
					if (cp ==1) {
						System.out.println("����� �����ϴ�.");
					}else if (cp == 2) {
						System.out.println("����� �̰���ϴ�.");
					}else if (cp == 3) {
						System.out.println("�����ϴ�.");
				}
				}if (user == 4) {
					sc.close();	
					break;
				}else 
					System.out.println("�ٽ� �Է����ּ���.");
					return;
			}
		}
		
			
			
			
			
	}
}
