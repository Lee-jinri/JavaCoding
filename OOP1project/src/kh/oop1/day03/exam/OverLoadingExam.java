package kh.oop1.day03.exam;

public class OverLoadingExam {
	
	// 오버로딩의 조건
	// 1. 메소더의 이름은 동일해야한다.
	// 2. 매개변수의 타입, 갯수, 위치가 달라야한다.
	
	// 변수
	int intI;
	int intII;
	String strS;
	
	// 메소드 생성
	public void method() {
		
	}
	// 동일한 이름, 매개변수가 다름
	public void method(int intI) {
		
	}
//	변수의 타입이 같기 때문에 오버로딩 X
//	public void method(int intII) {
//		
//	}
	// 매개변수의 타입이 달라야한다.
	public void method(String strS) {
		
	}
	// 매개변수의 갯수가 달라야한다.
	public void method(int intI, String strS) {
		
	}
	// 매개변수의 위치가 달라도 다른 메소드로 인식
	public void method(String strS, int intI) {
	}
}