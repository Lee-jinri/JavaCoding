package kh.oop1.day02.exam;

// 실행용 클래스 : 클래스 안에 main 메소드가 존재하여 실행하는 클래스
// 기능제공 클래스 : 클래스 안에 메소드를 추가하여 필요한 기능이 구현되어있는 클래스
public class Exam {
	// < 클래스 {변수 , 생성자, 메소드} >
	// 클래스 접근제한자는 public(+), (default)(~)만 사용 가능
	// public은 아무데서나 접근 가능 default는 같은 패키지 내에서만 접근 가능
	
	// * 변수(속성값 설정)
	// [접근제한자] [예약어] 자료형 변수명;
	// 접근제한자 : public, protected, (default), private
	// 예약어 ㅣ static, final
	private static int age;
	public static String name;
	
	// * 생성자
	public Exam() {}
	
	// * 메소드(기능 정의 설정)
	// [접근제한자] 반환형 메소드명(매개변수){ 기능 정의 }
	
	// 1. 매개변수가 없는 메소드
	public void printName() {  // 괄호안에 아무것도 안 넣으면 매개변수가 없는 메소드
		// 기능정의
	}
	
	// 2. 매개변수가 있는 메소드
	public void printAge(int age) {
		// 기능정의
	}
	
	CoffeeMachine cm = new CoffeeMachine();
	// 이 클래스는 main(실행클래스)이 아니기때문에 cm.의 기능을 사용하지 못한다
	// 사용하고 싶으면
	// 초기화 블럭
	{
		System.out.println(cm.str1);
	}
	
	
	
	
}
