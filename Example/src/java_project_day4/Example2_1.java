package java_project_day4;

import java.util.Scanner;

public class Example2_1 {

	public static void main(String[] args) {
		
		/* 
		 * [�䱸����]
		 * ���� ���� �ý����� �ۼ��غ���.
		 * �¼��� 10��
		 * ����ڰ� �����Ϸ��� �� �� ���� �¼� ��ġǥ�� �����ش�
		 * ������ ���� �¼��� 1�� ������ �� �� �¼��� 0
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int seat[][] = new int[10][10];
		int a = 0;
		
		
		
		while(true) {
			System.out.println("������ �¼��� �����ϼ���(���� -1) : ");
			
			
			for(int i = 0; i<seat.length; i++) {
				seat[0][i] = i+1;
				System.out.print(seat[0][i] + " ");
				}
			System.out.println();
			for(int i = 0; i<seat.length; i++) {
				System.out.print(seat[1][i] + " ");
				}
			
			a = sc.nextInt();
			if (a == -1) {
				System.out.println("�����մϴ�.");
				break;
			}else if(a != -1) {
				seat[1][a-1] = 1;
			}
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
