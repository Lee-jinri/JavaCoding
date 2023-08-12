package 클래스;

		
		// 정적 변수와 정적 메소드
		
		/* 정적(static) 멤버란?
		 * 클래스에 소속된 멤머
		 * 객체 내부에 존재하지 않고, 메소드 영역(코드 영역)에 존재
		 * 객체를 생성하지 않고 클래스에 바로 접근해서 사용
		 * 
		 * 정적멤버 선언
		 * public class 클래스{
		 *  // 정적필드
		 *  static 자료형 필드;
		 *  
		 *  	 // 정적 메서드
		 * 		public static 리턴타입 메서드(매개변수...)
		 *   }
		 *   
		 *   인스턴스 변수와 정적 변수
		 *   
		 *   인스턴스 변수 : 객체마다 가지고 있어야 할 데이터
		 *   메모리 할당 시점 : 인스턴스 생성시  Car car1 = new Car()
		 *   메모리 할당 위치 : 힙 메모리
		 *   메모리 해제 시점 : 인스턴스 소멸시
		 *   
		 *   정적변수 : 공용적인 데이터
		 *   메모리 할당 시점 : 프로그램 시작시
		 *   메모리 할당 위치 : 코드 메모리
		 *   메모리 해제 시점 : 프로그램 종료시
		 *   
		 *   Public class Calculator{
		 *   	String color;
		 *   	static double PI = 3.141592;  pi값은 객체를 계속 생성해도 값이 바뀌지 않기때문에 객체를 생성할 필요가 없음
		 *   }   
		 */
		
//		class Count {
//			public static int totalCount;  // 클래스 필드
//			public int count;   // 인스턴스 필드
//		}
//		class CountTest{
//			public static void main(String[] args) {
//				System.out.println("main실행 시작");
//				Count c1 = new Count();
//				Count c2 = new Count();
//				Count c3 = new Count();
//			}
//		}

		/* 스택 : main   c1 &주솟값 
		 *  			c2 &주솟값
		 *   			c3 &주솟값
		 *   				↓
		 * 힙   : totalCount &주솟값, count 0 
		 * 		  totalCount &주솟값, count 0 
		 * 		  totalCount &주솟값, count 0
		 * 				    ↓
		 * 메소드 영역 : totalCount 0
		 * 인스턴스가 공유해서 사용하기 때문에 totalCount는
		 * 
		 * 클래스 로더는 main() 메소드가 시작되기 전에 로딩된 모든 클래스를 살펴보고  
		 * static 선언된 정적 멤버를 메모리의 코드 영역에 할당
		 */
		
//		class Car{
//			private int speed;
//			private int gear;
//			private String color;
			
			// 실체화된 Car 객체의 개수를 위한 정적 변수
//			private static int numberOfCars = 0;  // 정적 멤버
//			
//			public Car(int speed, int gear, String color) {
//				this.speed = speed;
//				this.gear = gear;
//				this.color = color;
//				++numberOfCars;
//			}
//		}

		/* 
		 * 클래스 필드를 사용할때는 참조변수가 필요벗다
		 * [클래스 필드 사용]
		 * 클래스명.필드명
		 */
		
	/* 정적 메소드(static method)
	 * 변수든 메서드든 static이 선언되면 무조건 main() 메서드가 실행되기 전에 코드 메모리 영역에 생성되어 사용준비가 완료된다.	
	 * 인스턴스 생성과 무관하게 사용하는 메서드는 static으로 선언한다
	 * 프로그램 시작 시 자동으로 사용 준비 완료
	 * 
	 * 
	 	* [클래스 메서드 사용]
	 	* 클래스명.메서드명();
	 	*/
		// ex)
//		double value = Math.random();
//		int result = Math.max(3, 7);
//		String.format(null, args);
//		
		/* [정적 멤버 사용]
		 * 클래스이름과 함께 도트(.)연산자로 접근
		 */
//		public class Calculator{
//			public static final double PI = 3.141592;
//			public static int plus(int x, int y) {return x + y;}
//			public static int minus(int x, int y) {return x - y;}
//		}
		// O
//		double result = 5*5*Calculator.PI;
//		int resutl2 = Calculator.plus(3,9);
//		int result3 = Calculator.minus(7,2);
		
		// X
		// Calculator c = new Calculator(); 
		// 이미 공간을 받았기 때문에 new 안 해도 됨
		
		/*
		 * 정적 메소드는 객체가 생성되지 않는 상태에서 호출되는 메서드이다.
		 *
		 * static main() 이렇게 쓰는이유
		 * : JVM에서 객체를 생성할 필요없이 main()을 사용하기 위해
		 * 
		 * - 인스턴스 변수와 인스턴스 메소드 사용 X
		 * - 정적 변수와 지역변수만을 사용
		 * - 정적 메소드에서 정정 메소드를 호출하는 것 O
		 * - 정적 메소드는 this사용 불가
		 *  : this가 참조할 인스턴스가 없기 때문에
		 */
		
		// ex
//		public class Test{
//			public static void main(String args[]) {
//				add(10,20);
//			}
//		}
		
//		public int add(int x, int y) {      이건 불가능
//			return x + y;
//		}
		
//		public static int add(int x, int y) {
//			return x+y
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
