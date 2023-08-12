package ����;
interface Shape {
	final double PI = 3.14;
	
	// �߻�޼ҵ�
	void draw();
	double getArea();
	
	// ����Ʈ �޼ҵ�
	default public void redraw() {
		System.out.print("---�ٽ� �׸��ϴ�.");
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
		System.out.println("�������� " + r +"�� ���Դϴ�.");
	}
	
	@Override
	public double getArea() {
		return PI * r * r;
	}
	
}

public class Shapes {
	public static void main(String[] args) {
		Shape donut = new Circle(10); // �������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������ " + donut.getArea());

	}

}
