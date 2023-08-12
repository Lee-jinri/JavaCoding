package �÷���2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("������", 85);
		map.put("ȫ�浿", 90);
		map.put("���μ�", 90);
		map.put(new String("ȫ�浿"), Integer.valueOf(95));
		// key �� �ߺ� X, ȫ�浿 3��, value�� ���߿� �Է��� ������ ���� = ������ 95������ ����Ǿ� �����.

		System.out.println("�� Entry ���� : " + map.size());
		
		// ��ü ã��
		System.out.println("\tȫ�浿 ���� ã�� : " + map.get("ȫ�浿"));
		System.out.println();
		
		// ��ü ����
//		 map.remove("ȫ�浿");
//		 System.out.println("�� Entry ���� : " + map.size());  2���� ��
		
//		System.out.println(map.toString()); 
		// {������=85, ȫ�浿=95, ���μ�=90} �̷��� ��µǴϱ�
		// Set�� �־ key���� value���� �����ϴ� ��
//		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); // keySet�̶�� Set�� map�� Set���� �ٲ㼭 �����Ѵ�
		// �ݺ��� Iterator
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { // hasNext �� ������
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// Ű�� ���� �� ������ ������ ��ü Entry�� Set�� ��Ƽ� ����
		for (Map.Entry<String, Integer> s : map.entrySet()) {
			String key = s.getKey();
			Integer value = s.getValue();
			System.out.println("key = " + key  +" , value = " + value);
		}
		
		Map<String, Integer> tMap = new TreeMap<String, Integer>();
		
		
		
		
		
	
	
	}

}
