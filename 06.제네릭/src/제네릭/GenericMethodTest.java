package ���׸�;

public class GenericMethodTest {
	public static <T extends Number, V extends T> boolean isInclude(T num, V[] array) { // ���� ���� �����ϴ� �޼���
			// T �� �ѹ�Ŭ����(��Ƽ��,����)�� ���� ��ӹ��� ����Ŭ������ Ÿ��, V�� T �Ǵ� T�κ��� ��ӹ��� ����Ŭ����
		for (int i = 0; i < array.length; i++) { // �迭�� ���� ���Ҽ� ���� ���� ����
			if (array[i] == num) {
				return true;			// �����մϴ�.
			}
		}
			return false;				// �������� �ʽ��ϴ�.
	}
	
	

	public static void main(String[] args) {
		Integer[] inum = { 1, 2, 3, 4 ,5 };  // �迭 ����
		System.out.println("��� : " + GenericMethodTest.<Integer, Integer>isInclude(3, inum));
						// ȣ���� �� Ŭ������(���߰����ؼ� ����) �޼ҵ��.<Ÿ������, T�κ��� ��ӹ��� V�� Ÿ�� = int>
						// 3�� inum�� ���ԵǾ� �ֽ��ϱ�??
		
		boolean b1 = isInclude(3, inum); // 3�� inum�� ���ԵǾ� �ִ�? ���ԵǸ� true �ƴϸ� false
		System.out.println("��� : " + b1);
		
//      false ����. 5.0���� ���ƺ������� �Ҽ����ڸ����� ��Ȯ�ϰ� ��ġ���� �ʾƼ� �Ǽ��� ���� �� ������ �� �ƴϸ� Ŭ���� �����ؼ� ��
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0};  // �Ǽ������� �ٽ�
		boolean b2 = isInclude(5.0, dnum); // 5.0�� dnum�� ���ԵǴ�??
		System.out.println("��� : " + b2);
	
		System.out.println("��� : " + GenericMethodTest.<Double, Double> isInclude(5.0, dnum));
													//	<  T     ,  V  >	
		
		/* String[] snum = { "one", "two", "three", "four", "five"};
		isInclude("one", snum);      // �� �޼��忡 StringŸ�� �ȵ�. Number�� ����Ŭ�����鸸 ����.
		System.out.println("��� : " + GenericMethodTest.<String, String>isInclude("one",snum));*/
		
	}
	
	

}
