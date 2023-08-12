package kh.oop1.day02.exam;

public class BlockExam {
	
	/* 클래스 변수 초기화 순서
	 * JVM 기본값 -> 명시적 초기값 -> 클래스 초기화 블록 초기값
	 * 
	 * 인스턴스 변수 초기화 순서
	 * JVM 기본값 -> 명시적 초기값 -> 인스턴스 초기화 블록 초기값 -> 생성자를 통한 초기값 
	 * - 인스턴스 블록이 생성자보다 먼저 초기화 됨!
	 */
	// 클래스 변수 프로그램이 실행될 때 초기화
	public static String name = "홍길동";
	
	public BlockExam() {
		System.out.println("생성자 영역");
	}
	
	int age = 19;
	
	// 클래스 블록 : 초기에 딱 한 번 실행될 때 사용
	static{
		System.out.println("static block 영역");
		name = "박길동";
		
	}
	
	// 인스턴스 블록, 이름이 없는 메소드
	// 초기값을 수정한다거나 연산처리를 해야할 때 사용
	// 생성자 영역보다 먼저 나옴
	// 생성자 이전에 값을 바꿔야한다면 여기서 바꿈
	{
		System.out.println(age);
		System.out.println("인스턴스 블록1");
		this.age=22;
		System.out.println(age);
	}
	// 인스턴스 블록은 여러개 사용할 수 있다.
	{
		System.out.println("인스턴스 블록2");
	}
	
	/*
	 * 클래스 변수
	 * 
	 */
}
