package Ŭ����;

public class Car {
	
	// �ʵ� ����
	public int speed; // �ӵ�
	public int gear;  // ��� �� ��
	public String color;  // ����
	
	public void carData(int s, int g, String c) {
		// �ʵ忡 �� ����
		speed = s;
		gear = g;
		color =c;
	}
	
	// �޼��� ����
	public void speedUp (int s) { // �ӵ� ���� �޼ҵ� , s: �Ű�����
		speed += s;   // speed + s = speed;
	}
	
	public void speedDown(int s) {	// �ӵ� ���� �޼ҵ�
		speed -= s;   // speed - s = speed;
	}
	
	
	// ��ü�� ���¸� ���ڿ��� ����ϴ� �޼ҵ�
	public void printData() {
		System.out.println("�ӵ�: " + speed + "���: " + gear + "���� : " + color);
	}
	
	
	// ��ü�� ���¸� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String toString() {
		return "�ӵ�: " + speed + "���: " + gear + "���� : " + color;
	}
	
	
	
	
}
