package APImain;

public class API {


/*[API]
 *	API란? 
 *	Application + Programming + Interface
 *  자바를 프로그래밍 할 때 사용하는 클래스 + 생성자 + 메소드 + 인터페이스
 *  
 *  java api 8 검색하면 자바 API를 볼 수 있음
 *  
 * <String 관련 클래스>
 *  (1) String 클래스
 *  문자열 값 수정 불가능, immutable클래스
 *  수정 시 수정된 문자열이 새로 할당되어 새 주소를 넘긴다 -> 메모리 낭비가 심하다
 *  <<변경없이>> 읽기만 하는 경우 주로 쓴다.
 *  
 *  (2) StringBuffer 클래스
 *  문자열 값 수정 가능, mutable클래스
 *  수정, 삭제 등이 기존 문자열에 수정되어 적용
 *  기본 16문자 크기로 지정된 버퍼를 이용하며 크기 증가 가능
 *  쓰레드 safe기능 제공(성능 저하 요인)
 *  << 변경이 잦을 경우>> 메모리 공간을 효율적으로 쓰면서 문자열을 저장할 수 있다.
 * 
 *  
 *  (3) StringBuilder 클래스 (동기화)
 *  StringBuffer클래스와 동일하지만 쓰레드 safe기능을 제공하지 않는다. 동기화빼곤 Buffer랑 차이가 없다
 *  
 *  동기화 : 멀티쓰레드 환경(동시에 여러 작업들을 처리하는 환경)에서 하나의 작업이 온전히 끝날 때까지 다른 작업이 침범하지 못하게 하는것
 *         안정성을 도모하기 위한 기능이다. 
 *  	  (알고리즘이 포함되어 처리속도가 다소 느리다)
 *  
 *  <오버라이딩 메소드>
 *  - 동등비교
 *  Student st1 = new Student("홍길동",2,'남');
 *  Student st2 = new Student("홍길동",2,'남');
 *  st1과 st2를 동등한 객체로 보려면 어떻게 해야할까?
 *  
 *  st1과 st2는 다른 메모리 공간에 저장된다. >> 메모리 공간은 다름
 *  st1과 st2는 같은 값을 가진다. >> 값은 같음
 *  
 *  - equals()
 *  Object 클래스에 선언된 메소드
 *  객체간의 동등하면 true가 반환 -> 오버라이딩해야됨
 *  동등 비교시 오버라이딩해서 구현하는 메소드
 *  
 *  - hashCode()
 *  Object 클래스에 선언된 메소드
 *  객체의 주소를 반환하도록 구현되어 있음
 *  자바와 다른 언어로 구현되 native 메소드 JVI(Java Native Interface)의 일종
 *  컬렉션 사용시, 동등비교시 같이 오버라이딩해서 구현해야하는 메소드
 *  
 *  - toString()
 *  Object 클래스에 선언된 메소드
 *  객체의 주소값을 String으로 반환하도록 구현됨
 *  주로 객체 정보 반환을 위해 오버라이딩
 *  
 *  - clone() 복사
 * 	Object 클래스에 선언된 메소드
 *	자바와 다른 언어로 구현되 native 메소드 JNI의 일동
 * 	얕은 복사와 깊은 복사의 개념이 존재
 * 
 *  얕은 복사(shallow 복사) : 주소값만 복사하는 것
 *  stack
 *  (p1 = p2) -> heap 
 *  원본은 그대로 두고 사본을 갖고 놀겠음
 *  
 *  깊은 복사(deep cloning) -> Phone 클래스 참고
 *  1. 생성자 이용하기(new 연산자)
 *  2. Object 클래스의 clone 이용하기(예외처리, Cloneable 인터페이스 구현해야함)
 * 
 * <Wrapper 클래스와 자료형 변환>
 * - Wrapper 클래스
 * 기본 자료형을 객체화 해주는 클래스
 * 
 * 왜 사용할까? 
 * 1. 기본자료형을 String으로 String을 기본자료형으로 바꿀 수 있음 
 * 기본자료형(숫자)를 String으로 바꿀 때는 valueOf 사용
 * String을 기본자료형(숫자)로 바꿀 때는 valueOf와 toString 사용
 * 
 * 2. 클래스의 기능을 사용할 수 있음
 * 3. Object 클래스의 메소드를 사용할 수 있음
 * 
 * 기본 자료형 | Wrapper Class
 * boolean     Boolean
 * byte        Byte
 * char        Character
 * short       Short
 * int         Integer
 * long        Long
 * float       Float
 * double      Double
 *  
 */

}
