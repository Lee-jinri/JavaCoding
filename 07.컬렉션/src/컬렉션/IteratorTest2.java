package �÷���;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		// ArrayList�� ���Ҹ� �ε����� �����ϰ��� �� ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==============================");

		// Iterator�� Ŀ���� ���ؼ� ��� ���ҿ� ���������� �����Ұ��� �� ��
		// ArrayList�� iterator()�޼���� Iterator �������̽��� ������ ���� Ŭ����(Itr)�� �ּҰ� (new Itr())�� ��ȯ
		// �������̽��� <Ÿ�� ����> �������� = list.iterator();
		Iterator<String>iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	

}
