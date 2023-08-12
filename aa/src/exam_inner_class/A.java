    package exam_inner_class;

public class A {

	
	class B{
		int Field;
		// static int value; // 인스턴스 멤버 클래스는 static 멤버를 가질 수 있다.
		
		B() {
			int num  = 5;
			int number = 3;
			System.out.println("B 객체가 생성됨");
		}                                        
		void method1() {
			System.out.println("num : " +  num);
			System.out.println("number : " + number);
			System.out.println("field1 : "+field1);
		}
	}
	/** 내부 클래스 - 정적 멤버 클래스 **/
	static class C{
		int field1;
		static int field2;
		
		C(){
			//nume = 10; // 정적멤버클래스는 인스턴스 멤버를 가질 수 없다.
			number = 0;
			System.out.println("C 객체가 생성됨");
		}
		void method1() {
			System.out.println("field1 : "+ field1);
		}
		static void method1() {
			System.out.println("field : "+field2);
		}
	}
}
