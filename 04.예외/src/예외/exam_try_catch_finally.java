package ����;

public class exam_try_catch_finally {

	public static void main(String[] args) {
		
		// ����ó�� 
		// try 
		// 	{���ܰ� �߻��� �� �ִ� �ڵ� 
		// } catch(�������� ��������) 
		// {���ܸ� ó���ϴ� �ڵ�
		// } finally {�� �ڵ�� try�� ������ ������ ����ȴ�
		// } 
		
		// ����κ��� �������� �� �ƴϴϱ� �ٱ���~~~
		int x = 1;
		int y = 0;
		
		try {
			int result = x / y;
			System.out.println("result :"+result);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());  // ���ܰ� ������ �ִ� message ���
			e.printStackTrace();                 // ���ܹ߻� ��θ� ����
		} // finally ��� �ʿ��� ���� 
		System.out.println("���α׷��� ��� ����˴ϴ�.");
		
		

	}

}
