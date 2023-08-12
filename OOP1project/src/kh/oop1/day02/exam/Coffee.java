package kh.oop1.day02.exam;

public class Coffee {

	// 카페
	// 1. 메뉴종류 Hot 아메리카노 / Iced 아메리카노
	// 2. 주문 수량
	// [ 속성값 ] 
	// private String hotAmericano;  // Hot아메리카노
	// private String icedAmericano; // Iced 아메리카노
	
	private String americano; // 아메리카노
	// 카페라떼
	private char temperatureType; // Y : hot, N : Iced
	private String size; // 음료의 사이즈
	
	// [ 생성자 ] 안 만들어도 알아서 생성됨
	public Coffee() {}
	
	// getter
	public String getAmericano() {
		return americano;
	}
	
	public char getTemperatureType() {
		return temperatureType;
	}
	public String getSize() {
		return size;
	}
	
	// setter
	public void setAmericano(String americano) {
		this.americano = americano;
	}
	public void setTemperatureType(char temperatureType) {
		this.temperatureType = temperatureType;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	// [ 기능 정의 ] - 메소드
	public void orderCoffee() {
		System.out.println("커피 주문");
	}
}

// 하나의 클래스에는 하나의 public만 존재 가능
class CoffeeMachine {  // (default) 접근제한자 사용
	
	// 멤버 변수
	public String str1;
	
	// 메소드
	public void machine() {
		
	}
	
	
	
	
}