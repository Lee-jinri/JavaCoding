package kh.oop1.day02.exam;

public class FieldExam {
	
	// 필드
	// [접근제한자] [예약어] 자료형 변수명 [=초기값];
	
	// 클래스 변수(모든 객체가 공통적으로 속성을 가질 때 사용하고 생성할 때 메모리영역에 같이 생성되기 때문에
	// 꼭 필요한 공통적인 속성을 가진 변수에 사용을 해야합니다.
	// 1. 클래스 변수 : static 키워드를 가지고 필드에 선언
	// 				 메모리의 static 영역을 사용
	public static int var1;
	
	// 멤버 변수(인스턴스 변수)
	// 각각의 개체(인스턴스)마다 개별적인 속성을 가져야 할 때 사용
	// 2. 멤버 변수(인스턴스 변수) : static 키워드 X
	//							메모리의 heap영역 사용
	public int var2;
	private int var3; // 캡슐화 원칙으로 private사용, 실행클래스에서 접근하려면 get, set 사용해야 함.
	int var4; // 접근제한자 생략시 default 접근제한자
	
	
	// 3. 지역 변수 : 메소드, 생성자, 초기화블록 내부에서 선언
	//				메모리의 stack 영역 사용
	// 생성자
	public FieldExam() {
		String var5 = "생성자 지역변수"; 
		System.out.println(var5);
	}
	
	// 초기화 블럭
	{
		String var6 = "초기화 블럭 지역변수";
		System.out.println(var6);
	}
	
	// 메소드
	public String method() {
		String var7 = "메소드안의 지역변수";
		return var7;
	}
	public static String method1() {
		String var8 = "static 안의 지역변수";
		return var8;
	}
	
}
