package 예제;

import java.util.Scanner;

public class ScoreExample {
	public static void main(String[] args) {
		
		// 학생 수를 입력받고, 학생수만큼 점수를 입력받아 합을 구하도록 하는 프로그램
				
		int total = 0;
		int count;
		
		Scanner sc = new Scanner(System.in);	// 스캐너 불러오기
 		do { 									// 무조건 한번 이상 실행
			System.out.print("학생수를 입력하세요 : ");
			count = sc.nextInt();
		} while (count < 0);
		
		int[] scores = new int[count];  //배열생성: scores라는 배열에는 
		// count의 개수만큼(학생수)만큼의 요소가 있다
		
		for (int i =0; i < count; i++) { 
			// 학생수만큼 scores의 인덱스에 0번부터 차례로 성적을 입력
			System.out.print("성적을 입력하세요 : ");
			scores[i] =sc.nextInt();
		}
		
		// scores[0] 부터 scores[count의 개수(학생수)]까지
		// total에 더한다
		for(int i = 0; i < count; i++) {
			total += scores[i];
		 // total = total + scores
		}
		// 만약 count가 0이 아니라면 합계를 출력
		// count가 0이라면 합계를 구할 학생이 없습니다

		if(count != 0) {
			System.out.printf("합계 : %d", total);
		}else {
			System.out.println("합계를 구할 학생이 없습니다.");
		}
	}
}
