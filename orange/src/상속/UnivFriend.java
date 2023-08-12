package 상속;

// 자식클래스 
public class UnivFriend extends Friend {
	
	// 인스턴스 변수
	// 친구가 무슨 과를 나왔는지
	private String major;

	// 생성자
	public UnivFriend(String name, String major, String phone) {
		// 부모클래스의 생성자
		super(name,phone);
		this.major = major;
	}
	
	// 메소드 오버라이딩
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}

}
