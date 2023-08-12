package 클래스;

class Count{
	private static int totalCount;
	private int count;
	
	// 생성자
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
		
		// 인스턴스 멤버는 인스턴스 생성될 때마다 새로운 공간을 할당받는다.
		// 정적멤버는 모든 인스턴스에서 공유하여 사용하는 것이다.

	}

}
