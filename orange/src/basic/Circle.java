package basic;

public class Circle {
	int rad;		// ������
	Point center; 	// ���� �߽� ��ǥ�� Point Ŭ������ center��� �̸����� ����
	
	public Circle(int x, int y, int r) {  // ������ : ��������� �ʱ�ȭ, �޸� �Ҵ��� ���
		center = new Point(x,y);
		rad = r;
	}
	
	public void showCircleInfo() { // showCircleInfo�� �θ��� �̷��� ��ȯ�ϵ��� ����
        System.out.println("radius: " + rad);
        center.showPointInfo();
    }
}

