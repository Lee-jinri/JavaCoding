
public class AccountingApp {
	
	// ���ް���
	public static double valueOfSupply = 10000.0;
	
	// �ΰ���ġ����
  	public static double vatRate = 0.1;


	public static double getVAT() {
		return	valueOfSupply * vatRate;

	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public static void main(String[] args) {
		
		// ���ް���
		// valueOfSupply �� main������ ����� �� �ִ� ���� ������
		// ���� public static double valueOfSupply�� AccountingApp Ŭ����
		// �ȿ� �־� �ִ� �� 
		// double valueOfSupply = 10000.0;
		
		// �ΰ���ġ����
		// double vatRate = 0.1;

		// �ΰ���
		// double vat = valueOfSupply * vatRate;
		double vat = getVAT(); 
		
		//�հ�
		// double total = valueOfSupply + vat;
		double total = getTotal();
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
	}

}
