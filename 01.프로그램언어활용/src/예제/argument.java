package ����;

/* ������
 * Run -> Run Configurations���� Arguments�� ����
 * Program arguments�� ���� �Է��ϰ� Run�� Ŭ���Ѵ�.
 */

public class argument {

	public static void main(String[] args) {
		
		
		if (args.length == 0) {
			System.out.println("����� ����ڸ��� �Է����ּž��մϴ�.");
			System.exit(0);
		}
		
		System.out.println("�ȳ��ϼ���." + args[0] + "��!");
		
		

	}

}
