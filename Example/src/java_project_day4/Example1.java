package java_project_day4;

public class Example1 {
	public static void main(String[] args) {
		
		// �迭 
		
		/*
		 * [����]
		 * �л��� : name / ���� : score / ��� : avg / ���� : grade / ����� : pass / ���� : rank
		 * ������ ������ ����
		 * ���� = ���� + ���� + ����;
		 * ��� = ���� / 3;
		 * ���� = ��� 90�̻� 'A' / 80�̻� 'B' / 70�̻� 'C' / 60�̻� 'D' / ������ 'F'
		 * ����� = ��� 60�̻��̸� 'pass' / 60�̸��̸� 'nopass'
		 * ���� ���ϱ�� ���� ���������� �ۼ��Ѵ�.
		 * 2���� �迭�� 1���� �迭�� �̿��Ͽ� ������ �ذ��ϼ���
		 * ��ȣ �̸� ���� ���� ���� ���� ���   ���� �����  ����
		 *  1 ȫ�浿 90  75  61 226 75.33  C  pass   2
		 *  2 ��ö�� 55  56  46 157 52.33  F nopass  3
		 *  3 ������ 90  90  90 270 90.00  A  pass   1
		 */
		

		
		String [] name = {"ȫ�浿","��ö��","������"};
		int [][] score = {{90,75,61},{55,56,46},{90,90,90}};
		int sum = 0;     // ����
		double avg = 0;  // ���
		char grade ;	 // ����
		String pass = " ";     // �����
		
		for (int i = 0; i < name.length;i++ ) {
			System.out.print(name[i] + " ");
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + " ");
			}System.out.print(sum + " ");
			avg = (double)sum / 3;
			sum = 0;
			System.out.printf("%.2f",avg);
			
			if (avg >= 90) {
				grade = 'A';
			}else if (avg >= 80) {
				grade = 'B';
			}else if (avg >= 70) {
				grade = 'C';
			}else if (avg >= 60) {
				grade = 'D';
			}else 
				grade = 'F';

			if (avg >= 60) {
				pass = "pass";
			}else if(avg <= 60) {
				pass = "nopass";
			}
		
			
			System.out.print(" " + grade +" " +pass);
			System.out.println();
		} 
	
		
		avg = (double)sum / 3;
		
			
			
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
