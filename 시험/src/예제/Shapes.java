package 예제;
interface Shape {
	final double PI = 3.14;
	
	// 추상메소드
	void draw();
	double getArea();
	
	// 디폴트 메소드
	default public void redraw() {
		System.out.print("---다시 그립니다.");
		draw();
	}
	
	
}

class Circle implements Shape {

	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름이 " + r +"인 원입니다.");
	}
	
	@Override
	public double getArea() {
		return PI * r * r;
	}
	
}

public class Shapes {
	public static void main(String[] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());

	}

}
