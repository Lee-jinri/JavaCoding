package ����;

public class SchoolCafeteriaExample {

	public static void main(String[] args) {
		
		// �л� �޽� ������ ���� (20��)
		// 1�� �Ҹ���, 2�� ����, 3�� ����
		
		int[] assessment = {1, 2, 1, 2, 3, 1, 2, 2, 3, 1, 3, 3, 1, 1, 1, 2, 3, 1, 3, 2};
		int a=0,b=0,c=0;
		
		for (int i = 0; i < assessment.length; i++) {
			if(assessment[i] == 1) {
				a++;
			}else if(assessment[i] == 2) {
				b++;	
			}else if(assessment[i] == 3) {
				c++;
			}
		}System.out.printf("�Ҹ��� : %d ���� :%d ���� : %d",a,b,c);
	
	}
}
