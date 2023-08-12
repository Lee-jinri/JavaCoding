package ����2;

/* ���̵�� ���̸� �ʵ�� ���� Member Ŭ������ �����Ѵ�.
 * ������ ��ü�� �����Ͽ� ���̰� ������ �� ��ü�� "�����մϴ�"
 * �Ǵ� ���̰� �ٸ��� �� ��ü�� "�������� �ʽ��ϴ�"��� ����� �� �ֵ���
 * ����Ŭ������ �ۼ��ϼ���
 */

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue1234",25);
		Member m2 = new Member("blue1234",27);
		Member m3 = new Member("yellow77",25);
	
		// ��ü�� ������ �� -> ���̸� ������ �ʰ� �ּҸ� ���ع���~!
		System.out.println("m1==m2 = " + (m1 == m2));
		// �������� �ּҰ��� �ٸ��⶧���� false
		
		m3 = m1;
		System.out.println("m1==m3 = "+(m1 == m3));
		// �ּҰ��� �����ϰ� ������� ������ true
		
		// equals()�޼��� ������ �� �ٽ� Ȯ��.
		if(m1.equals(m2)) {
			System.out.println("m1�� m2�� �����մϴ�.");
		}else {
			System.out.println("m1�� m2�� �������� �ʽ��ϴ�.");
		}
		// �������� �ּҰ��� �ٸ��⶧���� false
		
		if (m1.equals(m3)) {
			System.out.println("m1�� m3�� �����մϴ�.");
		}else {
			System.out.println("m1�� m3�� �������� �ʽ��ϴ�.");
		}
		// �ּҰ��� �����ϰ� ������� ������ true
	}

}
