package �÷���2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		// < Ű Ÿ��, �� Ÿ��>
		
		// put(key, value): �� ����!
		dic.put("��������","��� ���� ���̿´�.");
		dic.put("�а���", "���� �μ��������� ����� �� ��");
		dic.put("�����߷�", "���и� ���ǻ�� �����");
		dic.put("���л���", "����ġ�� ���鼭 ���� ������");
		
		// get(key) : Ư�� Ű�� value�� ��ȯ�ϴ� �޼ҵ�
		System.out.println(dic.get("��������"));
		System.out.println();
		
		// ��� 4�� �߿� �ϳ��� ����ϸ� ��.
		
		// ��� ���1
		Set<String> keySet = dic.keySet(); // Set���ٰ� Key�� �� ����
		// �ݺ���
		Iterator<String> keys = keySet.iterator(); // �ݺ���, ������ ��´�.
		while (keys.hasNext()) {
			String key = keys.next(); // Ű�� ������ �� �ִ�
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
		System.out.println();
		
		
		// ��� ���2
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key,dic.get(key)));
		}
		System.out.println();
		
		// ��� ���3 entrySet() �޼���� Ű�� ���� �ѽ����� ������ ��ü�� Set�� ��Ƽ� return
		Set<Map.Entry<String, String>> entrySet = dic.entrySet(); // Ű�� �� �ҷ��ͼ� Set�� �ִ´� = Ű�� ����� �� ��������
		// �ݺ��� : ���� ��Ʈ���� ���´�.
		Iterator<Map.Entry<String,String>> entryIterator = entrySet.iterator(); // �ּҰ��� entryIterator�� ����
		while(entryIterator.hasNext()) { // hasNext �� ������
			Map.Entry<String, String> entry = entryIterator.next(); // ���� ���� ��Ʈ��
			String key = entry.getKey(); 	 // Ű�� ������
			String value = entry.getValue(); // ����� ������
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// ��� ��� 4, elem�� ��������
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.printf("%s : %s\n", elem.getKey(), elem.getValue());
		}
		
		
	}

}
