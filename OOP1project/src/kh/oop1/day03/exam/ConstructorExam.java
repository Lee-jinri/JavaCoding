package kh.oop1.day03.exam;

public class ConstructorExam {
	// 필드 멤버 변수
	private int no;
	private String name;
	
	// 생성자 표현식
	// 1. 기본생성자 : [접근제한자] 클래스명(){}
	// 작성하지 않아도 자동으로 생성됨.
	// 2. 매개변수가 있는 생성자 : 객체 생성 시 전달받은 값으로 객체를 초기화 하기 위해 사용
	// 상속에서 사용 시 반드시 기본생성자를 필수로 만들어야함, 오버로딩 이용하여 작성
	// [접근제한자] 클래스명(매개변수){(this).필드변수 = 매개변수;}
	
	// 기본생성자
	public ConstructorExam() {
		
	}
	
	// 매개변수가 있는 생성자
	public ConstructorExam(int no, String name) {
		this.no = no; 
		this.name = name;
		
	}
	
}
