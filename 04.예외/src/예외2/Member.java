package 예외2;

public class Member {

	private String id;
	private int age;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
	
	// 나이를 비교할 수 있게 만들어줌
	@Override  // Object를 재정의 함.
	public boolean equals(Object obj) { // 부모클래스 참조변수 = 서브클래스의 참조값(주소값), 업캐스팅
		if (obj instanceof Member){
			Member member = (Member)obj; // 서브클래스 참조변수 = (서브클래스)부모클래스타입의 참조변수, 다운캐스팅
			if(this.id.equals(member.id)){
		//	if(this.age == member.age) {
				return true;
			}
		}
		return false;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
