package exam_inner_class;

public class Main {
	A a = new A();
	
	// �ν��Ͻ� ��� Ŭ���� ��ü ����
	A.B b = a.new B();
	// A.B b = new A().new B();
	b.field1 = 3;
	b.method1();
	System.out.println();
	
	// ���� ��� Ŭ���� ��ü ����
	A.C c = new A.C();
	c.field1 = 3;
	c.method1();
	
	A.C.field2 = 3; // �����ʵ�, �ܺ�Ŭ����.����Ŭ����.�����ʵ�
	A.C.method2();  // �����޼ҵ�, �ܺ�Ŭ����. ����Ŭ����.�����޼ҵ�
	System.out.println();
}
