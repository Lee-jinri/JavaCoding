package Abstract_class4;

abstract class Phone { // 부모클래스
	// 추상 클래스가 없는 추상 클래스 : 무조건 상속 클래스를 이용하겠다.
	
	// 필드
	public String owner;  // 주인
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

class SmartPhone extends Phone{ // 자식 클래스
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드 : 기능구현
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}

// 실행 클래스
public class PhoneTest	{
	public static void main(String[] args) {
		// Phone phone = new Phone(); (추상메소드 인스턴스 생성 불가능)
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		

	}
}
