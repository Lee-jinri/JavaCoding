package 프로그램언어응용;

public class 프로그램언어응용 {

	public static void main(String[] args) {
		
		/* Object 클래스 :
		 * 자바에서는 클래스를 정의할 때 명시적으로 수퍼 클래스를 선언하지 않으면 Object클래스가 수퍼 클래스가 된다
		 * Object 클래스는 java.lang패키지에 들어있으면 자바 클래스 계층구조에서 맨 위에 위치하는 클래스이다.
		 * 
		 * Object 클래스안에 정의되어있는 메소드
		 * public String toString()  : 객체의 문자열 표현을 반환한다.
		 *  toString은 Object의 코드를 재정의(오버라이딩)한 것
		 * 
		 * 
		 * set~() : 선정자
		 * get~() : 접근자
		 * to~()  : 변환
		 * is~()  : 여부 (boolean)
		 * 
		 * 제어자 static - 정적 (다시 보기)
		 * [final 제어자]
		 * final 제어자는 클래스, 필드명, 메서드를 선언할때 제어자 부분에 선언할 수 있다
		 * 값을 고정한다 (값 변경 X)
		 * 
		 * final 클래스
		 * 접근제어자 final class 클래스명 {
		 * 	...
		 * }
		 * 
		 * final 변수
		 * 접근제어자 final 필드명;
		 * 
		 * final 메서드
		 * 접근제어자 final 반환형 메서드명() {
		 * 	...
		 * }
		 * 
		 * 1, final 변수
		 * 일반 클래스 내에 필드의 값을 고정할 때 final을 선언
		 * class Circle{
		 * 		public static final double PI = 3.1415;
		 * 		...
		 * }
		 * 
		 * 목적 
		 * (1) 초깃값을 변경하지않고 고정하기 위해
		 * (2) 파이와 값을 수학적 값을 사용하기 위해
		 * (3) 주민등록번호, 여권번호, 학번같은 유일한 값을 사용하기 위해
		 * 
		 * final 변수를 선언하면서 초깃값을 지정해주거나 선언하면서 초깃값을 지정하지 않은 상태로 생성된 다음, 
		 * 생성자에서 초기화 해주어야하는데 초기화해야 사용할 수 있다.
		 * = 선언과 초기화를 해야 final 변수를 사용할 수 있다.
		 * 
		 * public class Person {
		 * 		private final String SSD_ID;
		 * 		private String name;
		 *		private int age;
		 *		
		 *		public void setSSE_ID(String SSE_ID) {
		 *			this.SSE_ID = SSD_ID;
		 *		}  // 값을 수정할 수 없는데 set을 사용하여 수정을 시도했기 때문에 오류가 난다
		 *
		 *		public Person(String name, int age) {
		 *			this.name = name;
		 *			this.age = age;
		 *		} // 초깃값을 지정하지 않았는데 생성자에서도 초기화하고 있지 않으므로 final변수는 사용할 수 없다 -> 오류
		 * }
		 * 
		 * 2. final 메서드 (종단 메서드)
		 * 메서드를 오버라이딩 할 수 없도록 제한한다.
		 * = final 메서드는 자식클래스에서 메서드 내용을 변경하지 못하게 한다.
		 * 
		 * public class Car {
		 * 		
		 * 		// 필드
		 * 		public int speed;
		 * 		
		 * 		// 메소드
		 * 		public void speedUp() {
		 * 			soeed += 1;
		 * 		}
		 * 
		 * 		// final 메소드 - 오버라이딩 불가 (이 구문을 수정할 수 없다)
		 * 		public final void stop() {
		 * 			system.out ("차를 멈춤")
		 * 			speed = 0;
		 * 	   }
		 * }
		 * 
		 * public class SportsCar extends Car {
		 * 		@Override
		 * 		public void speedUp() {
		 * 			speed += 10;
		 *		}
		 *
		 * 		// 오버라이딩 할 수 없다
		 * 		@Override
		 * 		public void stop() {   // 오류
		 * 			sysotem.out("스포츠카를 멈춤");
		 * 			speed = 0;
		 * 		}
		 * }
		 * 
		 * 
		 * 3, final 클래스 (종단 클래스)
		 * final 클래스는 다른 클래스에서 상속할 수 없다. 
		 * 또한 클래스 내부의 모든 메소드는 재정의 될 수 없다. = 이 클래스를 수정없이 그대로 사용하려는 목적
		 * 
		 * public final class String {
		 * 		...
		 * }
		 * 
		 * 인터페이스와 다형성
		 * 
		 * 추상 (Abstract 키워드)
		 * 
		 * 추상의 의미 : 사물이나 개념의 공통되는 특성, 속성을 추출하는 것
		 * ex ) 새, 곤충, 물고기 (실체) -> 동물 (추상)
		 *  	삼성, 현대, LG (실체)  -> 회사 (추상)
		 *  
		 * 메서드를 선언할 때 abstract 키워드를 붙이면 추상메서드가 된다.
		 * 이 때 메서드의 이름과 매개변수, 리턴 타입 등 공통되는 특성만 작성(메서드 선언부만 작성)하고 본문은 X
		 * 
		 * 추상 메서드 선언 : 접근제한자 제어자 리턴타입 메서드명 (매개변수) ; (메서드 선언 O, 메서드 정의 X)
		 * 
		 * 추상 메서드를 포함하는 클래스도 abstract를 붙여서 추상 클래스로 선언해주어야한다.
		 * 이 클래스를 상속받은 클래스는 반드시 추상 메서드를 오버라이딩하여 본문을 구현해야한다.
		 * 
		 *  * 추상 메소드의 재정의 (오버라이딩)
		 * - 메소드 이름은 동일하지만 실체 클래스마다 실행내용이 다른 메소드
		 * ex) 동물은 소리를 낸다.. 하지만 동물(실체)의 소리는 제각기 다르다
		 * - 구현방법
		 * 1. 추상클래스에는 메소드의 선언부만 작성 (추상 메소드)
		 * 2. 실체 클래스에서 메소드의 실행 내용 작성(오버라이딩)
		 * 
		 * 					Animal		  public abstract void sound(); // 메소드 정의만
		 * 				abstract sound(); 소리를 낸다 (무슨 소리인지는 아직 모름)
		 * 		┌─────────────┼──────────────┐
		 *  	Dog							Cat
		 * sound(){...}					sound(){...}
		 * 소리낸다 : 멍멍					소리낸다 : 냥냥
		 *		  {} 중괄호 사용하여 내용 재정의
		 * 
		 * 
		 * [추상 클래스(Abstract Class)]
		 * 추상 클래스 = 필드 + 일반 메서드 + 추상 메서드
		 * 
		 * 실제 클래스들의 공통되는 필드와 메소드를 정의한 클래스
		 * 추상 클래스는 실체 클래스의 부모 클래스 역할 (단독 사용목적 X)
		 * 실체 클래스 : 객체를 직접 생성할 수 잇는 클래스
		 * 
		 * 					Animal.class (움직인다)			-- 추상 클래스
		 * 		┌────────────────┼──────────────────┐			↑상속
		 * Bird.class		 Insert.class		Fish.class  -- 실체 클래스
		 * 	(난다)			(기어다닌다, 난다)		(헤엄친다)
		 * 
		 * 1. 메서드 선언시 본문을 구현하지 않을 때 사용하는 것
		 * 2. abstract로 선언한 메서드는 메서드 본문을 가질 수 없다.
		 * 3. 추상 메서드를 하나라도 포함한 클래스는 추상 클래스이다.
		 * 4. 추상 메서드를 포한하는 클래스는 선언할 때 abstract를 명시해야한다.
		 * 5. 추상 클래스를 상속한 하위 클래스에서 반드시 재정의해야한다.
		 * 6. 추상 클래스는 완전하게 구현되어있지 않으므로 (메소드 미완성) 추상 클래스로는 객체(인스턴스)를 생성할 수 없다.
		 * 
		 * 추상 클래스의 용도
		 * 1, 실체 클래스의 공통된 필드와 메소드의 이름을 통일할 목적
		 * - 실체 클래스를 설계자가 여러 사람일 경우
		 * - 실체 클래스마다 필드와 메소드가 제각기 다른 이름을 가질 수 있음.
		 * 
		 * 2, 실체 클래스를 작성할 때 시간 절약 가능
		 * - 실체 클래스를 추가적인 필드와 메소드만 선언
		 * 
		 * 3, 실체 클래스 설계 규격을 만들고자 할 때
		 * - 실체 클래스가 가져야 할 필드와 메소드를 추상 클래스에 미리 정의
		 *
		 *	추상클래스의 종류
		 *1. 추상 메소드를 하나라도 가진 클래스 (클래스 앞에 반드시 abstract라고 선언해야 함.)
		 *2. 추상 메소드가 하나도 없지만 abstract로 선언된 클래스 
		 * 
		 * 2. 추상 메소드 없는 추상 클래스 * 보통은 안 씀
		 * public abstract class MyComponent {  // 추상클래스 선언, 인스턴스 생성 불가능, 상속관계를 통해서만 표현하겠다.
		 * 	String name;
		 * 	public void load(String name){
		 * 		this.name = name;
		 * 	}
		 * }
		 * 
		 * [인터페이스]
		 * - 클래스와 클래스 사이의 상호작용의 규격을 나타낸 것.
		 * 
		 * 자바의 인터페이스는 메서드를 미리 선언하고, 구현은 비워 놓은 추상 메서드로 만든다.
		 * 즉 인터페이스는 메서드의 헤더를 선언한다. 메서드의 선언만 있다는 것은 무슨 의미일까?
		 * 
		 * 1.메서드의 선언은 그 메서드가 어떻게 입력 받고 어떤 결과값을 반환할 것이라는 사용법을 나타낸다.
		 * 2. 메서드의 선언을 지켜서 구현하라는 약속이다.
		 * - 인터페이스는 여러 프로그램에서 사용할 멤버(필드, 메서드)를 일관되게 하기 위한 기술 명세이다.
		 * 
		 * 아이폰, 갤럭시 프로그램을 개발할 때 
		 * 규칙없이 클래스 구조, 메서드, 변수들을 다르게 구현한다면 사용자도 
		 * 실행되는 플랫폼이 다르니 프로그램 구현은 두가지 형태로 해야한다. 
		 * 
		 * 사용자 ────── 아이폰용 프로그램 ────── 아이폰
		 * 사용자 ────── 갤럭시용 프로그램 ────── 갤럭시
		 * 
		 * 규칙없이 클래스 구조, 메서드, 변수들을 다르게 구현한다면 사용자도 
		 * 실행되는 플랫폼이 다르니 프로그램 구현은 두가지 형태로 해야한다. 
		 * 하지만 플랫폼이 다르더라도 이용법은 일정해야한다.
		 * 
		 * 플랫폼이 달라도 프로그램 사용법이 일정하려면 기준이 있어야한다.
		 * = 인터페이스 통일 *유지보수 용이*
		 * 1. 기능별로 클래스를 정한다.
		 * 2. 기능별로 메서드의 선언부를 정한다.
		 * 3. 기능별로 변수를 정한다.
		 * 
		 * 이 역할을 인터페이스가 해준다.
		 * 
		 * ex) 홈네트워크 시스템
		 * TV ──────   
		 * 				turnOn()	     (홈 네트워크)
		 * 				turnOff()		 (서버	  )
		 * 냉장고 ────        
		 * 
		 * 인터페이스란?
		 * - 개발 코드와 객체가 서로 통신하는 접점
		 *  개발 코드가 인터페이스의 메서드를 호출하면 인터페이스는 객체의 메서드를 호출시킨다
		 *  개발 코드는 인터페이스의 메서드만 알고 있으면 됨.
		 *  
		 *			메소드 호출        메소드 호출
		 * 개발    	───────>   인터   ───────> 객
		 * 코드		<───────  페이스  <─────── 체
		 * 			  리턴값 			  리턴값
		 * 
		 * 
		 * 
		 * 인터페이스의 역할
		 * - 개발코드가 객체에 종속되지 않게 = 객체 교체를 할 수 있도록 하는 역할
		 * - 개발 코드 변경 없이 리턴값 또는 실행 내용이 다양해질 수 있다.
		 * 
		 * 			        			메소드 호출
		 * 						  		───────>  객체
		 *		 	메소드 호출			<───────
		 * 	개발		───────> 	인터		 리턴값 1
		 * 	 코드		<───────	페이스    메소드 호출
		 * 		(리턴값 1또는 리턴값 2) 		───────>
		 *  						    <───────  객체
		 * 			  				      리턴값2
		 * 
		 * [인터페이스 선언]
		 * 추상메서드(public abstract)와 상수(public static final)로 이루어진다
		 * 
		 * 접근제어자 interface 인터페이스명 { 	// 기능별 클래스를 정한다
		 * 		접근제어자 제어자 리턴타입 메서드명(매개변수);  // 기능별 메서드의 선언부를 정한다
		 * 		접근제어자 제어나 자료형 필드명 = 값;		// 기능별 필드를 정한다
		 * }
		 * 
		 * <public static final 생략할 수 있다. : 인터페이스에 선언된 필드는 어차피 모두 상수다!(변할 수 없음) >
		 * <public abstract는 생략할 수 있다.	: 인터페이스 내에는 어차피 추상 메소드만 정의할 수 있기때문에 > 
		 * 
		 * public interface 인터페이스명 {
		 * 		public static final 자료형 변수명 = 값;
		 * 		public abstract 반환형 메소드명1();
		 * 		public abstract 반환형 메소드명2();
		 * }
		 * 
		 * 
		 * 상수 필드 선언
		 * 인터페이스는 객체를 생성할 수 없다. 객체 생성할 수 없는 인터페이스에서 필드를 선언한다는 것은 
		 * 객체 생성과 관계없이 사용할 수 있는 static으로 선언해야한다
		 * 
		 * 1. 인터페이스는 상수 필드만 선언 가능
		 * - 데이터 저장하지 않는다
		 * 
		 * 2. 인터페이스에 선언된 필드는 모두 public static final (누구나 접근하여 사용할 수 있음, 인스턴스 생성없이 사용 가능)
		 * - 자동적으로 컴파일 과정에서 붙음
		 * 
		 * 3. 상수명은 대문자로 작성
		 * - 서로 다른 단어로 구성되어 있을 경우에는 언더바(_)로 연결
		 * 
		 * 4. 선언과 동시에 초기값 지정
		 * - static{} 블록 작성불가, static{}으로 초기화 불가
		 * 
		 * [구현 클래스]
		 * 추상 메소드 선언
		 * -인터페이스를 통해 호출된 메소드는 최종적으로 객체에서 실행
		 * 인터페이스의 메소드는 기본적으로 추상 메소드(선언부O, 구현부X)로 선언
		 * (실제 내용을 구현할 목적이 아니라 인터페이스 통일을 목적으로 선언한는 것이므로 본문을 구현하지 않는다.
		 * public abstract를 생략하더라도 자동적으로 컴파일 과정에서 붙음
		 * (클래스 만들 때 부터 add해서 interface 상속하겠다를 추가 할 수 있음)
		 * 
		 * 인터페이스는 객체를 행성할 수 없다.
		 * 다른 클래스에 구현(implement)하여 사용
		 * 인터페이스를 구현한다는 것은 인터페이스의 추상 메서드를 재정의한다는 의미 (구현 클래스 선언)
		 * 
		 * 주의!
		 * 1. 메서드의 선언부가 일치해야한다. (추상메서드 오버라이딩)
		 * 2. 인터페이스의 모든 추상 메서드를 재정의하여 작성해야한다.
		 * 
		 * 				구현클래스 		  
		 * public class 클래스명 implements 인터페이스명 {
		 * 		반환형 추상메서드1(){ // 재정의 (추상메서드 오버라이딩)
		 * 			실행문 // 꼭 실행문이 필요하지 않음 , 블록을 열고 닫기만 하면 됨
		 * 		}
		 * 		반환형 추상메서드2(){ // 재정의
		 * 		}
		 * }
		 * 
		 * ex) 홈 네트워크 가전 제품들을 원격조정하기 위한 인터페이스를 정의해보쟈
		 * (홈 네트워크 원격조정의 규격을 정합시다)
		 * <인터페이스 클래스>
		 * public interface RemoteControl {
		 * 		public abstract void turnOn();
		 * 		public abstract void turnOff();
		 * } 
		 *	// 인터페이스를 만들면 on off는 무조건 이렇게만 쓰겠다 라는 것
		 * 
		 * 인터페이스에서 메소드는 시그니처(선언부)만 있고 내용이 없으며 세미콜론으로 종료되어야한다.
		 * 인터페이스 안에서 선언된 메소드들은 모두 묵시적으로 public abstract이다. 생략가능~
		 * 
		 * 구현 클래스
		 * public class Television implements RemoteControl {
		 * 		public void turnOn(){
		 * 		 // 실제로 TV의 전원을 켜기 위한 메소드, 메소드 재정의
		 * 		sysout("전원을 킵니다.")
		 * 		}
		 * 		public void turnOff(){
		 * 		sysout("전원을 끕니다.")
		 *		}
		 * 
		 * 실행 클래스
		 * Television t = new Television();
		 * t.turnOn();
		 * t.turnOff();
		 * 
		 * 여러 개의 인터페이스 동시 구현 가능! (부모클래스 여러 개, 자식클래스 1개 ), 인터페이스만 가능하고 추상클래스는 X
		 * public interface SerialCommunication {
		 * 		void send(byte[] data);	// 데이터를 전송한다
		 * 		byte[] receive();		// 데이터를 받는다
		 * }
		 * 
		 * public Television implements RemoteControl, SerialCommunication {  // 쉼표로 1개 2개 구분
		 * 		public void turnOn(){...}		// 리모콘과 시리얼커뮤니케이션 모두 재정의
		 * 		public void turnOff(){...}
		 * 		public void send(byte[] data) {...}
		 * 		public byte[] receive() {...}
		 * }
		 * 
		 * [인터페이스의 상속]
		 * 인터페이스는 인터페이스를 상속할 수 있다.
		 * 이미 다 만들었는데 인터페이스를 수정해야 할 때 사용
		 * 인터페이스를 확장해서 인터페이스를 만들 수 있음
		 * 
		 * 상위 클래스 : class			class			interface		interface
		 * 				│			  │					│				│
		 * 			 extends	 X(상속 안 됨)			implements 		 extends
		 * 				│			  │					│				│
		 * 하위 클래스:  class	      interface			  class			interface
		 * 
		 * 자바 인터페이스의 변화
		 * Java 7까지
		 * - 인터페이스는 상수와 추상 메소드로만 구성
		 * Java 8부터
		 * - 상수와 추상메소드 포함
		 * - default 메소드 포함
		 * - private 메소드 포함
		 * - static 메소드 포함
		 * - 여전히 인터페이스에는 필드(멤버 변수) 선언 불가
		 * 
		 * 디폴트(default) 메소드 선언
		 * public default 리턴타입 메서드명 (매개변수,..){
		 * 	...
		 * }
		 * - 실행 블록을 가지고 있는 메소드이다
		 * - 인터페이스를 구현하는 클래스에 자동 상속되는 메소드이다.
		 * - default 키워드를 반드시 붙여야한다.
		 * - 기본적으로 접근 제한자는 public
		 *   (생략해도 컴파일 할 때 알아서 붙음)
		 * 
		 * ex) 
		 * interface A {
		 * 		public default int getValue(){
		 * 			return 123;
		 * 		}
		 * }
		 * class B implements A { }
		 * public class InterfaceTest
		 * ~~~
		 * 
		 * 두 개의 인터페이스에서 디폴트 메서드가 중복되는 경우 (이름과 동작이 동일)
		 * : 구현클래스에서 실제 사용할 내용을 오버라이딩 해줘야 사용 가능
		 * 
		 * @Override
		 * public void order(){
		 * 		Buy.super.order(); 인터페이스명.super.디폴트명();
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
