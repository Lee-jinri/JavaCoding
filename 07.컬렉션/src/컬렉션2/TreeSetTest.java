package 컬렉션2;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	class Score implements Comparable<Score>{
		private int kor;
		private int math;
		
		public Score(int kor, int math) {
			this.kor = kor;
			this.math = math;
		}
		
		public int getSum() {
			return this.kor + this.math;
		}
		
		@Override
		public int compareTo(Score obj) { // 크다 작다 같다를 판단
			int r = this.getSum() - obj.getSum();
			if (r > 0)
				return 1;
			else if (r == 0)
				return 0;
			else 
				return -1;
		}
		public String toString() {
			return String.format("[Score - 국어:%d, 수학%d, 총점:%3d]", kor,math,getSum());
		}
	}
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(20);
		set.add(90);
		set.add(Integer.valueOf(75));
		set.add(Integer.valueOf(92));
		set.add(Integer.valueOf(50));
		
		System.out.println("Sorting(오름차순): " + set.toString());
		System.out.println("Sorting(내림차순): " + set.descendingSet());
		
		System.out.println("가장 낮은 점수 : " + set.first());
		System.out.println("가장 높은 점수 : " + set.last());
		System.out.println();
		
		/* Integer 클래스는  NavigableSet<E>인터페이스를 구현한 구현 클래스. NavigableSet<E>인터페이스는
		 * SortedSet<E> 인터페이스를 상속받은 인터페이스
		 */
		
		
		SortedSet<Member> mSet = new TreeSet<Member>(); // 인터페이스명 참조변수 = new 구현클래스의 생성자
		mSet.add(new Member("홍길동",30));
		mSet.add(new Member("김철수",34));
		mSet.add(new Member("이민수",29));
		mSet.add(new Member("김희진",45));
		mSet.add(new Member("홍길동",30));
		
		// System.out.println("Member Sorting: " + mSet.toString());
		Iterator<Member> iter = mSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Score 클래스는 국어, 수학 점수를 필드로 갖는 클래스로 인스턴스 생성시 초기값 설정되도록 코딩됨.
		// 국어와 수학 점수의 합을 기준으로 정렬
		
		// 인스턴스 생성
		TreeSet<Score> tSet = new TreeSet<Score>();
		tSet.add(new Score(21, 22));
		tSet.add(new Score(71, 78));
		tSet.add(new Score(11, 12));
		tSet.add(new Score(31, 32));
		
		System.out.println("\n반복자를 이용하여 출력 - 오름차순");
		Iterator<Score> it = tSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n반복자를 이용하여 출력 - 내림차순");
		SortedSet<Score> sSet = tSet.descendingSet();
		Iterator<Score> sIt = sSet.iterator();
		while (sIt.hasNext()) {
			System.out.println(sIt.next());
		}
		
		
	}

}
