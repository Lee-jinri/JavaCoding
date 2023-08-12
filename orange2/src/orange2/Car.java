package orange2;

class Car {
	int gasolineGauge; // ���ָ� �ܿ���

	// ������
	public Car(int gas) {
		gasolineGauge = gas;
	}
}

class HybridCar extends Car{
	int electricGauge;
	
	// ������
	public HybridCar(int gas, int ele) {
		super(gas);
		electricGauge = ele;
	}
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	// ������
	public HybridWaterCar(int gas, int ele, int wat) {
		super(gas, ele);
		waterGauge = wat;
	}
	
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ�: " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ: " + electricGauge);
		System.out.println("�ܿ� ���ͷ�: " + waterGauge);
	}
}
