package Ŭ����;

// CarTest ���� 
public class CarTest {
	public static void main(String[] args) {
	// Ŭ������ �������� = new Ŭ������();
		 Car  myCar  = new Car(); // ��ü ����, �޸� ���� �Ҵ�
		
		// �ʵ忡 �� ����
//		myCar.speed = 0;
//		myCar.gear = 1;
//		myCar.color = "RED";
		
		
		myCar.carData(0, 1,"RED");
//		CarŬ������ 
//		public void carData(int s, int g, String c) {
//			// �ʵ忡 �� ����
//			speed = s;
//			gear = g;
//			color =c;
//		}
// 		�̰� ���ؼ� ���� ���� �Է��� �� �ִ�.
		
		// �޼ҵ� ȣ��
		myCar.speedUp(20);
		myCar.printData();				// ��¹�� 1
		System.out.println(myCar.toString()); // ��¹�� 2
	 // System.out.println("�ӵ�: " + speed + "���: " + gear + "���� : " + color);
		
		System.out.println();

		// �� ��° ��ü ����
		Car yourCar = new Car();
		
//		���� �ʱ�ȭ�ϴ� ���1
//		yourCar.gear = 3;                                                                                                                                            
//		yourCar.speed = 60;
//		yourCar.color = "BLUE";
		
		// ���2
		yourCar.carData(3, 60, "BLUE");
		
		yourCar.speedDown(40);
		yourCar.printData();		// ��¹�� 1
		System.out.println(yourCar.toString()); // ��¹�� 2
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
