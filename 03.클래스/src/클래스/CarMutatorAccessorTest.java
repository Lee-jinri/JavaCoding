package 클래스;

public class CarMutatorAccessorTest {

	public static void main(String[] args) {
		CarMutatorAccessor myCar = new CarMutatorAccessor();
		
		// 값 설정 set
		// myCar.color = ""; // public 명시
		myCar.setColor("RED");
		myCar.setGear(1);
		myCar.setSpeed(-70);
		
		// 접근자 메소드 호출
		System.out.println("==== 접근자 메소드 호출 필드 출력 ====");
		System.out.println("현재 자동차의 색상 : " + myCar.getColor());
		System.out.println("현재 자동차의 기어 : " + myCar.getGear());
		System.out.println("현재 자동차의 속도 : " + myCar.getSpeed());
		
		System.out.println();
		
		System.out.println("==== toString() 메소드로 전체 필드 출력 ====");
		System.out.println(myCar.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
