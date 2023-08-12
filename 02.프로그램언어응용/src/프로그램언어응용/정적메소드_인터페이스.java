package 프로그램언어응용;

/* [정적 메소드 선언]
 * public static 리턴타입 메서드명(매개변수,...){
 * 	...
 * }
 * 
 * static으로 선언된 메서드는 프로그램 시작 시 메모리에 사용 준비가 완료되므로 인스턴스 생성과 상관없이 바로 사용할 수 있다.
 * 인터페이스에 static 메서드를 선언하는 목적은 
 * 해당 인터페이스를 구현하고 있는 모든 객체에서 자주 사용하는 유용한 기능을 제공하는데 있다.
 * 
 * interface TestA {
 * 		public static int getValue(){
 * 			return 123;
 * 		}
 *}
 * interface TestB {
 * 		public static int getValue(){
 * 			return 456;
 * 		}
 * }
 * 
 * class TestD implements TestA, TestB{
 * }
 * public class interfaceTest{
 * 		public static void main(String[] args){
 * 			 이거랑
 * 			sysout(TestD.getValue());
 * 			이거는 다름 어떻게 다른겆...
 * 			sysout(TestA.getValue());
 * 			sysout(TestB.getValue());
 * 		}
 * }
 * 
 * 
 * private 메소드 선언
 * -자바 9에서 추가된 인터페이스의 새로운 멤버
 * private 리턴타입 메서드명(매개변수,...){
 * 		...
 * }
 * 접근 제한자를 private으로 선언한다는 의미는 외부에서 접근할 수 없도록 접근 권한을 제한하는 것
 * private 메서드는 동일한 인터페이스에 선언된 default 메서드에서만 사용할 목적으로 본문을 구현하는 메서드이다.
 * 
 * ex)
 * private void log(){
 * 		sysout("start log");
 * }
 * public default void setLogin(boolean login){
 * 		log();
 * }
 * 
 * 같은 인터페이스에 선언한 static메서드에 private 메서드를 사용하려면 static을 선언해야한다.
 * ex)
 * private void log(){
 * 		sysout("start log");
 * }
 * public default void setLogin(boolean login){
 * 		log();
 * }
 * 같은 인터페이스에 선언한 static메서드에서 private 메서드를 사용하려면 static을 선언해야 한다.
 * 
 * [인터페이스의 활용]
 * 하나의 클래스는 오직 하나의 클래스만 상속 받을 수 있다.
 * 하지만 클래스는 상속과 동시에 여러 개의 인터페이스를 구현할 수 있다.
 * 여러 인터페이스를 구현하기 위해서는 클래스 정의시에 
 * 키워드 implements 다음에 콤마(,)로 분리된 인터페이스 이름을 적으면 된다
 * 
 * class 자식클래스 extends 부모클래스 implements 인터페이스명1, 인터페이스명2 {...}
 * class Sub extends Super implements Interface1, Interface2 {
 * 		...
 * }
 * 부모클래스를 상속받고 인터페이스 2개를 구현할 수 있는 클래스. 
 * 
 * ex)
 * <부모 클래스>
 * class Shape{  // 도형을 만드는 클래스
 * 		protected int x,y;
 * }
 * 
 * <인터페이스>
 * interface Drawable { // 구현할 수 있게 만드는 인터페이스
 * 		public abstract void draw();
 * }
 * 
 * <부모클래스를 상속받고 인터페이스를 구현할 수 있는 클래스> 사각형 = 도형ㅇ
 * public class Rectangle extends Shape implements Drawable { // 사각형을 만드는 클래스
 * 		int width, height;  
 * 		public void draw() {   // 재정의
 * 			sysout("사각형 그리기");
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
 * 
 * 
 * 
 * 
 * 
 * 
 */
