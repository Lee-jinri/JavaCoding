package 예외;

public class 예외2 {

	public static void main(String[] args) {
		
		/*
		 * [사용자 정의 예외 클래스 선언]
		 * class 예외 클래스명 extends [Exception | RuntimeException]{
		 * 	public 예외클래스명(){}
		 * 	public 예외클래스명(String message){
		 * 		super(message);   // 부모 생성자 호출
		 * 	}
		 * }
		 * 
		 * - 자바 표준 API에서 제공하지 않는 예외
		 * - 애플리케이션 서비스와 관련된 예외
		 * 	ex) 잔고 부족 예외, 계좌이체 실패 예외, 회원가입 실패 예외 등
		 * 
		 * 예외 객체는 예외 상황에 JVM이 자동으로 객체를 생성한다.
		 * 하지만 사용자 정의 예외 객체는 프로그램 내에서 예외 상황과 예외 객체 생성을 처리해주어야한다.
		 * 예외 상황은 조건문으로 처리하고 예외 객체 생성은 throw문으로 할 수 있다.
		 * 
		 * [사용자 정의 예외 발생 시키기]
		 * 1. 코드에서 예외 발생시키는법
		 * -throw를 사용한다 (의도적으로 사용자 정의 예외를 만든후 예외를 사용자가 발생시킬 때)
		 * 
		 * throw new 예외클래스명();
		 * throw new 예외클래스명("출력 메시지");
		 * 
		 * public void method() throws 예외클리스명{
		 * 		throw new 예외클래스명();  -> 호출된 곳에서 예외 
		 * }
		 * 
		 * [사용자 정의 예외 정의하기]
		 * class MyException extends Exception {
		 * 		public MyException(String msg){
		 * 			super(msg);
		 * 		}
		 * }
		 * 
		 * [사용자 정의 예외 던지기]
		 * 
		 * 
		 * 해제작업을 할 때 if문이랑 같이 써야함 
		 * 연결이 안됐는데 해제하겠습니다 하면 안되고
		 * 
		 * [자동으로 해제 작업하기 (리소스 닫기)]
		 * try - with - resources 
		 * - 문장의 끝에서 리소스들이 자동으로 닫히게 한다. -> 리소스객체 close() 메소드 호출
		 * 
		 * try(리소스자료형1 참조변수 = new 리소스자료형1();
		 * 		리소스자료형2 참조변수 = new 리소스자료형2()){
		 * 	...
		 * } catch (예외타입변수){
		 * 	...
		 * }
		 * 
		 * [예외처리 전략]
		 * 1, 예외 클래스를 정의하고 언제, 어디서 던지고, 잡아서 처리할 지를 결정한다
		 * 2, 비즈니스 로직에 전념하고 예외 처리가 필요한 곳에서 주석으로 예외처리를 표시한다.
		 * 3, 예외 처리가 필요한 곳(주석 처리 부분)에 실제로 에러 처리 코드를 삽입한다.
		 * 
		 * [패키지 생성]
		 *   패키지 문을 사용하지 않은 경우 디폴트 패키지에 속하게 된다.
		 * 디폴트 패키지
		 * - package 선언문이 없이 만들어진 클래스의 패키지
		 * - 디폴트 패키지는 현재 디렉터리
		 * 패키지 이름은
		 * 1. 일반적으로 소문자
		 * 2. 인터넷 도메인 이름을 역순으로 사용한다.
		 * 3. 자바 언어 자체의 패키지는 java나 javax로 시작한다.
		 * 
		 * [패키지 사용]
		 *  서로 다른 패키지 안에 들어 있는 클래스나 인터페이스를 사용하는 방법
		 *  1. 클래스에 패키지 이름을 붙여서 참조한다.
		 *   graphics.Circle obj = new graphics.Circle();
		 *  
		 *  2. 개별클래스를 import한다.
		 *   import graphics.Circle;
		 *   Circle obj = new Circle();
		 *  3. 전체 클래스를 import한다.
		 * 	 import graphics.*;  // .*; 모든 클래스를 참조하겠다.
		 * 	 Rectangle objRe = new Rectangle(); 
		 * 	 Circle obj = new Circle();
		 *  4. 계층 구조의 패키지 포함하기
		 *   import java.awt.*; 
		 *   하위 클래스, 하위 인터페이스는 포함하지만 하위 패키지의 대상은 포함이 안된다.
		 *   java - awt - font 라면 awt만 포함하고 font는 포함 되지 않는다
		 *   java.awt.font해야 font도 사용 가능
		 *  5. 정적 import문장
		 *   클래스 안에 정의된 정적 상수나 정적 메소드를 사용하는 경우에 일반적으로 클래스 이름을 앞에 적어줘야한다.
		 *   int val = Math.max((int)(Math.random()*10)+1, 5);
		 *   
		 *   하지만 정적 import 사용하면 클래스 이름을 생략하여도 된다.
		 *   import static javja.lang.Math.*;
		 *   int val = max((int)(random()*10)+1.5);
		 * 
		 * [소스파일 배포]	 
		 * 소스파일을 배포할 때는 클래스 파일을 압축한 JAR파일을 배포하면 된다.
		 * -JAR 압출 파일(.jar)
		 * 클래스 파일을 JAR(Java archive)파일로 저장한다.
		 * JAR 파일은 여러 개의 클래스 파일을 압축해서 갖고 있는다.
		 * 
		 * [자바에서 지원하는 패키지]
		 * 라이브러리는 여러가지 기능을 제공하는 파일이다.
		 * 자바에서는 라이브러리 대신에 API라는 용어를 사용한다.
		 * 자바 API는 JDK에 포함되어 있다.
		 * Java SE의 API는 JDK - jmods 폴더에 jmod 파일형태로 저장되어있다. 
		 * jmods는 모듈 파일 (관련있는 여러 자바 패키지를 하나로 묶어 놓은 단위)
		 * 모듈을 구성하는 패키지에는 여러 개의 자바 클래스 파일(*.class) = API가 존재한다.
		 * 
		 * [API 문서]
		 * - API를 편리하게 사용할 수 있도록 API문서를 제공한다.
		 * - 웹 브라우저로 바로 볼 수 있음.
		 * 
		 * <자바에서 지원하는 패키지>
		 * 덜 씀ㅁ
		 * java.lang 패키지
		 *  - 자바 프로그램의 기본적인 클래스를 담은 패키지.
		 *  - 자동으로 import됨
		 *  
		 *  <java.lang에 포함된 클래스>
		 *  Object클래스 : 모든 클래스의 최상위 클래스
		 *  Math 클래스 : 각종 수학 메서드(최대값, 최소값, 난수)들을 포함하는 크래스
		 *  Wrapper 클래스 : 기본 자료형(기초형)에 대응된 클래스
		 *  			   - 기본 타입의 데이터를 갖는 객체를 만들 때 사용
		 *  			   - 문자열을 기본 타입으로 변환할 때 사용
		 * String 클래스 : 문자열을 저장하고 여러가지 정보를 얻을 때 사용하는 클래스
		 * System 클래스 : 표준 입출력 클래스
		 * 				 - 표준 입력 장치(키보드)로부터 데이터를 입력 받을 때 사용 (Sustem.in)
		 * 				 - 표준 출력장치(모니터)로 출력하기 위해서 사용	 (System.out)
		 * 
		 * <java.util 패키지에 포함된 클래스>
		 * Arrays 클래스 : 배열을 조작(비교, 복사, 정렬, 찾기)할 때 사용
		 * Calendar 클ㄹ스 : 운영체제의 날짜와 시간을 얻을 때 사용
		 * Date 클래스 : 날짜와 시간을 얻을 때 사용
		 * Objects 클래스 : 객체 비교, 널(null) 여부 등을 조사할 때 사용
		 * String Tokenizer클래스 : 특정 문자로 구분된 문자열을 나누고자 할 때 사용
		 * Random 클래스 : 난수를 얻을 때 사용
		 *
		 * [object 클래스]
		 * 모든 클래스의 최상위 클래스
		 * extends 하지 않아도 자동으로 java.lang.Object클래스에게 상속받게 컴파일 된다
		 * 모든 클래스는 묵시적으로 Object 클래스의 필드와 메서드를 모두 상속받는다.
		 * 
		 * <패키지 생성>
		 *     컴파일 전 						 컴파일 후
		 * public class Car{		public class Car extends Object{	
		 * ...						...
		 * }						}
		 * 
		 * ● 객체비교 (equals() 메소드)
		 * public voolean equals(Object obj) { return (this == obj);}
		 * 
		 * ● 기본적으로 == 연산자와 동일한 결과 리턴(주솟값 비교)
		 * Object obj1 = new Object();
		 * Object obj2 = new Object();
		 * 
		 * boolean result = (obj1 == obj2);
		 * boolean result = obj1.equals(obj2);
		 * 				  기준 객체      비교 객체
		 * 
		 * 논리적 동등을 위해 오버라이딩 필요
		 * 논리적 동등? 같은 객체, 다른 객체 상관없이 객체 저장데이터 통일
		 * Object의 equals()메소드 : 재정의하여 논리적 동등 비교할 때 이용
		 * 
		 * ● 객체 해시코드 반환 메소드(hashCode())
		 * - 메모리에 생성된 인스턴스의 주솟값을 가지고 일련번호를 만들어 반환하는 메서드
		 * - hashCode() 메서드가 반환하는 일련번호를 '해시코드(hashCode)'라고 한다.
		 * 
		 * ● 객체 해시코드란?
		 * - 객체 식별할 하나의 정수값
		 * - 객체의 메모리 주소값을 이용해 해시코드가 만들어지며 리턴
		 * - 개별 객체는 해시코드가 모두 다름
		 * 
		 * <객체 문자정보(toString())>
		 * 객체가 가진 값을 문자열로 제공한다.
		 * public String toString(){return getClass().getName()+"@"+Integer.toHexString(hashCode());
		 * }
		 * getClass() : 현재 클래스에 대한 정보를 가진 Class 객체를 반환한다.
		 * getName() : 현재 클래스의 이름을 반환한다.
		 * hahsCode() : 현재 인스턴스으 ㅣ해시코드값(객체를 식별하는데 사용하는 코드)을 반환한다.
		 * Integer.toHexString() : 인자로 전달된 int값을 6진수 문자열로 반환
		 * 
		 * 문자정보를 얻을 수 있도록 메소드 오버라이딩 해야함.
		 * 1. Date 클래스 - 현재 시스템의 날짜오 ㅏ시간 정보 리턴
		 * 2. String 클래스 - 저장하고 있는 문자열 리턴
		 * 3. System.out.println(Object obj)메소드 
		 *   - Object의 toString()의 리턴값 출력
		 * 
		 * <String 클래스>
		 * ● 문자열 객체 생성 방법
		 * 
		 * 1, String 클래스의 생성자를 사용하여 문자열 객체 생성
		 * 	String str1 = new String ("자바");
		 * 	String str2 = new String ("자바");
		 * new는 heap에 공간을 만든다 = 주소값 대입됨
		 * 
		 * 2, 문자열 리터럴을 사용해서 문자열 객체 생성
		 * 	String str3 = "자바"; ─────> String pool
		 * 	String str4 = "자바"; ─────>      자바
		 * 자바가 heap안에 고유한 영역인 String Pool에 저장된다. = 주소값이 같다 
		 * (같은 문자열이 이미 String Pool에 저장되어 있다면 새로 생성X, 같은 주소를 참조)  	 
		 * 
		 * ※ String Pool은 String인스턴스들이 위치하는 논리적으로 구분된 영역
		 * : 생성하려는 문자열과 똑같은 문자열을 가진 String 인스턴스가 있다면 새로 생성하지 않고 기존 인스턴스의 주소값을 반환한다.
		 * 
		 * 사용빈도 높은 메소드
		 * 리턴타입 		메소드명(매개변수) 				설명
		 * char		charAt(int index)		  지정된 인덱스 위치에 있는 문자를 리턴한다.
		 * boolean  equals(Object anOnj) 	  전달받은 문자열(anObj)과 String 객체의 문자열이 같은지 비교해 결과를 리턴한다.
		 * byte[] 	getBytes() 				  문자열을 바이트배열(byte[])로 리턴한다
		 * byte[] 	getBytes(Charset charset) 주어진 문자셋으로 인코딩한 bute[]로 리턴한다
		 * int 		indexOf(String str)		  문자열내에서 주어진 문자열으 위치를 리턴한다(존재하지않으면 -1을 리턴)
		 * int 		length() 				  총문자의 수를 리턴한다.
		 * + ppt에 더 있음 확인~~~~~
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

	}

}
