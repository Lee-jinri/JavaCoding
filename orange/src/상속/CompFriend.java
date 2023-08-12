package 상속;

public class CompFriend extends Friend{
	
	// 인스턴스 변수
	// 어느 부서인지
	private String department;
	
	// 생성자
	public CompFriend(String name,String phone,String department) {
		super(name,phone);
		this.department = department;
	}
	
	// 메소드재정의
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : " + department);
	}
}
