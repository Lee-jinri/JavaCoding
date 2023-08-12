package �÷���2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample3 {
/* Student��� �̸��� Ŭ������ �����ϼ���. �ʵ�� �й�(sno), �̸�(name)�� �����ϴ�.*/
	public static void main(String[] args) {
		HashMap<String, Student> st = new HashMap<String, Student>();
		st.put("1", new Student(99030001, "ȫ�浿"));
		st.put("2", new Student(99030002, "�赵��"));
		st.put("3", new Student(99030003, "������"));
		// Ű�� 1,2,3 ����� ��Ʃ��Ʈ
		// {1=�̸� : ȫ�浿 �й� : 99030001, 2=�̸� : �赵�� �й� : 99030002, 3=�̸� : ������ �й� : 99030003}
		
		System.out.println(st.toString());
		
		Set<String> keySet = st.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student sst = st.get(key);
			System.out.println(key + " " + sst.toString());
		}
		
		// Ű�� ���� �� ������ ������ ��ü Map.Entry�� Set�� ��Ƽ� ����
		for(Map.Entry<String, Student> s: st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + " value = " + value);
		}
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(90010001,"ȫ�浿"), 95);
		map.put(new Student(90010001,"ȫ�浿"), 89);
		
		// ���� �̸��� key, value ��� �Ұ�, Entry ���� 2��
		System.out.println("�� Entry �� : " + map.size()); 
		System.out.println(map.toString());
	
	
		// (��ȣ, Student ��ü)�� �����ϴ� Ʈ���� ����
		TreeMap<String,Student>tMap = new TreeMap<String,Student>();
		tMap.put("1",new Student(94010001, "ȫ�浿"));
		tMap.put("4",new Student(95020001, "������"));
		tMap.put("2",new Student(94010001, "������"));
		tMap.put("3",new Student(99030003, "��ö��"));
		System.out.println(tMap.toString());
		
		TreeMap<Student,Integer>sMap = new TreeMap<Student, Integer>();
		sMap.put(new Student(97010001, "������"), 89);
		sMap.put(new Student(95020001, "������"), 90);
		sMap.put(new Student(94010001, "ȫ�浿"), 99);
		sMap.put(new Student(99010003, "��ö��"), 79);

		for (Map.Entry<Student, Integer> se : sMap.entrySet()) {
			Student key = se.getKey();
			Integer value = se.getValue();
			System.out.println("key= "+key+", value="+value);
		}
	}	
}
