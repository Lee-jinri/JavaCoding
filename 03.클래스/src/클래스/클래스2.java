package Ŭ����;

public class Ŭ����2 {

		
		/* ������
		 * Ŭ������ �����ϴ� �޼��� �� �ϳ�
		 * �Ϲ� �޼���� ����
		 * 1. �ν��Ͻ� ������ �ڵ����� ȣ��
		 * 2. ��ȯ�� X
		 * 3. Ŭ���� �̸��� ����. 
		 * 4. �̸��� �빮�ڷ� ����
		 */
		
		public class Member{
			private String name;
			private int age;
			public Member() {
			}
			public void setName(String name) {
			}
		}
		
		
		/* Member()�� ����Ÿ���� ���� �޼��� �̸��� �빮�ڷ� �����Ѵ�
		 * ������   ����Ÿ�� x          �Ű����� ����o
 		 * public            Member (         ) {
		 * 	�޼��� ����
		 * }
		 * �̷��� ������ �����ڶ�� �Ѵ�
		 * 
		 * �������� Ư¡
		 * 1. �޼����� ����
		 * 2. ����Ÿ���� �������� �ʴ´�
		 * 3. �Ҽӵ� Ŭ������ �̸��� ����
		 * 4. �ʵ��� �ʱ�ȭ�� ����Ѵ�
		 * 5. �ν��Ͻ� ���� �� �ڵ����� ȣ��ȴ�
		 * 
		 * �������� ��� ����
		 * - �ν��Ͻ��� ������ �� �ʵ带 �ʱ�ȭ�ϱ� ���� ��
		 * �����ڴ� �Ϲ� �޼��� ó�� �����Ӱ� ȣ���ϴ� ���� �ƴ϶�
		 * �ν��Ͻ��� ������ �� �ڵ����� ȣ��ȴ�.
		 * 
		 * [������ ����]
		 * ���� ������ Ŭ������(�Ű�����){
		 * ���๮;
		 * }
		 * 
		 * [������ ����]
		 * new Member();
		 * 
		 * new - ���� ������� ����, ������ ȣ��
		 * Member - ȣ��Ǵ� ������
		 * 
		 * new Ŭ����();
		 * �ʵ��� �� ���� 
		 * �޼ҵ� ȣ���� ��ü�� ����� �� �ֵ��� �غ��ϴ� ���� ����
		 * 
		 * �⺻ ������(Default Counstructor)
		 * public Ŭ����(){}
		 * ��� Ŭ������ �����ڰ� �ݵ�� �����ϸ� �ϳ� �̻� ���� �� ����
		 * ������ ������ �����ϸ� �����Ϸ��� ������ ���� �⺻ ������ �߰�
		 * 
		 * ����Ʈ ������
		 *  Ŭ���� �ۼ��� �����ڸ� ������ ������ �ڵ��� �޼ҵ尡 ����ִ� �����ڰ� ���������
		 *  �̰��� ����Ʈ ������(default constructor)�̴�
		 *  ��ü�� ��� �ֱ� ������ �������� �ƹ��� ������ ��ġ�� �ʴ´�.
		 *  
		 *  �ҽ����� (Car.java)
		 *  public class Car{
		 *  }
		 *         ��
		 *  ����Ʈ �ڵ� ���� (Car.class)
		 *  public class Car{
		 *  	public Car(){  �ڵ��߰�
		 *  	}
		 *  }
		 *  Car myCar = new Car();
		 */
		

//		class Car{
//			private int speed; // �ӵ�
//			private int gear;  // ���
//			private String color; // ����
//		}
//		
//		public class Car2{  // ����Ʈ ������ public Car(){}
//			public static void main(String[] args) {
//				Car2 c = new Car2();
//			}
//		}
		
		/* ������(Constructor)
		 * [������ ����]
		 * - ����Ʈ ������ ��� �����ڰ� ���� ����
		 * ���� ������ Ŭ����(�Ű�����, �Ű�����..){
		 *	// �ʵ��� �ʱ�ȭ �ڵ�
		 *}
		 *
		 * �����ڰ� ������ ������ ���� �� �����Ϸ��� �⺻ ������ �߰����� ����
		 * public class Car{
		 * 		private String model;
		 * 		private String color;
		 * 		private int maxSpeed;
		 * 
		 *  	public Car(String model, String color, int maxSpeed){
		 *  		...
		 * 		}
		 * }
		 * Car myCar = new Car("�׷���","����",300);
		 */
		
//		class Car3{
//			private int speed;   // �ӵ�
//			private int mileage  // ����Ÿ�
//			private String color; // ����
//			public Car3 (int s, int m, String c) {
//				speed = s;
//				mileage = m;
//				color = c;
//			}
//		}
//		
//		public class CarTest{
//			public static void main(String args[]) {
//			//	Car3 c1 = new Car ();
//				Car3 c2 = new Car (1, 10, "red");
//			}
//		}
		
		/* 
		 * �ʵ� �ʱ�ȭ
		 * - �ʱⰪ ���� ����� �ʵ�� ��ü�� ������ �� �⺻������ �ڵ� ����
		 * 
		 * �ٸ� ������ �ʵ� �ʱ�ȭ �ϴ� ��
		 * - �ʵ� ������ �� �ʱⰪ ����
		 * - �������� �Ű������� �ʱⰪ ����
		 * Address a1 = new Address("ȫ�浿", "010-3425-7854");
		 * Address a2 = new Address("��ö��", "010-8624-1364");
		 * �Ű� ������ �ʵ�� ���� ��� this ���
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
