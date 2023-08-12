package 컬렉션2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		// < 키 타입, 값 타입>
		
		// put(key, value): 값 저장!
		dic.put("고진감래","고생 끝에 낙이온다.");
		dic.put("분골쇄신", "몸이 부서질저도로 노력을 다 함");
		dic.put("권토중래", "실패를 발판삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		
		// get(key) : 특정 키의 value를 반환하는 메소드
		System.out.println(dic.get("고진감래"));
		System.out.println();
		
		// 방법 4개 중에 하나로 출력하면 됨.
		
		// 출력 방법1
		Set<String> keySet = dic.keySet(); // Set에다가 Key를 다 담음
		// 반복자
		Iterator<String> keys = keySet.iterator(); // 반복자, 참조값 얻는다.
		while (keys.hasNext()) {
			String key = keys.next(); // 키를 가져올 수 있다
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
		System.out.println();
		
		
		// 출력 방법2
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key,dic.get(key)));
		}
		System.out.println();
		
		// 출력 방법3 entrySet() 메서드는 키와 값의 한쌍으로 구성된 객체를 Set에 담아서 return
		Set<Map.Entry<String, String>> entrySet = dic.entrySet(); // 키와 값 불러와서 Set에 넣는다 = 키와 밸류를 다 갖고있음
		// 반복자 : 맵의 엔트리를 갖는다.
		Iterator<Map.Entry<String,String>> entryIterator = entrySet.iterator(); // 주소값을 entryIterator에 넣음
		while(entryIterator.hasNext()) { // hasNext 값 가져옴
			Map.Entry<String, String> entry = entryIterator.next(); // 가진 맵의 엔트리
			String key = entry.getKey(); 	 // 키를 가져옴
			String value = entry.getValue(); // 밸류를 가져옴
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// 출력 방법 4, elem은 참조변수
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.printf("%s : %s\n", elem.getKey(), elem.getValue());
		}
		
		
	}

}
