package ����;

public class Operator {
	public static void main(String[] args) {
		
		// ���Կ�����
		int a = 10;
		int b = 5;
		
		a += b; // a = a + b == 15
		a -= b; // a = a - b == 5
		a *= b; // a = a * b == 50
		a /= b; // a = a / b == 2
		a %= b; // a = a % b == 0

		
		// ����������
		// && = AND �� �� ������ true
		// || = OR �� �߿� �ϳ��� ������ true
		
		int x = 3;
		int y = 4;
		
		System.out.println((x == 3) && (y == 7));  // false
		System.out.println((x == 3) || (y == 7) ); // true
	
		boolean result = ((++x == 3) && (y++ == 7)); // x = 4, y = 7 / x�� false�̱� ������ y�� ����x
		
		System.out.println("x = " + x + ", y = " + y); // x = 4, y = 4
		System.out.println("result = " + result);	   // false
	
		
		result = (x++ == 4) || (++y == 7);		 // x = 4, y = 4 / x�� true�̱� ������ y�� ����X
		
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("result = " + result);
	
	}
}
