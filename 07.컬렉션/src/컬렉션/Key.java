package 컬렉션;

public class Key {
	private int number;
	
	// 인스턴스가 만들어질 때 필드 초기화
	public Key(int number) {
		this.number = number;
	}
	
	// 여기부터
	// equals의 Object를 재정의 해야 주소값이 아니라 숫자값으로 같은지 다른지 판단을 한다
	@Override
	public boolean equals(Object obj) { // 부모클래스 참조변수 = 서브클래스의 주소값 -> 업캐스팅
		if(obj instanceof Key) {
			Key compareKey = (Key) obj; // (서브클래스)부모클래스타입 참조변수 -> 다운캐스팅
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return number;
	}
	
	// 여기까지
	
	
	@Override
	public String toString() {
		return "number : " + number;
	}
}
