package ���׸�;
/* ������ Ÿ���� �Ű����� 
 * Ÿ�� �Ű����� T�� ������ Ŭ���� MyMath
 * MyMath���� ����� ���ϴ� getAverage()�޼ҵ带 �߰�
 * ����� ���� �� �ֵ��� �Ѵ�.
 */

// ������ Ÿ���� ���׸� Ŭ����
class MyMath<T extends Number>{ 
	double v = 0.0;
	public double getAverage(T[] a) {		// ��� ���ϴ� �޼ҵ� 
		for (int i = 0; i < a.length; i++)		
			v = v + a[i].doubleValue();
		return v/a.length;
	}
}

//����Ŭ����
public class MyMathExample {  

	public static void main(String[] args) {
		Integer[] list = { 1, 2, 3, 4, 5, 6 };
		
		MyMath<Integer> m = new MyMath<Integer>(); // m �������� = �����Ҵ� new ���ʸ�Ŭ���� ������ ȣ���մϴ�~
		System.out.println(m.getAverage(list));	// ��� ���ϴ� �޼��� ȣ��, ����Ʈ�� integerŸ��~~~

	}

}
