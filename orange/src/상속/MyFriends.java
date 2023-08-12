package 상속;

public class MyFriends {

	public static void main(String[] args) {
		
		// 배열에 Friend클래스를 저장 10개의 공간을 받는다.
		Friend[] fr = new Friend[10];
		int num = 0;
		
		// Friend[0] = new UnivFrind(~~)
		// Friend배열 0번 인덱스에 1명의 친구가 저장됨!
		fr[num++] = new UnivFriend("LEE","Computer","010-333-555");
		fr[num++] = new UnivFriend("KIM","Art","010-123-456");
		fr[num++] = new CompFriend("YOON","R&D","010-777-7777");
		fr[num++] = new CompFriend("PARK","R&D2","010-987-654");
		
		// 전체 친구들의 정보를 출력한다
		for(int i = 0; i < num; i++) {
			fr[i].showInfo();  // 오버라이딩한 메소드 출력
			System.out.println();
		}
	}

}
