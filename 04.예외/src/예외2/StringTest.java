package ����2;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		
		if(str1 == str2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("���� �ٸ� ��ü");
		}
		
		// �⺻������ == �����ڿ� ������ ��� ���� (�ּڰ� ��)
		String strData1 = new String("Java");
		String strData2 = new String("Java");

		if(strData1 == strData2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("���� �ٸ� ��ü");
		}  // ==�� �ּҰ��� ���ϱ⶧���� �ٸ� ��ü��� ����
		
		// ���� �����̶�? ���� ��ü�̰� �ٸ� ��ü�̰� ������� ��ü ���� ������ ����
		// equals() �޼��带 ����Ѵ�.
		if(strData1.equals(strData2)) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("���� �ٸ� ��ü");
		} // equals�� ���� ���������� ���⶧���� ���� ��ü
		
	}

}
