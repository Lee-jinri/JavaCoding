package �÷���;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
/* Member Ŭ������ �����Ѵ�. �ʵ�� �̸�(name)�� ����(age)�� ������ �ִ�.
 * [�䱸����]
 * ���̰� ������ ���� ��ü�� ���� */
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿",50));
		set.add(new Member("ȫ�浿",50));
		set.add(new Member("��ö��",36));
		
		// ���
		System.out.println("�� ��ü��"+set.size());
		System.out.println("\t"+set.toString());
		
	}

}
