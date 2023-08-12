package Example;

public class WrapperController {

	public void wrapMethod() {
		// 1. Boxing (�⺻�ڷ��� -> Class), UnBoxing (Class -> �⺻�ڷ���)
		// �߻�Ŭ���� Number�� ��ӹ޴´�
		Number num = new Integer(10); 
		
		Integer i1 = 1; // ���ͷ� (autoBoxing) : int���� IntegerŬ������ ����ȯ���� �ʾҴµ��� ��ȯ��.
		Integer i2 = new Integer(1); // �������� �Ű������� ���� ��ȯ
		Double i3 = new Double(10);
		
		System.out.println(i1.equals(i2)); // true
		System.out.println(i1.compareTo(i2)); // 0 : ���� ���̸� 0, i1�� ũ�� 1, i2�� ũ�� -1�� ����
		
		// autoUnBoxing
		int in = new Integer(1); // Integer ��ü�� ������� 1�� int in�� ����ȯ ���� �ʾƵ� ������ �� ����

	}

	public void strToPrim() {
		
		// parse�� ����ؼ� String�� �⺻�ڷ������� �ٲ�
//		byte b = Byte.parseByte("1");
//		short s = Short.parseShort("2");
//		int i = Integer.parseInt("3");
//		long l = Long.parseLong("4");
//		float f = Float.parseFloat("0.1");
//		double d = Double.parseDouble("0.2");
//		boolean b1 = Boolean.parseBoolean("true"); // ���ڿ��� true�� ���� true, true�� �ƴҶ��� false
//		System.out.println(b1);
		
		// java 1.5 ���� ���ĺ��ʹ� valueOf ��� ���� / �̰� �� ����
		byte b = Byte.valueOf("1");
		short s = Short.valueOf("2");
		int i = Integer.valueOf("3");
		long l = Long.valueOf("4");
		float f = Float.valueOf("0.1");
		double d = Double.valueOf("0.2");
		boolean b1 = Boolean.valueOf("7");
		
		// char�� �ٸ�
		char c = "abc".charAt(1); // 1�� �ε����� char c�� �ٲ�
	
	}

	public void PrimToStr() {
		String b = Byte.valueOf((byte)1).toString();  // downCastin�� ������ ������ int������ �ν�
		String s = Short.valueOf((short)2).toString();// downCastin�� ������ ������ int������ �ν�
		String i = Integer.valueOf(3).toString();
		String l = Long.valueOf(4L).toString();    // long������ �ٲ� ���� L�ٿ�����
		String f = Float.valueOf(0.1f).toString(); // float������ �ٲ� ���� f�ٿ�����. f �Ⱥ��̸� double������ ��
		String d = Double.valueOf(0.2).toString();
		String b1 = Boolean.valueOf(true).toString();
		String c = Character.valueOf('a').toString();
		
	}

}
