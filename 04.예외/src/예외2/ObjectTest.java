package ����2;

// object Ŭ����
public class ObjectTest {
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result1 = (obj1 == obj2);
		System.out.println("obj1 == obj2 = " + result1);
		// �������� �ٸ��� ������ false
		
		boolean result2 = obj1.equals(obj2);
		System.out.println("obj1.equals(obj2) = " +result2);
		// �������� �ٸ��� ������ false
		
	}

}
