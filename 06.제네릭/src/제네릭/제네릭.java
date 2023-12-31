package 제네릭;

public class 제네릭 {

	/*
	 * [제네릭 프로그래밍] - 자바 버전 1.5
	 * - 클래스를 정의하면서 사용할 변수의 자료형을 설계할때 (코드 작성시) 결정하는 게 아니라 
	 * - 컴파일 할 때 자료형을 검사해서 자료형에 유연하면서 안정성까지 고려할 수 있도록 하는 것
	 * 
	 * <제네릭 타입>
	 * - 타입을 타라미터로 가지는 클래스와 인터페이스
	 * - 선언시 클래스 또는 인터페이스 이름 뒤에 "<>"부호 붙임
	 * -"<>" 사이에는 타입 파라미터가 위치한다.
	 * 
	 * <타입 파라미트> = 매개변수 타입
	 * - 일반적으로 대문자 알파벳 한 문자로 표현한다.
	 * - 실행 클래스에서 타입 파라미터 자리에 구체적인 타입을 지정해 주어야 한다.
	 * 
	 * public class 클래스명 <타입 매개변수> {
	 * }
	 * 
	 * E - element
	 * K - key
	 * N - number
	 * T - type
	 * V - value
	 * 
	 * 타입 매개변수의 값은 객체를 생성할 때 구체적으로 결정된다.
	 * - 문자열을 저장하려면 다음과 같이 선언
	 *  Store<String> store = new Store <String>();
	 * - 정수를 저장하려면 이렇게~~~
	 *  Store<Integer>store = new Store <Integer>();
	 * 
	 * <제네릭 코드 장점>
	 * - 제네릭은 형변환 안함 ( = 불필요한 타입 변경을 없애준다)
	 * - 엄격한 타입 검사를 해서 안전성을 높여준다. (컴파일 시에 미리 타입을 강하게 체크해서 에러 사전 방지)
	 * 
	 * 예제해보기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ppt
	 * 
	 * <멀티 타입 매개변수>
	 * - 매개변수 여러 타입 사용 가능
	 * public class Bag <T,N>{
	 * 		private T thing;
	 * 		private N name;
	 * 		public Bag(T thing, N name){
	 * 			this.thing = thing
	 * 
	 * <한정된 타입매개변수>
	 * - 특정한 종류의 객체들만 받게 하고 싶은 경우 사용
	 * - extends 나 super라는 키워드를 사용한다.
	 * 
	 * <타입 매개변수 extends 슈퍼 클래스명>
	 *   - 슈퍼 클래스를 상속받은 하위 객체들만 가능하다.
	 *   ex) Number 아래에 integer, double이 있음. 슈퍼클래스명에 Number를 쓰면 넘버의 서브클래스만(인티저,더블 등)가능.
	 * 
	 * <타입 매개변수 extends 인터페이스명>     - implement 사용 안함 
	 *   - 인터페이스로부터 구현되어있는 클래스들만 가능하다.
	 * 
	 * <타입 제한>
	 * Bag은 객체 생성 시 어떤 타입 인자도 받을 수 있다.
	 * 
	 * 만약 bag에 담을 수 있는 객체에 제한을 두려고 한다면 고체로 되어 있는 물건은 담을 수 있지만
	 * 액체로 된 물건은 담을 수 없도록 하려고 한다.
	 * 
	 * <T extends superclass> = 타입 매개변수에 제한을 두겠다는 의미이다.
	 *  - T를 대체할 수 있는 타입은 슈퍼클래스를 상속받은 하위객체들만 가능하다.
	 *  T만 쓰면 어떤 타입이든 제한 없음. superclass를 쓰면 제한을 두겠다.
	 * <T super 서브 클래스명>은 다른 거임
	 * 
	 * <한정된 타입 매개변수(와일드 카드)>
	 * 제네릭 타입을 매개변수의 타입이나 리턴타입으로 사용할 때 구체적인 타입 대신에 와일드 카드로 명시할 수도 있다
	 * - 와일드 카드는 ? 기호로 표현
	 * - ? 는 어떤 타입 매개변수도 지정할 수 있다는 의미이다.
	 * 
	 * <?> :제한 없음
	 * <?extends 슈퍼클래스>
	 * : 타입을 슈퍼클래스이거나 슈퍼클래스로부터 상속받은 클래스로 한정.
	 * <?extends 인터페이스>
	 * : 타입을 인터페이스이거나 인터페이스를 상속받은 클래스로 한정.
	 * <?super 서브 클래스>
	 * : 타입을 서브클래스이거나 서브클래스가 상속하는 상위 객체로 한정.
	 * 
	 * <제네릭 메서드>
	 * - 매개변수 타입과 리턴 타입으로 타입 매개변수를 갖는 메소드
	 * - 보통 static메소드를 많이 씀 = 인스턴스 생성하지 않음
	 * 
	 * <제네릭 메소드 선언 방법>
	 * - <타입매개변수> 리턴타입
	 * - public <타입매개변수,...> 리턴타입 메서드명(매개변수,...){}
	 * - 타입매개변수를 리턴 타입과 매개변수에 사용
	 * - public <T> T 메서드명(T)
	 * 
	 * <제네릭 메소드 호출 방법>
	 * 1, 명시적으로 타입 인자를 지정
	 * 리턴타입 변수 = <타입 인자> 메소드명(인자값);
	 * 2, 인자값을 보고 타입 인자를 추정
	 * 리턴타입 변수 = 메서드명(인자값);
	 * String[] language = { "C++","C#", "JAVA"};
	 * 1번, String last = GenericMethod.<String>getLast(language);
	 * 2번, String last = GenericMethod.getLast(language);
	 * 					  클래스명.메서드()
	 * = 컴파일러는 타입을 추정 할 수 있기 때문에 2번처럼 호출해도 된당.
	 * 
	 *	CompareTo()는 인터페이스 구현해야 사용가능
	 * T가 가리킬 수 있는 클래스 범위를 comparable 인터페이스를 구현한 클래스로 제한해야한다. 
	 *
	 * [자료 구조]
	 * 프로그램 = 코드 + 데이터
	 * 데이터를 효율적으로 사용되도록 구조적으로 저정하고 관리하는 것이 자료구조이다
	 * 데이터의 추가, 수정, 삭제, 검색
	 * 
	 * 자료구조는 효율적인 데이터 저장방법을 연구하는 학문
	 *  - 정형화하고 있는 데이터 저장방식
	 *  - 배열, 리스트, 스택 ,트리, 큐, 해시정리
	 *  int a, b, c, d, e; 		이걸
	 *  int[] a1 = new int[5];	이렇게 바꾸는 거
	 *  
	 * 알고리즘은 저장된 데이터를 대상으로 각종 연산은 연구하는 학문
	 *  - 정렬, 탐색
	 * 
	 * [컬렉션]
	 * - 자료구조와 알고리즘을 인터페이스, 클래스로 구현하여 제공하는 자바 API
	 * - 참조형을 다루는 것에 집중되어있음
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
	 *
	 * 
	 * 
	 * 
	 */
}
