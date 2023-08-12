package orange2;

class Car {
	int gasolineGauge; // 가솔린 잔여량

	// 생성자
	public Car(int gas) {
		gasolineGauge = gas;
	}
}

class HybridCar extends Car{
	int electricGauge;
	
	// 생성자
	public HybridCar(int gas, int ele) {
		super(gas);
		electricGauge = ele;
	}
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	// 생성자
	public HybridWaterCar(int gas, int ele, int wat) {
		super(gas, ele);
		waterGauge = wat;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터량: " + waterGauge);
	}
}
