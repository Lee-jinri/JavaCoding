package java_project_day4;

public class Example1_1 {
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
				
				String name[] = {"ȫ�浿", "��ö��", "������"};
				int score[][] = { {90, 75, 61} , {55, 56, 46} , {90, 90, 90} };
				double sum = 0;
				char grade;
				double avg = 0;
				int count = 0;
				double rank[] = new double[3];
				String pass = " ";
				
				System.out.println("��ȣ\t �̸�\t���� \t����\t����\t���� \t ��� \t ���� \t ����� \t ���� ");
				
				for (int i = 0; i < name.length; i++) {
					count++;
					System.out.printf("%d \t %s \t",count,name[i]);
					
					
					for (int j = 0; j < score[i].length; j++) {
						sum += (double)(score[i][j]);
						avg = sum / 3;
						rank[i] = sum;
						System.out.printf("%d\t" ,score[i][j]);
						}
					System.out.printf("%.0f\t %.1f\t",sum,avg);
						
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
						}else 
							pass = "nonpass";
						
								

						System.out.printf("  %c\t %s\t ",grade , pass );	
						System.out.println();
						sum = 0;
					
				}
					
				
				
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
}
