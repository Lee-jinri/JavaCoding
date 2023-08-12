package �÷���;

import java.util.HashSet;
import java.util.Set;

/* ��ü ���ڿ��� �ߺ��� �ܾ �����ϴ� ���α׷��� �ۼ��غ���.
 * �� ���� HashSet�� �̿��Ͽ� �ڵ��غ�����.
 * String[] sample = { "�ܾ�","�ǹ�","����","�ǹ�","�ܶ�"}
 * 
 * [��� ���]
 * �ߺ��� �ܾ� : �ǹ�
 * �ܾ� �� : 4
 * �ߺ����� ���� �ܾ� : [�ܶ�, �ǹ�, ����, �ܾ�] */

public class FindDupplication {
	public static void main(String[] args) {
		
		String[] sample = {"�ܾ�","�ǹ�","����","�ǹ�","�ܶ�"};
		Set<String> s = new HashSet<String>();
		
		// �ߺ��� �ܾ�
		for (String a : sample) { // sample�� �ϳ��� a�� ����
			if (!s.add(a))  // !(����������) true -> false false -> true. if(s.add(a) == false
				// ���� a�� �߰����� �ʴ´ٸ� true
				System.out.println("�ߺ��� �ܾ�: " + a);
		}
		
		// ���
		System.out.println("�ܾ� �� : "+s.size());
		System.out.println("�ߺ����� ���� �ܾ�: " + s.toString()); 
		// toString - HashSet�� �迭 ���
	}

	
}
