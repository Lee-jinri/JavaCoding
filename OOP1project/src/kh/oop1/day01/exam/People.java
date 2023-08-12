package kh.oop1.day01.exam;

public class People {
	
	// 추상화
	
	// 사람에 관련된 것을 추상화 해보자
	
	// 사람이 갖고 있는것 (사람의 상태)
	String head;   // 머리
	String heart;  // 심장
	String eye;    // 눈
	String nose;   // 코
	String mouth;  // 입
	String name;   // 이름
	char gender;   // 성별
	double height; // 키

	// 사람의 기능
	// 생각한다
	public void think() {
		System.out.println("생각한다.");
	}
	// 달린다
	public void run() {
		System.out.println("달린다.");
	}
	// 잔다
	public void sleep() {
		System.out.println("잔다.");
	}
	// 날다
	
	
}
