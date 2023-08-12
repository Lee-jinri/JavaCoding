package Example;

import java.util.Objects;

public class Phone implements Cloneable {
	private String model; // 모델명
	private int price; // 가격 (천원)
	
	public Phone() {} // 디폴트 생성자

	public Phone(String mode, int price) { // 매개변수가 있는 생성자
		super();
		this.model = mode;
		this.price = price;
	}
 
	// 게터와 세터
	public String getModel() {
		return model;
	}

	public void setMode(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  // 주소가 같으면
			return true;  // 동일 객체
		if (obj == null)  // 들어온 객체가 없으면
			return false; // false임
		if (getClass() != obj.getClass()) // getClass()는 객체의 클래스 정보 >> 객체가 같은 클래스에 있음?
			return false; // 여기까지는 없어도 상관없음
		Phone other = (Phone) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	// 해시코드 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	
	// toString 오버라이딩
	@Override
	public String toString() {
		return "모델: " + model + ", 가격: " + price;
	}
	
	// clone 오버라이딩 (깊은 복사)
	// 1. 생성자 이용하기
//	@Override
//	public Phone clone() { // Object 클래스의 자식클래스를 반환값으로 사용할 수 있다.
//		return new Phone(this.model, this.price); // 객체를 생성하고 생성한 객체를 새로운 객체에 담는다.
//	}
	
	// 2. Object 클래스의 clone 이용하기(예외처리, Cloneable 인터페이스 구현해야함)
	@Override
	public Phone clone() {
		Phone result = null; // result는 Phone객체
		try {
			result = (Phone)super.clone(); // Object의 clone을 갖다씀.(오버라이딩하기전의 clone) 객체는 Phone으로 바꿈.
		}catch(CloneNotSupportedException e) { // Cloneable 인터페이스 구현 안했을 때 예외처리
			e.printStackTrace(); 
		}
		return result;
	}
}
