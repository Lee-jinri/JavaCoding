package basic;

public class Repetitive {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		int big;    // ū��
		int diff;   // ����

		if(num1 > num2)
			big = num1;
		else
			big = num2;
		
		if(num1 > num2)
			diff = num1 - num2;
		else
			diff = num2 - num1;
		
		System.out.println("ū �� : " + big);
		System.out.println("���� : " + diff);

	

	// 5�� �������� ����Ѵ�
	for(int i = 1; i < 10; i++) {
		System.out.println("5 * " + i + " = " + (5*i));
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
