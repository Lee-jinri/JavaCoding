package Ŭ����;

public class CarMutatorAccessorTest {

	public static void main(String[] args) {
		CarMutatorAccessor myCar = new CarMutatorAccessor();
		
		// �� ���� set
		// myCar.color = ""; // public ���
		myCar.setColor("RED");
		myCar.setGear(1);
		myCar.setSpeed(-70);
		
		// ������ �޼ҵ� ȣ��
		System.out.println("==== ������ �޼ҵ� ȣ�� �ʵ� ��� ====");
		System.out.println("���� �ڵ����� ���� : " + myCar.getColor());
		System.out.println("���� �ڵ����� ��� : " + myCar.getGear());
		System.out.println("���� �ڵ����� �ӵ� : " + myCar.getSpeed());
		
		System.out.println();
		
		System.out.println("==== toString() �޼ҵ�� ��ü �ʵ� ��� ====");
		System.out.println(myCar.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
