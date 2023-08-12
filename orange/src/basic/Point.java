package basic;
// 캡슐화
/*
 * 원을 의미하는 Circle 클래스를 정의하세요.
 * Circle 클래스는 좌표 상의 위치 정보와 반지름의 길이 정보를 저장할 수 있어야합니다.
 * main 메소드로 Circle클래스를 테스트하세요.
 * showCircleInfo 메소드 호출로 원의 정보를 출력했을 때, 원의 좌표 정보와 반지름 정보는 반드시 출력되도록 하세요.
 */

// Point 클래스는 원의 중심을 나타낸다.

class Point {   // default 클래스 : 클래스 내부, 동일 패키지에서만 접근 가능
	int xPos, yPos;
	
	public Point(int x, int y) {  // 생성자 : 멤버변수의 초기화, 메모리 할당의 기능
		xPos = x;  // x축
		yPos = y;  // y축
	}
	
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}
