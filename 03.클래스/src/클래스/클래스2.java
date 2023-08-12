package 클래스;

public class 클래스2 {

		
		/* 생성자
		 * 클래스에 선언하는 메서드 중 하나
		 * 일반 메서드와 차이
		 * 1. 인스턴스 생성시 자동으로 호출
		 * 2. 반환값 X
		 * 3. 클래스 이름과 같다. 
		 * 4. 이름이 대문자로 시작
		 */
		
		public class Member{
			private String name;
			private int age;
			public Member() {
			}
			public void setName(String name) {
			}
		}
		
		
		/* Member()는 리턴타입이 없고 메서드 이름이 대문자로 시작한다
		 * 제어자   리턴타입 x          매개변수 생략o
 		 * public            Member (         ) {
		 * 	메서드 본문
		 * }
		 * 이러한 선언을 생성자라고 한다
		 * 
		 * 생성자의 특징
		 * 1. 메서드의 형태
		 * 2. 리턴타입을 선언하지 않는다
		 * 3. 소속된 클래스의 이름과 같다
		 * 4. 필드의 초기화를 담당한다
		 * 5. 인스턴스 생성 시 자동으로 호출된다
		 * 
		 * 생성자의 사용 목적
		 * - 인스턴스가 생성될 때 필드를 초기화하기 위한 것
		 * 생성자는 일반 메서드 처럼 자유롭게 호출하는 것이 아니라
		 * 인스턴스가 생성될 때 자동으로 호출된다.
		 * 
		 * [생성자 선언]
		 * 접근 제한자 클래스명(매개변수){
		 * 실행문;
		 * }
		 * 
		 * [생성자 실행]
		 * new Member();
		 * 
		 * new - 힙에 멤버변수 생성, 생성자 호출
		 * Member - 호출되는 생성자
		 * 
		 * new 클래스();
		 * 필드의 값 설정 
		 * 메소드 호출해 객체를 사용할 수 있도록 준비하는 역할 수행
		 * 
		 * 기본 생성자(Default Counstructor)
		 * public 클래스(){}
		 * 모든 클래스는 생성자가 반드시 존재하며 하나 이상 가질 수 있음
		 * 생성자 선언을 생략하면 컴파일러는 다음과 같은 기본 생성자 추가
		 * 
		 * 디폴트 생성자
		 *  클래스 작성시 생성자를 만들지 않으면 자동을 메소드가 비어있는 생성자가 만들어진다
		 *  이것이 디폴트 생성자(default constructor)이다
		 *  몸체가 비어 있기 때문에 실행결과에 아무런 영향을 끼치지 않는다.
		 *  
		 *  소스파일 (Car.java)
		 *  public class Car{
		 *  }
		 *         ↓
		 *  바이트 코드 파일 (Car.class)
		 *  public class Car{
		 *  	public Car(){  자동추가
		 *  	}
		 *  }
		 *  Car myCar = new Car();
		 */
		

//		class Car{
//			private int speed; // 속도
//			private int gear;  // 기어
//			private String color; // 색상
//		}
//		
//		public class Car2{  // 디폴트 생성자 public Car(){}
//			public static void main(String[] args) {
//				Car2 c = new Car2();
//			}
//		}
		
		/* 생성자(Constructor)
		 * [생성자 선언]
		 * - 디폴트 생성자 대신 개발자가 직접 선언
		 * 접근 제한자 클래스(매개변수, 매개변수..){
		 *	// 필드의 초기화 코드
		 *}
		 *
		 * 개발자가 선언한 생정자 존재 시 컴파일러는 기본 생성자 추가하지 않음
		 * public class Car{
		 * 		private String model;
		 * 		private String color;
		 * 		private int maxSpeed;
		 * 
		 *  	public Car(String model, String color, int maxSpeed){
		 *  		...
		 * 		}
		 * }
		 * Car myCar = new Car("그랜저","검정",300);
		 */
		
//		class Car3{
//			private int speed;   // 속도
//			private int mileage  // 주행거리
//			private String color; // 색상
//			public Car3 (int s, int m, String c) {
//				speed = s;
//				mileage = m;
//				color = c;
//			}
//		}
//		
//		public class CarTest{
//			public static void main(String args[]) {
//			//	Car3 c1 = new Car ();
//				Car3 c2 = new Car (1, 10, "red");
//			}
//		}
		
		/* 
		 * 필드 초기화
		 * - 초기값 없이 선언된 필드는 객체가 생성될 때 기본값으로 자동 설정
		 * 
		 * 다른 값으로 필드 초기화 하는 법
		 * - 필드 선언할 때 초기값 설정
		 * - 생성자의 매개값으로 초기값 설정
		 * Address a1 = new Address("홍길동", "010-3425-7854");
		 * Address a2 = new Address("김철수", "010-8624-1364");
		 * 매개 변수와 필드명 같을 경우 this 사용
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
