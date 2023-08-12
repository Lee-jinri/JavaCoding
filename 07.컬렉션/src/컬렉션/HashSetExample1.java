package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	// Key의 실행클래스
	public static void main(String[] args) {
		Set<Key> set = new HashSet<Key>();
		
		// 주소값을 새로 받음
		set.add(new Key(1));
		set.add(new Key(13));
		set.add(new Key(1));
		set.add(new Key(35));
		set.add(new Key(3));
		
		// 객체의 개수 = size
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		// 반복자 통해서 접근
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
		 * 1이 중복인데 왜 두개가 출력될까
		 * 
		 * 해쉬셋은 주소값을 근거로 만들어진다.
		 * new를 사용하면 새로운 주소를 만들어냄.
		 * Object의 해쉬코드를 판단하기 때문에
		 */
		
		}
	}

}
