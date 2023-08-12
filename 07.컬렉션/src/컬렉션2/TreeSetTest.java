package �÷���2;

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
		public int compareTo(Score obj) { // ũ�� �۴� ���ٸ� �Ǵ�
			int r = this.getSum() - obj.getSum();
			if (r > 0)
				return 1;
			else if (r == 0)
				return 0;
			else 
				return -1;
		}
		public String toString() {
			return String.format("[Score - ����:%d, ����%d, ����:%3d]", kor,math,getSum());
		}
	}
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(20);
		set.add(90);
		set.add(Integer.valueOf(75));
		set.add(Integer.valueOf(92));
		set.add(Integer.valueOf(50));
		
		System.out.println("Sorting(��������): " + set.toString());
		System.out.println("Sorting(��������): " + set.descendingSet());
		
		System.out.println("���� ���� ���� : " + set.first());
		System.out.println("���� ���� ���� : " + set.last());
		System.out.println();
		
		/* Integer Ŭ������  NavigableSet<E>�������̽��� ������ ���� Ŭ����. NavigableSet<E>�������̽���
		 * SortedSet<E> �������̽��� ��ӹ��� �������̽�
		 */
		
		
		SortedSet<Member> mSet = new TreeSet<Member>(); // �������̽��� �������� = new ����Ŭ������ ������
		mSet.add(new Member("ȫ�浿",30));
		mSet.add(new Member("��ö��",34));
		mSet.add(new Member("�̹μ�",29));
		mSet.add(new Member("������",45));
		mSet.add(new Member("ȫ�浿",30));
		
		// System.out.println("Member Sorting: " + mSet.toString());
		Iterator<Member> iter = mSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Score Ŭ������ ����, ���� ������ �ʵ�� ���� Ŭ������ �ν��Ͻ� ������ �ʱⰪ �����ǵ��� �ڵ���.
		// ����� ���� ������ ���� �������� ����
		
		// �ν��Ͻ� ����
		TreeSet<Score> tSet = new TreeSet<Score>();
		tSet.add(new Score(21, 22));
		tSet.add(new Score(71, 78));
		tSet.add(new Score(11, 12));
		tSet.add(new Score(31, 32));
		
		System.out.println("\n�ݺ��ڸ� �̿��Ͽ� ��� - ��������");
		Iterator<Score> it = tSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n�ݺ��ڸ� �̿��Ͽ� ��� - ��������");
		SortedSet<Score> sSet = tSet.descendingSet();
		Iterator<Score> sIt = sSet.iterator();
		while (sIt.hasNext()) {
			System.out.println(sIt.next());
		}
		
		
	}

}
