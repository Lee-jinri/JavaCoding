package exam_inner_class;

import exam_inner_class.OuterClass2.InnerClass2;

class OuterClass2 {
	private int num;	// OuterClass2 Ŭ������ ���ʵ�
	public OuterClass2() {
		this.num =100; 	
	}
	class InnerClass2{
		int num = 200;	// InnerClass2 Ŭ������ �ʵ�
		public void method() {
			int num = 300; // ��������
			
			int localNum = num;
			System.out.println("localNum + "+localNum);
			
			int innerNum = this.num;
			System.out.println("innerNum = " + innerNum);
			
			int outerNum = OuterClass2.this.num;
			System.out.println("outerNum = " + outerNum);
		}
	}
}

public class OuterClassTest2{
	public static void main(String args[]) {
		OuterClass2.InnerClass2 inner = new OuterClass2.InnerClass2();
		inner.method();
	}
}