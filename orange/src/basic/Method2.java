package basic;

public class Method2 {

	public static void main(String[] args) {
		
		System.out.println(SquareArea(3));
		System.out.println(SquareCircumference(3));
	}

	public static double SquareArea(double r) {
		
		// ���� ���� = r * r * 3.14
		final double PI = 3.14; 
		return r * r * PI;
	}
	public static double SquareCircumference(double r) {
		
		// ���� �ѷ� = 2 * 3.14 * r
		final double PI = 3.14;
		return 2 * PI * r;
	}
}
