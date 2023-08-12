package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterFaceTest {
	public static void main(String[] args) {
		
// 세 개의 정렬이 다름!
// 해쉬셋은 링크드해쉬셋은 입력한 순서, 트리는 오름차순
		HashSet <String> set = new HashSet<String>();
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set.toString());
		
		// 반복자
		Iterator <String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(Integer.valueOf(3));  // Integer.valueOf()메소드로 힙에 공간+주소값을 얻는다
		set1.add(5);  // 그냥 이렇게 해도 됨, 주소값
		set1.add(3);
		set1.add(4);
		
		System.out.println(set1.toString());
	}

}
