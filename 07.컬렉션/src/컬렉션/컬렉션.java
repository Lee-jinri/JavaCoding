package 컬렉션;

public class 컬렉션 {

	/*
	 * 컬렉션 
	 * 
	 * 인터페이스 
	 * 리스트: 순서가 있는 자료구조, 중복원소O    
	 * ↓ 구현클래스들
	 * - 어레이리스트
	 * - 벡터
	 * - 링크드리스트
	 *
	 * [1. List- ArrayList]
	 * 
	 *  
	 * 
	 * 
	 * [반복자 (iterator)]
	 * - ArrayLiust에 있는 원소에 접근하는 방법 중 하나
	 * - 특별한 타입의 객체로 컬렉션의 원소들에 접근하는 것이 목적
	 * - 컬렉션에 저장된 데이터의 위체 정보를 포함한 커서가 있어서 인덱스를 사용하지 않고 쉽게 데이터에 접근할 수 있다
	 * - 컬렉션에 저장된 모든 데이터를 순차적으로 접근하여 사용할 목적으로 사용하는 iterator를 컬렉션 뷰라고 한다
	 * - java.util 패키지에 정의되어 있는 iterator 인터페이스를 구현해서 사용해야한다
	 * 
	 * iterator 인터페이스의 메소드(추상 메소드)
	 * - hasNext() : 참조할 요소가 존재하면 true를 반환
	 * - next() : 원소를 반환
	 * - remove() : 현재 위치의 요소를 삭제
	 * 
	 * iterator를 사용하기 위해 먼저 ArrayList의 iterator()메소드를 호출하여 반복자 객체를 얻는다
	 * public class ArrayList<E> extends AbstractList<E> implements List<E>{
	 * 	public Iterator<E> iterator(){  // iterator()메소드를 호출
	 * 		return new Itr();
	 * 	}
	 * 	private class Itr implements Iterator<E>{
	 * 		public boolean hasNext(){..}
	 * 		@SuppressWarnings("unchecked")
	 * 		public E next(){...}
	 * 
	 * ArrayList<String> list = new ArrayList<String>();  // list 는 ArrayList
	 * list.add("하나");
	 * list.add("둘");
	 * list.add("셋");
	 * list.add("넷");
	 * 
	 * String s; 
	 * Iterator<String> e = list.iterator();
	 * while (e.hasNext(){  // 현재 커서 다음에 데이터가 존재하는 지 판단  ==> true
 	 * 		s = ex.next(); // 커서 다음의 데이터를 반환하고 다음 데이터로 이동
	 * 		systme.out.print(s);
	 * }
	 * 
	 * 커서 => 하나 -> 하나    하나   하나   하나
	 *		  둘      둘  ->  둘    둘     둘 
	 * 		  셋      셋      셋 -> 셋     셋
	 * 		  넷      넷      넷    넷  -> 넷  ... 없으면 false = 반복 멈춤
	 * 
	 * [2. List- Vector 클래스]
	 * 벡터도 리스트로부터 구현되어 있는 구현 클래스이당
	 * 벡터와 어레이 리스트는 동일한 클래스이지만 벡터는 동시 사용을 할 수 있는 클래스이고 어레이 리스트는 동시 사용을 허용하지 않는 클래스이다~~
	 * = 벡터는 동기화 처리를 지원하지만 어레이리스트는 동기화처리를 지원하지 않는다
	 * 동기화 처리란? 여러곳에서 동시에 하나의 자원을 사용할 때 문제 없이 동작하는 것~~~
	 * 
	 * 객체 추가  	void addElement(E obj)	 			주어진 객체 맨 끝에 추가
	 * 객체 반환 	E elementAt(int index) 			매개변수로 전달받은 인덱스에 해당하는 요소 추출
	 * 객체 삭제 	void removeElementAt(int index) 	매개변수로 전달받은 인덱스에 해달하는 요소 삭제
	 * 객체 수정 	E setElementAt(E obj, int index) 	매개변수로 전달받은 인덱스를 요소(obj)를 설정
	 * 
	 * [Enumeration 인터페이스]
	 * 컬렉션뷰는 컬렉션데이터에 접근할 수 있는 통로와 같은 객체이기에 컬렉션뷰에는 컬렉션데이터가 포함되지 않는다.
	 * Iterator는 컬렉션데이터에 대한 정보를 갖고 있고 동기화 처리를 지원한다. (정보를 갖고 있어서 다른 사람이 실제데이터를 변경해버리면 [내 정보 != 실제데이터] 오류가 난다)
	 * Enumeration은 동기화 처리를 지원하지 않는다. (컬렉션데이터 정보를 갖고 있지 않아서 내가 가진 정보와 실제 데이터가 일치하지 않아도 사용할 수 있는 것)
	 * Enumeration<>참조변수 = Vector의 참조변수.elements()
	 * 
	 * 구현 클래스
	 * class 클래스명 implements 인터페이스{}
	 * 인터페이스 참조변수 = new 인터페이스 () ; 이건 안됨
	 * 인터페이스 참조변수 = new 클래스();  이건 됨
	 * 						생성자
	 * 
	 * 구현할 대상
	 * new 인터페이스() {
	 * 		// 추상메서드 오버라이딩 : 이름이 없는 클래스 정의
	 * }; 
	 * -> 클래스를 정의함과 동시에 인스턴스 생성
	 * 
	 * [3. List-LinkedList]
	 * - 메모리에 저장할 때 공간만 있으면 아무데나 저장
	 * - 중간 항목의 삽입과 삭제가 쉽다.
	 * - 삽입, 삭제는 위치의 바로 앞에 있는 항목의 링크 값만 변경하면 된다.
	 * - 다음 데이터의 위치와 이전 데이터의 위치를 갖는다.
	 * 
	 * 		head											tail
	 * 		&100			&400			&200			&300
	 * null 10 &400  -> &100 20 &200 -> &400 30 &300 -> &200 40 null
	 * 주소 &400에 20을 삭제하고 싶으면 
	 * 					&100 -> &200	&400 -> &100
	 * 
	 * LinkedList 클래스와 ArrayList의 비교
	 * Linked List - 메모리에 저장할 수 있는 공간이 있다면 위치에 상관없이 저장, 메모리 효율에 유리
	 * ArrayList - 데이터를 연속적으로 저장한다, 데이터 검색에 유리하다
	 * 
	 * 링크드리스트는 데이터의 논리적인 순서와, 물리적인 순서가 일치하지 않아도 된다.
	 * 물리적으로 연속적이지 않은 것을 논리적으로 순서대로 연결해야하므라 데이터에 대한 주소값을 가지고 있어야한다 = 이런 구조가 노드
	 * 
	 * 데이터    링크(주소)
	 *   ↘       ↙
	 * 	    노드
	 * 
	 * <단일 링크드리스트와 이중 링크드리스트> 
	 * 단일은 노드가 데이터와 다음 데이터의 정보만 가지는 형태
	 * - 한 방향 탐색
	 * 
	 * 이중은 노드에서 다음 데이트와 이전 데이터의 위치 정보도 가지는 형태 = 자바에서는 이중만 사용
	 * - 양방향 탐색
	 * - 처음에 생성된 노드는 머리 (head)라고 부르고
	 * - 마지막에 생성된 노드는 꼬리 (tail)라고 부른다.
	 * 
	 * [Set 인터페이스]
	 * - 집합
	 * - 순서와 상관없이 원소를 저장할 때 사용
	 * - 해시코드 개념을 사용한다
	 * - 중복 X (자바가 2개라면 String Pool에 저장된 주소값이 같음)
	 * - 컬렉션 중에서 가장 빠르게 검색한다
	 * 
	 * hashCode()메소드
	 * - 객체 식별할 하나의 정수값
	 * - 객체의 메모리 주소를 이용하여 해시코드를 만들고 리턴
	 * - Object클래스의 메소드
	 * 
	 * <데이터 비교 작업의 순서>
	 * 해시코드의 리턴값을 equals()메소드가 true, false로 판단한다
	 * true면 같은 객체, false면 다른 객체
	 *
	 * <데이터 비교 기준>
	 * Object 클래스의 hashCode() 메소드의 반환값을 비교
	 * Object equals() 메소드의 반환값을 비교한다 
	 * = 주소값을 비교한다, new하면 주소가 새로 생성되기 때문에 같다고 판단하지 않음
	 * 주소값이 다르지만 같다고 판단해야하는 경우 Object클래스의 hashCode()의 메소드를 재정의해서 
	 * String은 equals()로 비교하게 하고 그 외에는 ==으로 비교하게 한다.
	 * String은 주소값이 모두 다르기때문에
	 * 
	 * <Set>
	 * 1, HashSet
	 * - 원소들의 순서가 일정하지 않다. 비정력, 비순차적
	 * 2, LinkedHashSet
	 * - HashSet클래스를 순차구조로 만든 클래스로 이중연결리스트 구조이다.
	 * - 순차적이고 반복처리인 경우 사용
	 *   (원소들의 순서는 삽입되었던 순서와 같다)
	 * 3, TreeSet
	 * - 정렬 (오름차순)
	 * 
	 * HashSet <String> set = new hashSet<String>(); // String 타입을 가진 set 인스턴스 생성
	 * 
	 * set.add("Milk");
	 * set.add("Bread");
	 * set.add("Butter");
	 * set.add("Cheese");
	 * set.add("Ham");
	 * set.add("Ham");
	 * set.size() -> 원소수 몇개인지 반환받음  5개 햄은 중복~~~
	 * 
	 * sysout(set);
	 * 
	 * HashSet : [Bread, Milk, Butter, Ham,Cheese] 아무렇게 정렬됨
	 * 만약 LinkedHashSet이라면 입력된 순서대로 정렬
	 * 만약		 TreeSet이라면 알파벳 순서대로 정렬
	 * 
	 * 셋을 단순히 확인할 때는 투스트링
	 * [] 집합으로 확인할 때는 sysout.print(set.toString());
	 * 
	 * <Set의 데이터 비교>
	 * Object 클래스의 hashCode() 메소드의 반환값을 비교
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
