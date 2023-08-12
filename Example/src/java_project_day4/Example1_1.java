package java_project_day4;

public class Example1_1 {
	public static void main(String[] args) {
		
		// 배열 
		
				/*
				 * [조건]
				 * 학생명 : name / 점수 : score / 평균 : avg / 학점 : grade / 재수강 : pass / 순위 : rank
				 * 수식은 다음과 같다
				 * 총점 = 국어 + 영어 + 수학;
				 * 평균 = 총점 / 3;
				 * 학점 = 평균 90이상 'A' / 80이상 'B' / 70이상 'C' / 60이상 'D' / 나머지 'F'
				 * 재수강 = 평균 60이상이면 'pass' / 60미만이면 'nopass'
				 * 순위 구하기는 제일 마지막으로 작성한다.
				 * 2차원 배열과 1차원 배열을 이용하여 문제를 해결하세요
				 * 번호 이름 국어 영어 수학 총점 평균   학점 재수강  순위
				 *  1 홍길동 90  75  61 226 75.33  C  pass   2
				 *  2 김철수 55  56  46 157 52.33  F nopass  3
				 *  3 이진희 90  90  90 270 90.00  A  pass   1
				 */
				
				String name[] = {"홍길동", "김철수", "이진희"};
				int score[][] = { {90, 75, 61} , {55, 56, 46} , {90, 90, 90} };
				double sum = 0;
				char grade;
				double avg = 0;
				int count = 0;
				double rank[] = new double[3];
				String pass = " ";
				
				System.out.println("번호\t 이름\t국어 \t영어\t수학\t총점 \t 평균 \t 학점 \t 재수강 \t 순위 ");
				
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
