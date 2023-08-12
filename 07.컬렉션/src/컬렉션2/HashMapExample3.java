package 컬렉션2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample3 {
/* Student라는 이름의 클래스를 생성하세요. 필드는 학번(sno), 이름(name)을 가집니다.*/
	public static void main(String[] args) {
		HashMap<String, Student> st = new HashMap<String, Student>();
		st.put("1", new Student(99030001, "홍길동"));
		st.put("2", new Student(99030002, "김도훈"));
		st.put("3", new Student(99030003, "윤도희"));
		// 키가 1,2,3 밸류가 스튜던트
		// {1=이름 : 홍길동 학번 : 99030001, 2=이름 : 김도훈 학번 : 99030002, 3=이름 : 윤도희 학번 : 99030003}
		
		System.out.println(st.toString());
		
		Set<String> keySet = st.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student sst = st.get(key);
			System.out.println(key + " " + sst.toString());
		}
		
		// 키와 값의 한 쌍으로 구성된 객체 Map.Entry를 Set에 담아서 리턴
		for(Map.Entry<String, Student> s: st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + " value = " + value);
		}
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(90010001,"홍길동"), 95);
		map.put(new Student(90010001,"홍길동"), 89);
		
		// 같은 이름의 key, value 사용 불가, Entry 수는 2개
		System.out.println("총 Entry 수 : " + map.size()); 
		System.out.println(map.toString());
	
	
		// (번호, Student 객체)를 저장하는 트리맵 생성
		TreeMap<String,Student>tMap = new TreeMap<String,Student>();
		tMap.put("1",new Student(94010001, "홍길동"));
		tMap.put("4",new Student(95020001, "김희진"));
		tMap.put("2",new Student(94010001, "윤도희"));
		tMap.put("3",new Student(99030003, "김철수"));
		System.out.println(tMap.toString());
		
		TreeMap<Student,Integer>sMap = new TreeMap<Student, Integer>();
		sMap.put(new Student(97010001, "윤도희"), 89);
		sMap.put(new Student(95020001, "김희진"), 90);
		sMap.put(new Student(94010001, "홍길동"), 99);
		sMap.put(new Student(99010003, "김철수"), 79);

		for (Map.Entry<Student, Integer> se : sMap.entrySet()) {
			Student key = se.getKey();
			Integer value = se.getValue();
			System.out.println("key= "+key+", value="+value);
		}
	}	
}
