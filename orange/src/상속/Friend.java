package 상속;

// 부모클래스
public class Friend {
	// 인스턴스 멤버, 부모클래스는 자식클래스가 공통적으로 사용할 멤버를 정의한다. 
	protected String name;
	protected String phone;
	
	// 생성자
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
	}

}
