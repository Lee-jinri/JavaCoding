package API;

public class AudoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//�������
		// �ڵ� Boxing
		Integer obj = 100;
		// Integer obj = Integer.valueOf(100); Ŭ������ �������� = new ������() �Ǵ� Ŭ������ �������� = Ŭ������.�����޼���()
		System.out.println("value: " +obj.intValue());
		
		// ���Խ� �ڵ� Unoxing
		int value = obj;
		// int value = obj.intValue(); // �̺κ��� ����Ǿ ���� ����
		System.out.println("value : " +value);
		// �������
		
		// ����� �ڵ� Unboxing
		int result = obj + 100;
		// int result = obj.intValue()+100;
		System.out.println("result : " + result);
		
		Double dValue = 5.7;
		// Double dValue = Double.valueOf(5.7)
		System.out.println(dValue + 6.7);
		// dValue.doubleValue() + 6.7;
		// "10" + "20"
		int n = Integer.parseInt("10");		// ���ڿ��� ���������� ��ȯ
		System.out.println("n : " + n);
		
		String m = String.valueOf(9);		// �������� ���ڿ��� ��ȯ
		System.out.println("m : " + m);
		
		// ���ڿ� �Ǽ��� -> �Ǽ�������
		double d = Double.parseDouble("8.9");
		System.out.println("d : " + d);
		
		// �Ǽ��� - > ���ڿ� �Ǽ�������
		String d1 = String.valueOf(4.8);
		System.out.println("d1 : " + d1);
		
		Integer obj1 = Integer.valueOf("4");
		System.out.println(obj1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
