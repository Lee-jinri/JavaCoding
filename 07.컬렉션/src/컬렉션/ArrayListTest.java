package �÷���;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//printArray(list2);
		System.out.println();
		
		// ���� ��ȭ������ �����ϵ��� �ν��Ͻ� ����
		// Movie Ŭ������ ��ȭ����(mTitle), ����(mGrade), ����(mDiretor), ������(anYear) ���� �ʵ带 ������.
		// �������̽���<Ÿ�� ����> �������� = new ����Ŭ���� ������<Ÿ�� ����>();
		List<Movie> list3 = new ArrayList<Movie>();
		list3.add(new Movie("��Ʈ��","8.78","�� ���꽺","2022 ����"));
		list3.add(new Movie("��ũ ����Ʈ ������","9.02","�� �Ͽ���","2022 �簳��"));
		
		Movie m = new Movie();
		m.setmTitle("�����¡ �׷��̽�");
		m.setmGrade("8.62");
		m.setmDirector("�õ�� ����, ���� ������Ʈ");
		list3.add(m);
		
		// ������ ������ �ε��� ����
		for (Movie value : list3) {
			System.out.println(value.toString());
		}
		System.out.println();
		
		// �ݺ���
		Iterator<Movie> it = list3.iterator();
		while(it.hasNext()) {
			// Movie me = it.next();
			// system.out.println(me.toString());
			
			System.out.println(it.next().toString());
		}
	}

}
