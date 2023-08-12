package 예제;

import java.util.Scanner;

public class array4 {
	public static void main(String[] args) {
		
		// 과목 "Java","C++","HTML5","컴퓨터구조","데이터베이스"
		// 점수 95, 88, 76, 62, 55
		// "종료" 입력받으면 종료한다 종료하지않으면 계속하게 한다
		
		// 과목 배열 
		String course[] = { "Java","C++","HTML5","컴퓨터구조","데이터베이스","종료" };
		// 점수 배열
		int score[] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 입력하세요 : ");
		
		while(true) { // 무한반복
			String name = sc.next();
			System.out.println("과목 이름>>" + name);
			if(name.equals("종료")) 
				break;
		int i;
		for(i=0; i<score.length;i++) { //0번부터 시작해서 데이터의 개수까지)
			if(course[i].equals(name)) {
				System.out.println(name+"의 점수는 "+score[i]);
				break;
			}
		}
		
		// 과목명이 잘못된 경우
		if(i==score.length) 
			System.out.println("없는 과목입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
