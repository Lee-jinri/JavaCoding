package Abstract_class2;

//�߻� Ŭ���� (�����̶�� �������� ������)
abstract class Shape {
	int x, y;
	
	public void move(int x, int y) {  // x,y�� ��ġ�� �����̴� �޼ҵ�
		this.x = x;
		this.y = y ;
	}
	
	// �߻� �޼��� : ����θ� ����, ���Ǻ� X
	public abstract void draw();  // ������ �׸��� �޼���
}

//�߻� �޼��带 ����ϴ� Ŭ���� 1 (�簢�� ���� �����)
class Rectangle extends Shape {	  // �߻�Ŭ���� ���
	int width, height;
	
	public void draw() {		  // �߻�޼ҵ带 ������
		System.out.println("�簢�� �׸��� �޼ҵ�");  
	}
}

//�߻� �޼��带 ����ϴ� Ŭ���� 2 (�� ���� �����)
class Circle extends Shape {	 // �߻�Ŭ���� ���
	int radius; 
	
	public void draw() {		 // �߻�޼ҵ带 ������
		System.out.println("�� �׸��� �޼ҵ�");
	}
}

// ��� Ŭ����
public class AbstractShapeTest {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();   	// �簢�� �ν��Ͻ�
		r.draw();
		
		Circle c = new Circle();			// �� �ν��Ͻ�
		c.draw();
		
//		Shape s = new Shape();   // ����, �߻� Ŭ������ �ν��Ͻ� ������ �Ұ����ϴ�

	}
}



