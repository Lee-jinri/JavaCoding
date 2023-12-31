package basic;

public class Car {
	int gasolineGauge;  // 가솔린 잔여량

	public Car(int oil) {
		gasolineGauge = oil;
	}
}
class HybridCar extends Car{ // 하이브리드 자동차
	int electricGauge;  // 전기 배터리 잔여량

	public HybridCar(int oil,int ele) {
		super(oil);
		electricGauge = ele;
	}
}
class HybridWaterCar extends HybridCar{ // 하이브리드 워터카
	int waterGauge; // 에너지 전환용 물의 잔여량
	
	public HybridWaterCar(int oil, int ele, int water) {
		super(oil, ele);
		waterGauge = water;
		
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터량: " + waterGauge);
	}
}
