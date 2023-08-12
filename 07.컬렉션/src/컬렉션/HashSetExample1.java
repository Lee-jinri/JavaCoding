package �÷���;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	// Key�� ����Ŭ����
	public static void main(String[] args) {
		Set<Key> set = new HashSet<Key>();
		
		// �ּҰ��� ���� ����
		set.add(new Key(1));
		set.add(new Key(13));
		set.add(new Key(1));
		set.add(new Key(35));
		set.add(new Key(3));
		
		// ��ü�� ���� = size
		int size = set.size();
		System.out.println("�� ��ü�� : " + size);
		
		// �ݺ��� ���ؼ� ����
		Iterator<Key> iterator  = set.iterator();
		while(iterator.hasNext()) {
			Key k = iterator.next();
			System.out.println("\t" + k.toString());
			
		/*
		 * number : 3
		 * number : 1
		 * number : 1
		 * number : 35
		 * number : 13
		 * 
		 * 1�� �ߺ��ε� �� �ΰ��� ��µɱ�
		 * 
		 * �ؽ����� �ּҰ��� �ٰŷ� ���������.
		 * new�� ����ϸ� ���ο� �ּҸ� ����.
		 * Object�� �ؽ��ڵ带 �Ǵ��ϱ� ������
		 */
		
		}
	}

}
