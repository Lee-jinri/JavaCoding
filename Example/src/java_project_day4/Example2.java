package java_project_day4;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		/* 
		 * [�䱸����]
		 * ���� ���� �ý����� �ۼ��غ���.
		 * �¼��� 10��
		 * ����ڰ� �����Ϸ��� �� �� ���� �¼� ��ġǥ�� �����ش�
		 * ������ ���� �¼��� 1�� ������ �� �� �¼��� 0
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int seat[][] = new int [2][10]; 
		int rv;
		
		
		System.out.println("------------------------------");
		for(int i = 0; i < seat.length; i++) { 
		      for(int j = 0; j < seat[i].length; j++) { 
		        seat[i][j] = 0; 
		        seat[1][j] = j + 1;
		        System.out.print(seat[i][j] + "  " );  
		     } 
		     System.out.println();
		     System.out.println("------------------------------");
		}
		
		while(true) {
			System.out.println("������ �¼��� �Է��ϼ���(����� -1) :");
			rv = sc.nextInt();
			
			if (seat[0][rv] == 0){
				seat[0][rv] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}else if (seat[0][rv] == 1) {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}else if (rv == -1) {
				System.out.println("�¼� ������ �����մϴ�.");
				break;
			}else 
				System.out.println("�¼� ������ �߸��Ǿ����ϴ�.");
		}
		sc.close();	
		
		}
	
}
