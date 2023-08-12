package basic;

public class Circle {
	int rad;		// 반지름
	Point center; 	// 원의 중심 좌표인 Point 클래스를 center라는 이름으로 정의
	
	public Circle(int x, int y, int r) {  // 생성자 : 멤버변수의 초기화, 메모리 할당의 기능
		center = new Point(x,y);
		rad = r;
	}
	
	public void showCircleInfo() { // showCircleInfo를 부르면 이렇게 반환하도록 지정
        System.out.println("radius: " + rad);
        center.showPointInfo();
    }
}

