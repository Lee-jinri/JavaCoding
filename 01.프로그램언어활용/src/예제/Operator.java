package 예제;

public class Operator {
	public static void main(String[] args) {
		
		// 대입연산자
		int a = 10;
		int b = 5;
		
		a += b; // a = a + b == 15
		a -= b; // a = a - b == 5
		a *= b; // a = a * b == 50
		a /= b; // a = a / b == 2
		a %= b; // a = a % b == 0

		
		// 증감연산자
		// && = AND 둘 다 옳으면 true
		// || = OR 둘 중에 하나만 옳으면 true
		
		int x = 3;
		int y = 4;
		
		System.out.println((x == 3) && (y == 7));  // false
		System.out.println((x == 3) || (y == 7) ); // true
	
		boolean result = ((++x == 3) && (y++ == 7)); // x = 4, y = 7 / x가 false이기 때문에 y는 실행x
		
		System.out.println("x = " + x + ", y = " + y); // x = 4, y = 4
		System.out.println("result = " + result);	   // false
	
		
		result = (x++ == 4) || (++y == 7);		 // x = 4, y = 4 / x가 true이기 때문에 y는 실행X
		
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("result = " + result);
	
	}
}
