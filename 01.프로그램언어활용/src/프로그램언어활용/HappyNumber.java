package ���α׷����Ȱ��;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		
		long answer = 0; // �ູ ���� ��
		long count = 0;  // �ູ ���� ����

		for(int i = 1; i<=range; i++) {
			int number = i;
			int sum = 0;
			
			while(true) {
				//���ڸ� �� ����
				int num = (number >= 10) ? number % 10 : number;
				number /= 10;
						
				//�����ϱ�
				sum += (num * num);
				
				//��� �ڸ� �ٵǸ� �ູ������ ���¼����� �˻��ϱ�
				if(number == 0) {
					if(sum == 1) {
						System.out.println(i+"�� �ູ�� �Դϴ�.");
						answer += i;
						count++;
						break;
					}else if(sum == 4) {
						System.out.println(i+"�� ���¼� �Դϴ�.");
						break;
					}
					number = sum;
					sum = 0;
				}
			}
		}
		System.out.println("��� �ູ���� ������ "+count+"�� �̰� , ��� �ູ���� ���� "+answer);
		System.out.println("����? "+(answer*count));



	}

}
