package 예외2;

// object 클래스
public class ObjectTest {
	public static void main(String[] args) {
		// 인스턴스 생성
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result1 = (obj1 == obj2);
		System.out.println("obj1 == obj2 = " + result1);
		// 참조값이 다르기 때문에 false
		
		boolean result2 = obj1.equals(obj2);
		System.out.println("obj1.equals(obj2) = " +result2);
		// 참조값이 다르기 때문에 false
		
	}

}
