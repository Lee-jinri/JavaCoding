package 클래스;

public class CarMutatorAccessor {
	
	// 필드 정의
	private int speed; 
	private int gear;
	private String color;
	
	// 접근자 : private으로 선언된 필드의 값을 반환하는 메서드
	// public 자료형 get필드명() {return 필드명;}
	public int getSpeed() {
		return speed;
	}
	
	// 설정자 : private으로 선언된 필드의 값을 설정하는 메서드
	// public void set필드명(자료형 변수명) {필드명 = 변수명;}
	public void setSpeed(int s) {
		if (s > 0)
			speed = s;
		else 
			speed = 0;
	}
	
	public int getGear() {  // 기어에 대한 접근자
		return gear;
	}
	
	public void setGear(int g) { // 기어에 대한 제한자
		gear = g;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String h) {
		color = h;
	}
	
	// 메소드 정의
	public void speedUp(int s) { // 속도 증가 메소드
		speed += s;
	}
	
	public void speedDown(int s) { // 속도 감소 매소드
		speed -= s;
	}
	
	public String toString() { // 객체의 상태를 문자로 반환하는 메소드
		return "자동차 상태 정보 [속도 : "+speed+", 기어: " +gear+ ", 색상: "+color +"]";
	}
	
	
	
	
	
}
