    package exam_inner_class;

public class A {

	
	class B{
		int Field;
		// static int value; // �ν��Ͻ� ��� Ŭ������ static ����� ���� �� �ִ�.
		
		B() {
			int num  = 5;
			int number = 3;
			System.out.println("B ��ü�� ������");
		}                                        
		void method1() {
			System.out.println("num : " +  num);
			System.out.println("number : " + number);
			System.out.println("field1 : "+field1);
		}
	}
	/** ���� Ŭ���� - ���� ��� Ŭ���� **/
	static class C{
		int field1;
		static int field2;
		
		C(){
			//nume = 10; // �������Ŭ������ �ν��Ͻ� ����� ���� �� ����.
			number = 0;
			System.out.println("C ��ü�� ������");
		}
		void method1() {
			System.out.println("field1 : "+ field1);
		}
		static void method1() {
			System.out.println("field : "+field2);
		}
	}
}
