package �÷���3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//1, 1���� 100�߿� ������ ������ 10���� ��� �����͸� ������ �� ����ϰ� ������������ �����Ͽ� �����͸� ����Ѵ�. (�ߺ� ���)
//* - Random
//* - ArrayList 
//* - Sort
public class RandomList {

	public static void main(String[] args) {
		Random r = new Random();
		
		// ������ ���ڸ� ��´�.
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(r.nextInt(100)+1);
		}
		
		System.out.println("���� �� list ������");
		// �ݺ��ڸ� ����Ѵ�.
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
		// �����Ѵ�: sort
		Collections.sort(list);
		System.out.println("\n���� �� list ������");
		for(Integer i : list) {
			System.out.print(i+ "\t");
		}
		
	}

}
