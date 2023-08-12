package 컬렉션;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest2 {
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\t"); // 서울 북경 상해
		}
		System.out.println();
		
		// 링크드 리스트의 메소드~~
		
		list.add(1, "LA");  // 1 : [서울, LA, 북경, 상해]
		print(1, list);
		
		list.addFirst("런던"); // 2 : [런던, 서울, LA, 북경, 상해]
		print(2, list);
		
		list.addLast("서울");  // 3 : [런던, 서울, LA, 북경, 상해, 서울]
		print(3, list);
		
		list.offer("파리");    // offer()는 전달된 요소를 마지막 요소로 추가
		print(4, list); 	  // 4 : [런던, 서울, LA, 북경, 상해, 서울, 파리]
		
		list.offerFirst("로마"); // 5 : [로마, 런던, 서울, LA, 북경, 상해, 서울, 파리]
		print(5, list);
		
		list.offerLast("베른"); // 6 : [로마, 런던, 서울, LA, 북경, 상해, 서울, 파리, 베른]
		print(6, list);
		
		System.out.println("7 : " + list.peek());  // peek() 메서드는 가장 첫 번째 요소를 반환. 7 : 로마
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast()); // peekLast()는 마지막 요소를 반환
		
		list.poll(); // poll() 가장 첫 번째 요소를 반환하고 삭제
		print(10, list);  // [런던, 서울, LA, 북경, 상해, 서울, 파리, 베른]
		
		list.pollFirst(); // pollFisrt() 가장 첫번째 요소를 반환하고 삭제
		print(11, list);  // [서울, LA, 북경, 상해, 서울, 파리, 베른]
		
		list.pollLast(); // pollLast() 가장 마지막 요소를 반환하고 삭제
		print(12, list); // [서울, LA, 북경, 상해, 서울, 파리]
		
		// 카페에 예제 더 있음~~
		
		
	}

}
