package �÷���;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterFaceTest {
	public static void main(String[] args) {
		
// �� ���� ������ �ٸ�!
// �ؽ����� ��ũ���ؽ����� �Է��� ����, Ʈ���� ��������
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
		
		// �ݺ���
		Iterator <String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(Integer.valueOf(3));  // Integer.valueOf()�޼ҵ�� ���� ����+�ּҰ��� ��´�
		set1.add(5);  // �׳� �̷��� �ص� ��, �ּҰ�
		set1.add(3);
		set1.add(4);
		
		System.out.println(set1.toString());
	}

}
