package Ŭ����;

class Count{
	private static int totalCount;
	private int count;
	
	// ������
	public Count() {
		totalCount++;
		count++;
	}
	
	public void display() {
		System.out.println("count: " + count);
		System.out.println("totalCount: " + totalCount);
		
		System.out.println();
	}
}

public class CountTest {
	public static void main(String[] args) {
		Count obj1 = new Count();
		obj1.display();
		
		// count: 1
		// totalCount: 1
		
		Count obj2 = new Count();
		obj2.display();
		
		// count: 1
		// totalCount: 2
		
		Count obj3 = new Count();
		obj3.display();
		
		// count : 1
		// totalCount: 3
		
		// �ν��Ͻ� ����� �ν��Ͻ� ������ ������ ���ο� ������ �Ҵ�޴´�.
		// ��������� ��� �ν��Ͻ����� �����Ͽ� ����ϴ� ���̴�.

	}

}
