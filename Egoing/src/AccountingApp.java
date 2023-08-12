
public class AccountingApp {
	
	// 공급가액
	public static double valueOfSupply = 10000.0;
	
	// 부가가치세율
  	public static double vatRate = 0.1;


	public static double getVAT() {
		return	valueOfSupply * vatRate;

	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public static void main(String[] args) {
		
		// 공급가액
		// valueOfSupply 는 main에서만 사용할 수 있는 지역 변수라서
		// 위에 public static double valueOfSupply를 AccountingApp 클래스
		// 안에 넣어 주는 것 
		// double valueOfSupply = 10000.0;
		
		// 부가가치세율
		// double vatRate = 0.1;

		// 부가세
		// double vat = valueOfSupply * vatRate;
		double vat = getVAT(); 
		
		//합계
		// double total = valueOfSupply + vat;
		double total = getTotal();
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
	}

}
