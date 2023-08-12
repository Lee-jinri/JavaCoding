package basic;

public class Car {
	int gasolineGauge;  // ���ָ� �ܿ���

	public Car(int oil) {
		gasolineGauge = oil;
	}
}
class HybridCar extends Car{ // ���̺긮�� �ڵ���
	int electricGauge;  // ���� ���͸� �ܿ���

	public HybridCar(int oil,int ele) {
		super(oil);
		electricGauge = ele;
	}
}
class HybridWaterCar extends HybridCar{ // ���̺긮�� ����ī
	int waterGauge; // ������ ��ȯ�� ���� �ܿ���
	
	public HybridWaterCar(int oil, int ele, int water) {
		super(oil, ele);
		waterGauge = water;
		
	}
	
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ�: " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ: " + electricGauge);
		System.out.println("�ܿ� ���ͷ�: " + waterGauge);
	}
}
