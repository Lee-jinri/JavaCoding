package 컬렉션2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("김희진", 85);
		map.put("홍길동", 90);
		map.put("조민수", 90);
		map.put(new String("홍길동"), Integer.valueOf(95));
		// key 값 중복 X, 홍길동 3개, value는 나중에 입력한 것으로 변경 = 점수는 95점으로 변경되어 저장됨.

		System.out.println("총 Entry 개수 : " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동 점수 찾기 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체 삭제
//		 map.remove("홍길동");
//		 System.out.println("총 Entry 개수 : " + map.size());  2개가 됨
		
//		System.out.println(map.toString()); 
		// {김희진=85, 홍길동=95, 조민수=90} 이렇게 출력되니까
		// Set에 넣어서 key따로 value따로 접근하는 것
//		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // keySet이라는 Set에 map을 Set으로 바꿔서 저장한다
		// 반복자 Iterator
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { // hasNext 값 가져옴
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// 키와 값의 한 쌍으로 구성된 객체 Entry를 Set에 담아서 리턴
		for (Map.Entry<String, Integer> s : map.entrySet()) {
			String key = s.getKey();
			Integer value = s.getValue();
			System.out.println("key = " + key  +" , value = " + value);
		}
		
		Map<String, Integer> tMap = new TreeMap<String, Integer>();
		
		
		
		
		
	
	
	}

}
