package basic;
// ĸ��ȭ
/*
 * ���� �ǹ��ϴ� Circle Ŭ������ �����ϼ���.
 * Circle Ŭ������ ��ǥ ���� ��ġ ������ �������� ���� ������ ������ �� �־���մϴ�.
 * main �޼ҵ�� CircleŬ������ �׽�Ʈ�ϼ���.
 * showCircleInfo �޼ҵ� ȣ��� ���� ������ ������� ��, ���� ��ǥ ������ ������ ������ �ݵ�� ��µǵ��� �ϼ���.
 */

// Point Ŭ������ ���� �߽��� ��Ÿ����.

class Point {   // default Ŭ���� : Ŭ���� ����, ���� ��Ű�������� ���� ����
	int xPos, yPos;
	
	public Point(int x, int y) {  // ������ : ��������� �ʱ�ȭ, �޸� �Ҵ��� ���
		xPos = x;  // x��
		yPos = y;  // y��
	}
	
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}
