package Abstract_class2;

//추상 클래스 (도형이라는 공통점을 가진다)
abstract class Shape {
	int x, y;
	
	public void move(int x, int y) {  // x,y의 위치를 움직이는 메소드
		this.x = x;
		this.y = y ;
	}
	
	// 추상 메서드 : 선언부만 존재, 정의부 X
	public abstract void draw();  // 도형을 그리는 메서드
}

//추상 메서드를 상속하는 클래스 1 (사각형 도형 만들기)
class Rectangle extends Shape {	  // 추상클래스 상속
	int width, height;
	
	public void draw() {		  // 추상메소드를 재정의
		System.out.println("사각형 그리기 메소드");  
	}
}

//추상 메서드를 상속하는 클래스 2 (원 도형 만들기)
class Circle extends Shape {	 // 추상클래스 상속
	int radius; 
	
	public void draw() {		 // 추상메소드를 재정의
		System.out.println("원 그리기 메소드");
	}
}

// 출력 클래스
public class AbstractShapeTest {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();   	// 사각형 인스턴스
		r.draw();
		
		Circle c = new Circle();			// 원 인스턴스
		c.draw();
		
//		Shape s = new Shape();   // 오류, 추상 클래스는 인스턴스 생성이 불가능하다

	}
}



