package �÷���;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest2 {
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\t"); // ���� �ϰ� ����
		}
		System.out.println();
		
		// ��ũ�� ����Ʈ�� �޼ҵ�~~
		
		list.add(1, "LA");  // 1 : [����, LA, �ϰ�, ����]
		print(1, list);
		
		list.addFirst("����"); // 2 : [����, ����, LA, �ϰ�, ����]
		print(2, list);
		
		list.addLast("����");  // 3 : [����, ����, LA, �ϰ�, ����, ����]
		print(3, list);
		
		list.offer("�ĸ�");    // offer()�� ���޵� ��Ҹ� ������ ��ҷ� �߰�
		print(4, list); 	  // 4 : [����, ����, LA, �ϰ�, ����, ����, �ĸ�]
		
		list.offerFirst("�θ�"); // 5 : [�θ�, ����, ����, LA, �ϰ�, ����, ����, �ĸ�]
		print(5, list);
		
		list.offerLast("����"); // 6 : [�θ�, ����, ����, LA, �ϰ�, ����, ����, �ĸ�, ����]
		print(6, list);
		
		System.out.println("7 : " + list.peek());  // peek() �޼���� ���� ù ��° ��Ҹ� ��ȯ. 7 : �θ�
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast()); // peekLast()�� ������ ��Ҹ� ��ȯ
		
		list.poll(); // poll() ���� ù ��° ��Ҹ� ��ȯ�ϰ� ����
		print(10, list);  // [����, ����, LA, �ϰ�, ����, ����, �ĸ�, ����]
		
		list.pollFirst(); // pollFisrt() ���� ù��° ��Ҹ� ��ȯ�ϰ� ����
		print(11, list);  // [����, LA, �ϰ�, ����, ����, �ĸ�, ����]
		
		list.pollLast(); // pollLast() ���� ������ ��Ҹ� ��ȯ�ϰ� ����
		print(12, list); // [����, LA, �ϰ�, ����, ����, �ĸ�]
		
		// ī�信 ���� �� ����~~
		
		
	}

}
