package 컬렉션2;

public class 컬렉션2 {
/* 2022-02-25
 * 
 * 
 * <Map 인터페이스>
 * - 키(key)와 값(value)로 저장
 * - 키는 데이터에 접근할 때 사용.(데이터를 쉽게 찾을 수 있다)
 * - 중복된 키 사용 불가, 값은 중복 가능
 * - 저장된 순서가 중요하지 않음(데이터의 위치 정보를 가지지 않는다)
 * - 장점 : 데이터 검색속도가 빠르다
 * - Map은 여러개의 Entry로 구성된 컬렉션이다
 * - HashMap, HashTable, TreeMap, Properties가 있다.
 * 
 * Map에서는 원소를 저장할 때 put을 사용한다
 * V put(K key, V value);
 * 
 * <Map 인터페이스>
 * public interface Map <K,V>{
 * 		int size();
 * 		V get(Object key);
 * 		V put(K key, V value);
 * 		Set<K> keySet();
 * 		Set<Map.Entry<K,V>> entrySet();
 * 		interface Entry<K,V> {  // Entry로 key값을 받거나 value를 받을 수 있음
 * 			K getKey();
 * 			V geValue();
 * 			V setValue(V value);
 * 			boolean equals(Object o);
 * 			int hashCode();
 * 
 * <Entry 인터페이스>
 * - Map 인터페이스에 선언된 내부 인터페이스
 * - 외부객체명.내부객체명으로 표현한다
 * - Map.Entry로 표현해야함
 * - 실제 키와 값을 가지는 것은 Entry
 * - Map은 여러개의 Entry로 구성된 컬렉션이다
 * 
 * <HashMap 구현클래스>
 * - 키타입은 String 많이 사용
 * (String은 문자열이 같은 경우 동등 객체가 될 수 있도록, hashCode()와 equals()메소드가 재정의 되어있기 때문 
 * - Map<K,V> map = new HashMap<K,V>();
 * 		 (K는 키타입,V는 값 타입)
 * - 키 객체는 hashCode()와 equals()를 재정의해서 동등 객체가 될 조건을 정해주면 된다.
 * - key와 value로 구성된 Map.Entry 객체를 저장하는 구조
 * - 키와 값은 모두 객체
 * 
 * if문의 조건식의 결과값은??
 * 반환받는 값은 ??
 * 논리값을 얻는다. (참일 때만 실행하니까)
 * 
 * switch문
 * 사용할 수 없는 데이터타입
 * 실수형 (소수점 뒤에 모든 수가 일치할 수 없기때문에)
 * 사용할 수 있는 데이터타입
 * 정수, 문자, 문자열
 * 
 * 후위연산자, 전위연산자에서 꼭 필요한것
 * 위치 값이 어디있는지 ++이 앞에 있는지 뒤에 있는지
 * 증감하는건지 감소하는건지 선처리인지 후처리인지
 * 
 * 단항연산자, 다항연산자, 증감연산자, 이항연산자
 * 
 * 이항연산자
 * 피연산자의 개수가 두 개 이상인 연산자
 * 
 * 문제해결
 * 1. 제어문
 * 2. uml = 절대 수정할 수 없다.
 * 3. 메서드의 오버로딩
 * 전제조건 메서드의 이름은 동일하지만 메서드의 타입이나 개수가 달라야한다
 * 반환하는 형태는 중요하지 않다.
 * 
 * 상속 오버로딩 오버라이딩 인터페이스
 * 
 * 
 * 
 */
	
	
}
