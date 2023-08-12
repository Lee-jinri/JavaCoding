package basic;

// Man : 부모클래스, BusinessMan : 자식클래스
public class BusinessMan extends Man {
	// 인스턴스 변수
	String company;
	String position;
	
	// 생성자 : BusinessMan은 Man의 인스턴스 변수인 name도 초기화 해줘야한다.
	public BusinessMan(String name, String company, String position) {
		// 상위클래스의 인스턴스 변수를 초기화 하는 법 : super(변수명);
		super(name);
		// 하위클래스의 인스턴스 변수 초기화
		this.company = company;
		this.position = position;
		
	}
	
	// 메소드
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}

class MyBusinessMan{
	public static void main(String args[]) {
		BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
		man.tellYourInfo();
	}
}
