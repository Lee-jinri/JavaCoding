package StaticMethodTest;

public class StaticMethodTest {
	private static int num1 = 5;  // 정적필드, 클래스 필드 선언
	private int num2 = 3;		  // 인스턴스 필드
	public static void main(String args[]) {
		StaticMethodTest.print1();
		print1();
		
//		StaticMethodTest.print2();  // 클래스명.메서드() 이건 잘못됨, 공간을 받지 않아서 사용할 수 없듬
//		print2();
		
		StaticMethodTest method = new StaticMethodTest();
		method.print2();		    // 인스턴스 생성 참조변수.메서드()
	}
	
	public static void print1() { // 정적 메서드, 클래스 메서드
		int num3 = num1;		  // 정적이라서 호출가능
//		int num4 = this.num2;     // num2는 공간이 없음. 사용준비가 되지 않아서 사용할 수 없음.
		System.out.println(num3);
		System.out.println("Hello");
	}
	
	public void print2() {        // 인스턴스 메서드
		int num3 = num1;
		int num4 = num2;
		System.out.println(num3 + "," + num4);
		System.out.println("Java");
	}

}
