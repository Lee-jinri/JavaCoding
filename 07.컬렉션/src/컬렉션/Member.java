package 컬렉션;

public class Member {
	private String name;
	private int age;

	// 인스턴스가 만들어질 때 필드 초기화
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
// equals의 Object를 재정의 해야 주소값이 아니라 숫자값으로 같은지 다른지 판단을 한다
// 나이가 같으면 동일 객체로 판단
//	@Override
//	public boolean equals(Object obj) { // 부모클래스 참조변수 = 서브클래스의 주소값 -> 업캐스팅
//		if(obj instanceof Member) {
//			Member member = (Member) obj; // (서브클래스)부모클래스타입 참조변수 -> 다운캐스팅
//			if(this.age == member.age) {  // 주소값을 비교하여 같은지 다른지 판단한다
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return age;
//	}
	
	
	
// 주소값이 아니라 실제 문자를 비교하여 같으면 삭제하도록 메소드 재정의
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			if(name.equals(member.name))  // String은 주소값이 다 다르기때문에 String 비교할 땐 equals~~
//				return true;
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
	
	
	// 이름과 나이가 같은지 한번에 확인하도록 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age); // 이름과 나이 둘 다 같으면 true
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
	// 출력 메소드 재정의
	@Override
	public String toString() {
		return String.format("member - (이름:%s,나이:%s)",name,age );
	}
}

