package 예제;
/* 이름과 학점(4.5만점))을 5개 입력받아해시맵에 저장하고 장학생 선발기준을 입력받아 장학생 명단을 출력하라.
 * [실행 예제]
 * 장학금 관리 시스템입니다.
 * 이름과 학점 >> 김철수 3.1
 * 이름과 학점 >> 한수진 3.9
 * 장학생 성발 학점 기준입력 >> 3.6
 * 장학생 명단 : 한수진
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Scholarship {
	private String title; // 장학금
	private Scanner sc = new Scanner(System.in);
	// Map은 키와 값으로 구성됨.
	// scoreMap이라는 이름의 HashMap 컬렉션 생성, 이름과 학점을 입력받기 위해 <String, Double> 
	private HashMap<String, Double> scoreMap = new HashMap<>();
	
	// 생성자
	public Scholarship(String name) {
		this.title = name;
	}
	
	// 점수 입력 메소드
	public void read() {
		System.out.println(title + "관리 시스템입니다.");
		// 이름과 학점을 5개 입력받는다.
		for(int i = 0; i > 5; i++) {
			System.out.print("이름과 학점 >>");
			// 이름은 name에 입력받고 점수는 score에 입력받는다.
			String name = sc.next();
			double score = sc.nextDouble();
			// 원소 입력
			scoreMap.put(name, score);
		}
	}
	
	// 장학생 학점 기준 입력 + 장학생 print 메소드
	public void select() {
		System.out.print("장학생 선발 학점 기준 입력 >>");
		double cutline = sc.nextDouble();
		
		System.out.println("장학생 명단 : ");
		
		// scoreMap의 키셋 (키와 값)을 Set에 넣어서 반복자를 사용한다. Map은 반복자 사용 불가
		Set<String> nameSet = scoreMap.keySet();
		Iterator<String> it = nameSet.iterator();
		while(it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if(score > cutline)
				System.out.print(name + " ");
		}
		System.out.println();
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		// 인스턴스 생성
		Scholarship sship = new Scholarship("장학금");
		
		// Scholarship클래스의 메소드 불러오기
		sship.read();
		sship.select();
	}
}
