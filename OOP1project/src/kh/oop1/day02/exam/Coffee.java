package kh.oop1.day02.exam;

public class Coffee {

	// ī��
	// 1. �޴����� Hot �Ƹ޸�ī�� / Iced �Ƹ޸�ī��
	// 2. �ֹ� ����
	// [ �Ӽ��� ] 
	// private String hotAmericano;  // Hot�Ƹ޸�ī��
	// private String icedAmericano; // Iced �Ƹ޸�ī��
	
	private String americano; // �Ƹ޸�ī��
	// ī���
	private char temperatureType; // Y : hot, N : Iced
	private String size; // ������ ������
	
	// [ ������ ] �� ���� �˾Ƽ� ������
	public Coffee() {}
	
	// getter
	public String getAmericano() {
		return americano;
	}
	
	public char getTemperatureType() {
		return temperatureType;
	}
	public String getSize() {
		return size;
	}
	
	// setter
	public void setAmericano(String americano) {
		this.americano = americano;
	}
	public void setTemperatureType(char temperatureType) {
		this.temperatureType = temperatureType;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	// [ ��� ���� ] - �޼ҵ�
	public void orderCoffee() {
		System.out.println("Ŀ�� �ֹ�");
	}
}

// �ϳ��� Ŭ�������� �ϳ��� public�� ���� ����
class CoffeeMachine {  // (default) ���������� ���
	
	// ��� ����
	public String str1;
	
	// �޼ҵ�
	public void machine() {
		
	}
	
	
	
	
}