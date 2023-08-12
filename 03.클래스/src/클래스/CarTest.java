package 클래스;

// CarTest 실행 
public class CarTest {
	public static void main(String[] args) {
	// 클래스명 참조변수 = new 클래스명();
		 Car  myCar  = new Car(); // 객체 생성, 메모리 공간 할당
		
		// 필드에 값 설정
//		myCar.speed = 0;
//		myCar.gear = 1;
//		myCar.color = "RED";
		
		
		myCar.carData(0, 1,"RED");
//		Car클래스의 
//		public void carData(int s, int g, String c) {
//			// 필드에 값 설정
//			speed = s;
//			gear = g;
//			color =c;
//		}
// 		이걸 통해서 값을 쉽게 입력할 수 있다.
		
		// 메소드 호출
		myCar.speedUp(20);
		myCar.printData();				// 출력방법 1
		System.out.println(myCar.toString()); // 출력방법 2
	 // System.out.println("속도: " + speed + "기어: " + gear + "색상 : " + color);
		
		System.out.println();

		// 두 번째 객체 생성
		Car yourCar = new Car();
		
//		값을 초기화하는 방법1
//		yourCar.gear = 3;                                                                                                                                            
//		yourCar.speed = 60;
//		yourCar.color = "BLUE";
		
		// 방법2
		yourCar.carData(3, 60, "BLUE");
		
		yourCar.speedDown(40);
		yourCar.printData();		// 출력방법 1
		System.out.println(yourCar.toString()); // 출력방법 2
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
