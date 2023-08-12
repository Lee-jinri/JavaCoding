package basic;

import java.util.Scanner;

public class ScoreTest {
	public static Scanner input = new Scanner(System.in);
	
	// 데이터를 입력받기 위한 메소드 Score score = s1
	// 매개변수 : 클래스명 참조변수 = 주소값
	public static void inputData(Score score) {
		// 필드에 직접 대입
		System.out.println("이름 입력 : ");
		score.name = input.nextLine();

		System.out.println("국어 점수 입력 : ");
		score.kor = input.nextInt();
		
		System.out.println("영어 점수 입력 : ");
		score.eng = input.nextInt();
		
		System.out.println("수학 점수 입력 : ");
		score.math = input.nextInt();
		input.nextLine();
	}
	
	public static void main(String[] args) {
		
		// 인스턴스 생성
		Score s1 = new Score();
		
		inputData(s1);
		s1.getTotal();
		
		Score s2 = new Score();
		
		s2.scoreData("김철수", 55, 56, 46);
		s2.getTotal();
		
		Score s3 = new Score();
		s3.scoreData("이진희", 90, 90, 90);
		s3.getTotal();
		
		System.out.println("========================================================");
		String[] subject = {"이름","국어","영어","수학","총점","평균","학점"};
		for (int i = 0; i<subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}
		
		System.out.println("\n=====================================================");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		

	}

}
