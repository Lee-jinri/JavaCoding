package StaticMethodTest;

public class StaticMethodTest {
	private static int num1 = 5;  // �����ʵ�, Ŭ���� �ʵ� ����
	private int num2 = 3;		  // �ν��Ͻ� �ʵ�
	public static void main(String args[]) {
		StaticMethodTest.print1();
		print1();
		
//		StaticMethodTest.print2();  // Ŭ������.�޼���() �̰� �߸���, ������ ���� �ʾƼ� ����� �� ����
//		print2();
		
		StaticMethodTest method = new StaticMethodTest();
		method.print2();		    // �ν��Ͻ� ���� ��������.�޼���()
	}
	
	public static void print1() { // ���� �޼���, Ŭ���� �޼���
		int num3 = num1;		  // �����̶� ȣ�Ⱑ��
//		int num4 = this.num2;     // num2�� ������ ����. ����غ� ���� �ʾƼ� ����� �� ����.
		System.out.println(num3);
		System.out.println("Hello");
	}
	
	public void print2() {        // �ν��Ͻ� �޼���
		int num3 = num1;
		int num4 = num2;
		System.out.println(num3 + "," + num4);
		System.out.println("Java");
	}

}
