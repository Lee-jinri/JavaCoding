package Ŭ����;

		
		// ���� ������ ���� �޼ҵ�
		
		/* ����(static) �����?
		 * Ŭ������ �Ҽӵ� ���
		 * ��ü ���ο� �������� �ʰ�, �޼ҵ� ����(�ڵ� ����)�� ����
		 * ��ü�� �������� �ʰ� Ŭ������ �ٷ� �����ؼ� ���
		 * 
		 * ������� ����
		 * public class Ŭ����{
		 *  // �����ʵ�
		 *  static �ڷ��� �ʵ�;
		 *  
		 *  	 // ���� �޼���
		 * 		public static ����Ÿ�� �޼���(�Ű�����...)
		 *   }
		 *   
		 *   �ν��Ͻ� ������ ���� ����
		 *   
		 *   �ν��Ͻ� ���� : ��ü���� ������ �־�� �� ������
		 *   �޸� �Ҵ� ���� : �ν��Ͻ� ������  Car car1 = new Car()
		 *   �޸� �Ҵ� ��ġ : �� �޸�
		 *   �޸� ���� ���� : �ν��Ͻ� �Ҹ��
		 *   
		 *   �������� : �������� ������
		 *   �޸� �Ҵ� ���� : ���α׷� ���۽�
		 *   �޸� �Ҵ� ��ġ : �ڵ� �޸�
		 *   �޸� ���� ���� : ���α׷� �����
		 *   
		 *   Public class Calculator{
		 *   	String color;
		 *   	static double PI = 3.141592;  pi���� ��ü�� ��� �����ص� ���� �ٲ��� �ʱ⶧���� ��ü�� ������ �ʿ䰡 ����
		 *   }   
		 */
		
//		class Count {
//			public static int totalCount;  // Ŭ���� �ʵ�
//			public int count;   // �ν��Ͻ� �ʵ�
//		}
//		class CountTest{
//			public static void main(String[] args) {
//				System.out.println("main���� ����");
//				Count c1 = new Count();
//				Count c2 = new Count();
//				Count c3 = new Count();
//			}
//		}

		/* ���� : main   c1 &�ּڰ� 
		 *  			c2 &�ּڰ�
		 *   			c3 &�ּڰ�
		 *   				��
		 * ��   : totalCount &�ּڰ�, count 0 
		 * 		  totalCount &�ּڰ�, count 0 
		 * 		  totalCount &�ּڰ�, count 0
		 * 				    ��
		 * �޼ҵ� ���� : totalCount 0
		 * �ν��Ͻ��� �����ؼ� ����ϱ� ������ totalCount��
		 * 
		 * Ŭ���� �δ��� main() �޼ҵ尡 ���۵Ǳ� ���� �ε��� ��� Ŭ������ ���캸��  
		 * static ����� ���� ����� �޸��� �ڵ� ������ �Ҵ�
		 */
		
//		class Car{
//			private int speed;
//			private int gear;
//			private String color;
			
			// ��üȭ�� Car ��ü�� ������ ���� ���� ����
//			private static int numberOfCars = 0;  // ���� ���
//			
//			public Car(int speed, int gear, String color) {
//				this.speed = speed;
//				this.gear = gear;
//				this.color = color;
//				++numberOfCars;
//			}
//		}

		/* 
		 * Ŭ���� �ʵ带 ����Ҷ��� ���������� �ʿ����
		 * [Ŭ���� �ʵ� ���]
		 * Ŭ������.�ʵ��
		 */
		
	/* ���� �޼ҵ�(static method)
	 * ������ �޼���� static�� ����Ǹ� ������ main() �޼��尡 ����Ǳ� ���� �ڵ� �޸� ������ �����Ǿ� ����غ� �Ϸ�ȴ�.	
	 * �ν��Ͻ� ������ �����ϰ� ����ϴ� �޼���� static���� �����Ѵ�
	 * ���α׷� ���� �� �ڵ����� ��� �غ� �Ϸ�
	 * 
	 * 
	 	* [Ŭ���� �޼��� ���]
	 	* Ŭ������.�޼����();
	 	*/
		// ex)
//		double value = Math.random();
//		int result = Math.max(3, 7);
//		String.format(null, args);
//		
		/* [���� ��� ���]
		 * Ŭ�����̸��� �Բ� ��Ʈ(.)�����ڷ� ����
		 */
//		public class Calculator{
//			public static final double PI = 3.141592;
//			public static int plus(int x, int y) {return x + y;}
//			public static int minus(int x, int y) {return x - y;}
//		}
		// O
//		double result = 5*5*Calculator.PI;
//		int resutl2 = Calculator.plus(3,9);
//		int result3 = Calculator.minus(7,2);
		
		// X
		// Calculator c = new Calculator(); 
		// �̹� ������ �޾ұ� ������ new �� �ص� ��
		
		/*
		 * ���� �޼ҵ�� ��ü�� �������� �ʴ� ���¿��� ȣ��Ǵ� �޼����̴�.
		 *
		 * static main() �̷��� ��������
		 * : JVM���� ��ü�� ������ �ʿ���� main()�� ����ϱ� ����
		 * 
		 * - �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ� ��� X
		 * - ���� ������ ������������ ���
		 * - ���� �޼ҵ忡�� ���� �޼ҵ带 ȣ���ϴ� �� O
		 * - ���� �޼ҵ�� this��� �Ұ�
		 *  : this�� ������ �ν��Ͻ��� ���� ������
		 */
		
		// ex
//		public class Test{
//			public static void main(String args[]) {
//				add(10,20);
//			}
//		}
		
//		public int add(int x, int y) {      �̰� �Ұ���
//			return x + y;
//		}
		
//		public static int add(int x, int y) {
//			return x+y
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
