package 클래스;

public class 클래스 {

	public static void main(String[] args) {
		
//		package 패키지명;
//		
//		import 패키지명.클래스명;

		
//		1.	
//		접근제한자 class 클래스명 {
//			
//			필드 정의
//			접근제한자 자료형 필드명;
//			접근제한자 자료형 필드명;
//			
//			메소드 정의
//			접근제한자 리턴타입 메서드명(매개변수) {
//		}
//	}

				
		
//		2.
//		명령 프롬프트에서 패키지 실행 + (생성..?)
//		
//		javac -d.Test.java
//		-d 는 directory를 의미한다 
//		실행파일을 생성할 디렉토리를 직접 지정하겠다
//		.은 현재 디렉토리를 의미한다
//		
//		java com.kh.java.test.Test
//		
//		java com.kh.java.test.Test
				
			
		
//		3.
//		클래스 임포트
//		
//		사용하려는 객체를 사용할 때 다른 패키지에 있는 경우
//		어디에 속해있는지 소스 파일에 표시해 주어야 한다.
//		그 때 사용하는게 import이다
//		
//		import 패키지망[.하위 패키지만].클래스명;
//		or
//		import 패키지명[.하위 패키지명].*;   * -> 하위 패키지의 모든 클래스를 참조한다. 
		
		
//		4.
//		이름		국어 		영어 		수학
//		홍길동 	90		100		955
//		김철수 	90		80		95
//		
//		class Score {
//			public void
//		}
		
		
		
//		5
//		public class Car {
//			
		
//			필드 정의
//			public in t speed;
//			public int gear;
//			public String color;
//			
		
//			메소드 정의
//			public void speedUp() {
//				speed += 10; }
//			public void speedDown() {
//				speed -= 10;}
//			public void printData() {
//				System.out.println("속도: " + speed + "기어: " + gear + "색상: " + color);
//			}

		
//			public String toString() {
//				return "속도: " +speed+"기어: "+gear+"색상: "+color; 
//			}
//		}
		
//		6
//		객체 : 속성과 행동으로 구성되어 있는 하나의 단위
//		-> 우리가 전산화하려는 궁극적인 실체
		
//		클래스 : 자바 소스 파일에서 class Book{}형태로 객체를 표현한 것
//		-> 객체를 만드는 설계도
		
//		인스턴스 : 클래스를 new 명령문(메모리 할당 연산자)으로 메모리에 생성한 객체
//		-> 설계도로 만든 독립적인 객체
//		같은 클래스를 통해 생성한 객체 하나하나를 인스터스라고 한다
//		인스턴스는 사전적인 의미로 '예','사례'라는 뜻이 있다.
//		즉, 클래스라는 설계도를 가지고 하나의 사례로서 만든 독립적인 실체를 인스턴스라고 표현
		
//		객체는 우리가 프로그래밍으로 표현하려는 실체이고
//		클래스는 이러한 실체를 추상화한 설계도이며
//		클래스를 인스턴스화하면 객체가 생각된다고 할 수 있다. (?)

//		7
//		객체 생성
//		Car myCar;
//		myCar = new Car();
//				    생성자
//		참조 변수 선언 : Car타입의 객체를 참조할 수 있는 변수 myCar를 선언한다.
//		객체 생성 : new 연산자를 이용하여 객체를 생성하고 객체 참조값을 반환한다 
//		(클래스의 구성을 참조해 속성과 메소드에 대한 정보를 메모리에 할당하는 작업)
//		참조 변수와 객체의 연결 : 생성된 새로운 객체의 참조값을 myCar라는 참조 변수에 대입한다.
//				
//		new 연산자
//		1. 객체를 저장할 힙 메모리의 할당
//		2. 생성자 호출
//		3. 할당하고자 하는 객체의 힙 주소값을 참조값으로 변환 후 반환
		
				
//		8
//		필드 사용
//		필드 값을 읽고, 변경하는 작업을 말한다
		
//		필드 사용 위치
//		클래스 내부 : "필드이름"으로 접근
//		클래스 외부 : "변수.필드이름"으로 접근

		
//		9
//		메소드 호출
//		메소드는 클래스 내,외부의 호출에 의해 실행
//		클래스 내부 : 메소드 이름으로 호출
//		클래스 외부 : 객체 생성 후, 참조 변수를 이용해 호출
	
		
//		10
//		설정자와 접근자
//		일반적으로는 클래스의 필드를 비공개(private)로 선언한다. -> 필드에 접근해서 데이터 변경 불가
//		(외부에서 값을 변경할 수 없도록 하기 위해, 읽기 전용 필드를 만들어서 보기만 하게 할 수 있음)
//		setter, getter 를 이용하면 검증된 접근만 하도록 할 수 있다.
//		
//		설정자 - Setter
//		필드의 값을 설정하는 메소드
//		
//		setFieldName(매개변수) 메소드
//		
//		접근자 - Getter
//		필드의 값을 반환하는 메소드
//		
//		getFieldName() 메소드
		
		
//		접근자와 설정자 사용의 이점
//		1) 설정자에게 매개변수를 통하여 잘못된 값이 넘어오는 경우를 사전에 차단할 수 있다.
//		2) 필요할 때마다 필드값을 계산하여 반환할 수 있다.
//		3) 접근자만 제공하면 읽기전용 필드를 만들 수 있다. 
		
//		public class 클래스이름{
//			private int speed;
//			public int getSpeed() {  // 필드값을 반환한다
//				return speed;
//			}
//			public void setSpedd(int s) {  // 필드에 데이터를 설정한다
//				if (s > 0)
//					speed = s;
//				else 
//					speed = 0;
//			}
//		}
//		
		
		// this
		
//		객체(인스턴스) 자신의 참조주소를 가지고 있는 키워드
//		현재 실행중인 인스턴스의 주소를 가리키는 키워드
//		객체 내부에서 인스턴스 멤버임을 명확히 하기 위해 this. 사용
//		맴개변수와 필드명이 동일할 때 인스턴스 필드임을 명확히 하기 위해 사용
		
//		public class Book{
//			private String title;
//			
//			public void setTitle(String title) {
//				this.title = title;
//			}
//
//		=========================================================
//		
//			public class Book{
//				private String bookNumber;
//				
//				public void setBookNumber(String bookNumber) {
//					this.bookNumber = bookNumber;   
//					
//				}
//				public String getBookNumber() {
//					return bookNumber;
//				}
//			}
//	
		
		
		// 메서드
			
//		클래스에서 객체의 동작을 표현한 것
//		동작을 위한 실행문을 포함
//			
//		[메서드 선언]
//		제어자 반환타입 메소드명 (매개변수) {
//			실행문
//			}
//		
//		제어자 : 접근제한자 (private, default, protected, public) 와 final, static, abstract
//		반환타입 : 해당 메소드가 실행된 다음 돌려주는 값의 타입
//		         돌려주는 값이 없으면 void
//		메소드명 : 보통 첫 글자를 소문자로 시작하고 메소드의 기능을 나타낼 수 있는 이름으로 지정
//		매개변수 : 메소드가 실행될 때 함께 전달되는 값을 저장하는 변수
//		실행문 : 메소드가 어떻게 동작하는지 나타내는 명령문
			
//		메소드는 반복적으로 실행하고자 하는 명령어들의 집합이다.
//		한 번 선언하면 여러번 호출해서 사용할 수 있다 (코드의 재사용)
//		
//		멤버 메소드는 클래스 내에서 메소드를 말하며 객체가 해야하는 기능을 정의한다
		
//		public int sum(int x, int y)  {  매개변수 : 외부로부터 전달받는 데이터를 저장하는 변수
//			return x + y;   메소드가 값을 반환할 때 return 사용
//		}
//		
//		
//		// [메소드 호출]
//		메소드를 사용하려면 메소드를 호출해야한다.
//		메소드명();
//		
//		// 메소드 실행을 멈추고 값 반환하기
//		
//		(1) return
//		메소드의 실행을 중지하는 명령문.
//		메소드가 수행하는 명령문들을 모두 나열한 다음, 실행을 멈추고 메소드를 호출한 곳으로 되돌아가고 싶을 때 사용
//		
//		[반환값]
//		메소드를 return하면서 특정한 값을 전달할 수 있다.
//		return 값;
//		
//		
//		public boolean takeOff( ) {   // public void는 return값이 없을 때만 사용할 수 있음.
//			System.out.println("엔진 시동");
//			System.out.println("엔진 시동 실패");
//			return false;
//		}
//		
//		매개변수 
//		: 메소드가 호출될 때 함께 전달되는 값을 받아서 처리
//		
//		class MyMathTest{
//			public static void main(String[] arg) {
//				MyMath myMathObj = new MyMath();
//				double avgData = myMathObj.avg(10,20);
//			}
//		}
//		
//		class MyMath{
//			...
//			public double avg(int x, int y)P
//			return ***********추기하기
//					
//		
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}

}
