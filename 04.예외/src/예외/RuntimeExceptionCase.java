package ����;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		// RuntimeException ���� - ��üũ ����. (�Ű澴�ٸ� ���� �߻����� ���� �ڵ�)
		
		// ArrayIndexOutOfBoundsException ���� �߻�
		try {
			int[] arr = new int[3]; // �ε��� 3���ε�
			arr[4] = 20;			// �ε��� 4���� ���� �������� �ؼ� ���� �߻�
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// ClassCastException ���� �߻�
		try {
			Object x = Integer.valueOf(0); // �ڹٿ��� ��Ӱ��� �ֻ��� Object
					// x = int0�� heap �����ϰ� �� �ּҰ��� �ּ���-> �ּҰ��� �ִ� int�� ��
					// �� �޼ҵ�� Ŭ������.�޼ҵ� -> �����޼ҵ�
			// �θ� Ŭ������ �������� = new ����Ŭ����������();
			System.out.println((String) x);  
			// Ŭ���� ����ȯ �߸��� int -> String���� �ٲ� �� ����.
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		// NegativeArraySizeException ���� �߻�
		try {
			int[] arr= new int[-10]; // �迭�� ũ��� �������� ���� �� ����.-> ���� �߻�
			System.out.println(arr.toString());
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
		// NullPointerException ���� �߻� - ����ϱ�
		try {
			String str = null;		  // �ƹ� �͵� �������� �ʰ� null���� �൵ �̹� null���� ��������	
			@SuppressWarnings("null") // null���� üũ���� ����.
			int len = str.length();	  // str�� ���� ���� ���ϼ��� -> �ƹ� ���� ���µ� ���̸� ���϶�� �ؼ� ����	
			System.out.println(len);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// NumberFormatException ���� �߻�
		try {
			String data1 = "100";    // ���ڿ��� 100�� ����
			String data2 = "a100";	 // ���ڿ��� a100�� ����
			
			int value1 = Integer.parseInt(data1);   // IntegerŬ������ ���ڸ� ���ڷ� �ٲ� �� �ִ� �޼ҵ� parseInt
			int value2 = Integer.parseInt(data2);	// ���ڷ� ������ �Ұ��� ���ڿ� -> a100�ε� int�� �ٲٷ��� �ؼ� ���� 
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "+" + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
