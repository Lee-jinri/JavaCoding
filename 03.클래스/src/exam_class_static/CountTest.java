package exam_class_static;

class Count{
	private static int totalCount;	 // 정적
	private int count;				 // 인스턴스 : 사용하려면 new를 사용해서 메모리할당 받아야됨
	
	// 생성자
	public Count() {
		totalCount++;
		count++;
	}
	
	public void display() {
		System.out.println("count : " + count);
		System.out.println("totalCount : " + totalCount);
		
		System.out.println();
	}
}
public class CountTest {
	public static void main(String[] args) {
		Count obj1 = new Count();   // obj는 스택에 공간을 new는 힙에 공간을 할당받는다
		obj1.display();
		
		Count obj2 = new Count();
		obj2.display();
		
		Count obj3 = new Count();
		obj3.display();
		
		
		/* 
		 * totalcount는 인스턴스가 한 totalcount의 한 공간을 공유해서 사용하는 것이기 때문에
		 * 1 2 3 이 됨
		 * count는 인스턴스가 따로 생성되는 것
		 * 그래서 1 1 1
		 */
		
	}

}
