package ���;

public class MyFriends {

	public static void main(String[] args) {
		
		// �迭�� FriendŬ������ ���� 10���� ������ �޴´�.
		Friend[] fr = new Friend[10];
		int num = 0;
		
		// Friend[0] = new UnivFrind(~~)
		// Friend�迭 0�� �ε����� 1���� ģ���� �����!
		fr[num++] = new UnivFriend("LEE","Computer","010-333-555");
		fr[num++] = new UnivFriend("KIM","Art","010-123-456");
		fr[num++] = new CompFriend("YOON","R&D","010-777-7777");
		fr[num++] = new CompFriend("PARK","R&D2","010-987-654");
		
		// ��ü ģ������ ������ ����Ѵ�
		for(int i = 0; i < num; i++) {
			fr[i].showInfo();  // �������̵��� �޼ҵ� ���
			System.out.println();
		}
	}

}
