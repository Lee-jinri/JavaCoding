package 컬렉션;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Galaxy S20");  // 리스트 항목 추가
		list.add("iPhone12");
		
		System.out.println(list.toString());
		System.out.println();
		
//		for (int i = 9; i < list.size; i++)
//			System.out.println(list.get(i));
		
		Iterator<String> e = list.iterator();
		while (e.hasNext()) {
			System.out.println(e.next());
		}
	}

}
